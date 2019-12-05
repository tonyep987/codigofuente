package com.intercorp.retail.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class TbCliente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idcliente")
	private String idcliente;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "edad")
	private Integer edad;
	
	@Column(name = "fechanacimiento")
	private Timestamp fechanacimiento;

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

	public Timestamp getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(Timestamp fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	
}
