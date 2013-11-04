package com.epam.hibernateapp.model;

import java.io.Serializable;

public class Workstation implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4309420873446609241L;
	private Integer id;
	private Office office;
	private Position position;
	private Employee employee;
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
	 * @return the office
	 */
	public Office getOffice() {
		return office;
	}

	/**
	 * @param office the office to set
	 */
	public void setOffice(Office office) {
		this.office = office;
	}

	/**
	 * @return the position
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(Position position) {
		this.position = position;
	}

	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() 
	{
		StringBuilder sb = new StringBuilder("Workstation={id=");
		sb.append(id);
		sb.append("; office=");
		sb.append(office);
		sb.append("; position=");
		sb.append(position);
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
