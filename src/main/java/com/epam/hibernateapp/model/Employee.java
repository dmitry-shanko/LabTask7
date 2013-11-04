package com.epam.hibernateapp.model;

import java.io.Serializable;
import java.util.Set;

public class Employee implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3532034336749563724L;
	private Integer id;
	private String firstName;
	private String lastName;
	private Address address;
	private Set<Workstation> workstations;
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
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	@Override
	public String toString() 
	{
		StringBuilder sb = new StringBuilder("Employee={id=");
		sb.append(id);
		sb.append("; firstName=");
		sb.append(firstName);
		sb.append("; lastName=");
		sb.append(lastName);
		sb.append("; address=");
		sb.append(address);
		sb.append("; workstations=");
		sb.append(workstations);
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
