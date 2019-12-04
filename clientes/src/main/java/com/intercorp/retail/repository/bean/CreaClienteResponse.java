package com.intercorp.retail.repository.bean;

import java.io.Serializable;

public class CreaClienteResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8830864837827974403L;
	
	private String codigoRespuesta;
	private String descripcionRespuesta;
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
