package com.epam.hibernateapp.model;

import java.io.Serializable;
import java.util.Set;

public class Country implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2826071916576642791L;
	
	private Integer id;	
	private String countryName;	
	private Set<City> cities;
	
	/**
	 * @return the id
	 */
	public Integer getId() 
	{
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) 
	{
		this.id = id;
	}
	/**
	 * @return the countryName
	 */
	public String getCountryName() 
	{
		return countryName;
	}
	/**
	 * @param countryName the countryName to set
	 */
	public void setCountryName(String countryName) 
	{
		this.countryName = countryName;
	}
	/**
	 * @return the cities
	 */
	public Set<City> getCities() 
	{
		return cities;
	}
	/**
	 * @param cities the cities to set
	 */
	public void setCities(Set<City> cities) 
	{
		this.cities = cities;
	}

	@Override
	public String toString() 
	{
		StringBuilder sb = new StringBuilder("Country={id=");
		sb.append(id);
		sb.append("; countryName=");
		sb.append(countryName);;
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
