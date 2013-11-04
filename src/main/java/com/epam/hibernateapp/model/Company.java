package com.epam.hibernateapp.model;

import java.io.Serializable;
import java.util.Set;

public class Company implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3317426145107108444L;
	
	private Integer id;	
	private String companyName;
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
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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
		StringBuilder sb = new StringBuilder("Company={id=");
		sb.append(id);
		sb.append("; companyName=");
		sb.append(companyName);
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
