package com.epam.hibernateapp.model;

import java.io.Serializable;
import java.util.Set;

public class Address implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -527383388957926526L;
	
	private Integer id;
	private String address;
	private City city;
	private Set<Employee> employees;
	private Set<Office> offices;

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
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the city
	 */
	public City getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(City city) {
		this.city = city;
	}


	/**
	 * @return the employees
	 */
	public Set<Employee> getEmployees() {
		return employees;
	}

	/**
	 * @param employees the employees to set
	 */
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	/**
	 * @return the offices
	 */
	public Set<Office> getOffices() {
		return offices;
	}

	/**
	 * @param offices the offices to set
	 */
	public void setOffices(Set<Office> offices) {
		this.offices = offices;
	}

	@Override
	public String toString() 
	{
		StringBuilder sb = new StringBuilder("Address={id=");
		sb.append(id);
		sb.append("; address=");
		sb.append(address);
		sb.append("; city=");
		sb.append(city);
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
