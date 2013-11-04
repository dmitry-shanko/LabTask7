package com.epam.hibernateapp.model;

import java.io.Serializable;
import java.util.Set;

public class Position implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3669431135020371311L;

	private Integer id;
	private String positionName;
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
	 * @return the positionName
	 */
	public String getPositionName() {
		return positionName;
	}

	/**
	 * @param positionName the positionName to set
	 */
	public void setPositionName(String positionName) {
		this.positionName = positionName;
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
		StringBuilder sb = new StringBuilder("Position={id=");
		sb.append(id);
		sb.append("; positionName=");
		sb.append(positionName);
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
