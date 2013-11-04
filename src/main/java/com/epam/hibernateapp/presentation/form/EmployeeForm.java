package com.epam.hibernateapp.presentation.form;

import java.util.List;

import org.apache.struts.action.ActionForm;

import com.epam.hibernateapp.model.Employee;

public class EmployeeForm extends ActionForm
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6751478713881139548L;
	private List<Employee> employeeList;
	/**
	 * @return the employeeList
	 */
	public List<Employee> getEmployeeList() {
		return employeeList;
	}
	/**
	 * @param employeeList the employeeList to set
	 */
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	
}
