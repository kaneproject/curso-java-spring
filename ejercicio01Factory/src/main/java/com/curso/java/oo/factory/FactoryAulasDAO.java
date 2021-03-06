package com.curso.java.oo.factory;

import com.curso.java.oo.dao.IEjercicio01DAO;

public class FactoryAulasDAO
{
	public static IEjercicio01DAO getAulaDAOInstance(String nombreImplementacion) throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		if (nombreImplementacion == "AulaListDAO")
		{
			return (IEjercicio01DAO) Class.forName("com.curso.java.oo.maven.AulaListDAO").newInstance();
		}
		else
		{
			return (IEjercicio01DAO) Class.forName("com.curso.java.oo.maven.AulaMapDAO").newInstance();
		}
	}
}
