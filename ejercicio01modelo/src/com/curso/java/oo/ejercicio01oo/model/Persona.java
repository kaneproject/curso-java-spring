package com.curso.java.oo.ejercicio01oo.model;

public class Persona
{
	private
		String DNI, nombre, apellido1, apellido2, direccion, fechaDeNacimiento;
	
	
	
		public String getDNI()
		{
			return DNI;
		}
		public void setDNI(String dNI)
		{
			DNI = dNI;
		}
		public String getNombre()
		{
			return nombre;
		}
		public void setNombre(String nombre)
		{
			this.nombre = nombre;
		}
		public String getApellido1()
		{
			return apellido1;
		}
		public void setApellido1(String apellido1)
		{
			this.apellido1 = apellido1;
		}
		public String getApellido2()
		{
			return apellido2;
		}
		public void setApellido2(String apellido2)
		{
			this.apellido2 = apellido2;
		}
		public String getDireccion()
		{
			return direccion;
		}
		public void setDireccion(String direccion)
		{
			this.direccion = direccion;
		}
		public String getFechaDeNacimiento()
		{
			return fechaDeNacimiento;
		}
		public void setFechaDeNacimiento(String fechaDeNacimiento)
		{
			this.fechaDeNacimiento = fechaDeNacimiento;
		}
}
