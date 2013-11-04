package com.epam.hibernateapp.presentation.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionRedirect;
import org.apache.struts.actions.MappingDispatchAction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epam.hibernateapp.database.exception.DaoException;
import com.epam.hibernateapp.model.Employee;
import com.epam.hibernateapp.presentation.facade.EmployeeFacade;
import com.epam.hibernateapp.presentation.form.EmployeeForm;

public class EmployeeAction extends MappingDispatchAction
{
	private static final Logger log = LoggerFactory.getLogger(EmployeeAction.class);
	private static boolean initialize = false;

	private EmployeeFacade employeeFacade;	

	private static final String EMPLOYEE_LIST_PAGE = "employeeList";
	private static final String MAINPAGE = "mainpage";
	private static final String ERROR_PAGE = "error";
	private static final String PREVIOUS_PAGE = "previousPage";

	public EmployeeAction()
	{
		log.info("com.epam.hibernateapp.presentation.action.EmployeeAction has been created");
	}

	public void setEmployeeFacade(EmployeeFacade employeeFacade)
	{
		this.employeeFacade = employeeFacade;
	}

	public ActionForward employeeList(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) 
	{
		log.debug("com.epam.hibernateapp.presentation.action.EmployeeAction public ActionForward employeeList(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response): actionForm={}", actionForm);
		log.info("EmployeeAction: action=/employee");	
		String target = ERROR_PAGE;
		EmployeeForm employeeForm = (EmployeeForm) actionForm;
		if (null != employeeForm)
		{				
			try 
			{
				long startTime = System.currentTimeMillis();
				List<Employee> employeeList = employeeFacade.getEmployeeList();
				long endTime = System.currentTimeMillis();
				log.debug("Result time of collecting: result={}", endTime - startTime);
				log.trace("Got employeeList={}", employeeList);
				employeeForm.setEmployeeList(employeeList);
//				employeeForm.setEmployeeList(new ArrayList<Employee>());
				target = EMPLOYEE_LIST_PAGE;
			} 
			catch (DaoException e) 
			{
				log.error("Can't collect employee list from database", e);				
			}
			request.getSession().setAttribute(PREVIOUS_PAGE, target);
		}
		else
		{
			log.warn("employeeForm in /employee is null.");
		}
		log.info("/employee action finished.");
		log.debug("actionMapping.findForward(target) in /employee action: target={}", target);
		return actionMapping.findForward(target);
	}

	public ActionForward addContent(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) 
	{
		log.debug("com.epam.hibernateapp.presentation.action.EmployeeAction public ActionForward addContent(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response): actionForm={}", actionForm);
		log.info("EmployeeAction: action=/add");
		String target = MAINPAGE;
		if (!initialize)
		{
			if (!employeeFacade.fillInDatabase())
			{
				target = ERROR_PAGE;
			}
		}		
		request.getSession().setAttribute(PREVIOUS_PAGE, target);
		log.info("/add action finished.");
		log.debug("actionMapping.findForward(target) in /add action: target={}", target);
		return new ActionRedirect(actionMapping.findForward(target));
	}
}
