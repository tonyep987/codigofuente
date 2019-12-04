package com.intercorp.retail.model;

import java.io.Serializable;
import java.util.Date;

public class Cliente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9150628378210642473L;

	private String idcliente;
	private String nombre;
	private String apellido;
	private Integer edad;
	private Date fechanacimiento;
	private Date fechaPosibleMuerte;
	
	public String getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(String idcliente) {
		this.idcliente = idcliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Date getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public Date getFechaPosibleMuerte() {
		return fechaPosibleMuerte;
	}
	public void setFechaPosibleMuerte(Date fechaPosibleMuerte) {
		this.fechaPosibleMuerte = fechaPosibleMuerte;
	}
	
	
}
