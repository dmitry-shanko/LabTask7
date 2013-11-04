package com.epam.hibernateapp.model;

import java.io.Serializable;
import java.util.Set;

public class Office implements Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8069853538152577084L;
	private Integer id;
	private Address address;
	private Company company;
	private Set<Workstation> workstations;
	private Integer employeesNumber;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the company
	 */
	public Company getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(Company company) {
		this.company = company;
	}

	/**
	 * @return the workstations
	 */
	public Set<Workstation> getWorkstations() {
		return workstations;
	}

	/**
	 * @param workstations the workstations to set
	 */
	public void setWorkstations(Set<Workstation> workstations) {
		this.workstations = workstations;
	}

	/**
	 * @return the employeesNumber
	 */
	public Integer getEmployeesNumber() {
		return employeesNumber;
	}

	/**
	 * @param employeesNumber the employeesNumber to set
	 */
	public void setEmployeesNumber(Integer employeesNumber) {
		this.employeesNumber = employeesNumber;
	}

	@Override
	public String toString() 
	{
		StringBuilder sb = new StringBuilder("Office={id=");
		sb.append(id);
		sb.append("; company=");
		sb.append(company);
		sb.append("; employeesNumber=");
		sb.append(employeesNumber);
		sb.append(".}.");
		return sb.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}


}
