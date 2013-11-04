package com.epam.hibernateapp.presentation.facade;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.epam.hibernateapp.database.GeneralDao;
import com.epam.hibernateapp.database.exception.DaoException;
import com.epam.hibernateapp.model.Employee;
import com.epam.hibernateapp.presentation.service.DatabaseService;

@Transactional(propagation = Propagation.NESTED, readOnly = true)
public class EmployeeFacadeImpl implements EmployeeFacade
{
	private GeneralDao<Employee, Integer> employeeDao;
	private DatabaseService databaseService;
	/**
	 * @param employeeDao the employeeDao to set
	 */
	public void setEmployeeDao(GeneralDao<Employee, Integer> employeeDao) 
	{
		this.employeeDao = employeeDao;
	}
	/**
	 * @param databaseService the databaseService to set
	 */
	public void setDatabaseService(DatabaseService databaseService) 
	{
		this.databaseService = databaseService;
	}
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	@Override
	public void saveOrUpdate(Employee o) throws DaoException 
	{
		employeeDao.add(o);
	}
	
	@Override
	public Employee get(Integer id) throws DaoException
	{
		Employee employee = employeeDao.get(id);
		return employee;
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	@Override
	public List<Employee> getEmployeeList() throws DaoException 
	{
		return employeeDao.getAll();
	}
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	@Override
	public boolean fillInDatabase()
	{
		return databaseService.fillInDatabase();
	}
}
