package com.epam.hibernateapp.database.util;

import org.hibernate.cfg.DefaultNamingStrategy;

public class CustomNamingStrategy extends DefaultNamingStrategy
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4021007185840634832L;

	public String classToTableName(String className)
	{
		return "T_LAB_TASK_7_" + super.classToTableName(className).toUpperCase();
	}

	public String propertyToColumnName(String proName)
	{
		return super.propertyToColumnName(proName);
	}

	public String columnName(String columnName)
	{
		return columnName;
	}

	public String tableName(String tableName)
	{
		return tableName;
	}
}
