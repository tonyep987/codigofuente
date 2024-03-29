package com.intercorp.retail.repository.bean;

import java.io.Serializable;

public class PideClienteResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7211700522786728725L;

	private Double promedio;
	private Double desviacionEstandar;
	private Integer totalClientes;
	private String codigoRespuesta;
	private String descripcionRespuesta;
	
	public Double getPromedio() {
		return promedio;
	}
	public void setPromedio(Double promedio) {
		this.promedio = promedio;
	}
	public Double getDesviacionEstandar() {
		return desviacionEstandar;
	}
	public void setDesviacionEstandar(Double desviacionEstandar) {
		this.desviacionEstandar = desviacionEstandar;
	}
	public Integer getTotalClientes() {
		return totalClientes;
	}
	public void setTotalClientes(Integer totalClientes) {
		this.totalClientes = totalClientes;
	}
	public String getCodigoRespuesta() {
		return codigoRespuesta;
	}
	public void setCodigoRespuesta(String codigoRespuesta) {
		this.codigoRespuesta = codigoRespuesta;
	}
	public String getDescripcionRespuesta() {
		return descripcionRespuesta;
	}
	public void setDescripcionRespuesta(String descripcionRespuesta) {
		this.descripcionRespuesta = descripcionRespuesta;
	}
	
	
}
