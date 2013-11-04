package com.epam.hibernateapp.model;

import java.io.Serializable;
import java.util.Set;

public class City implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6314931522206213756L;
	
	private Integer id;	
	private String cityName;	
	private Country country;
	private Set<Address> addresses;
	
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
	 * @return the cityName
	 */
	public String getCityName() 
	{
		return cityName;
	}
	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) 
	{
		this.cityName = cityName;
	}	
	/**
	 * @return the country
	 */
	public Country getCountry() 
	{
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(Country country) 
	{
		this.country = country;
	}
	
	/**
	 * @return the addresses
	 */
	public Set<Address> getAddresses() {
		return addresses;
	}
	/**
	 * @param addresses the addresses to set
	 */
	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}
	@Override
	public String toString() 
	{
		StringBuilder sb = new StringBuilder("City={id=");
		sb.append(id);
		sb.append("; cityName=");
		sb.append(cityName);
		sb.append("; country=");
		sb.append(country);
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
