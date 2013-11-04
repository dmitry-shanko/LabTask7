package com.epam.hibernateapp.presentation.facade;

import java.util.List;

import com.epam.hibernateapp.database.exception.DaoException;
import com.epam.hibernateapp.model.Employee;

public interface EmployeeFacade
{

	void saveOrUpdate(Employee o) throws DaoException;
	Employee get(Integer id) throws DaoException;
	List<Employee> getEmployeeList() throws DaoException;
	boolean fillInDatabase();
}
