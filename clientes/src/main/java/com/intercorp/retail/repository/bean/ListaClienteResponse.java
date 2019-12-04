package com.intercorp.retail.repository.bean;

import java.io.Serializable;
import java.util.List;

import com.intercorp.retail.entity.TbCliente;
import com.intercorp.retail.model.Cliente;

public class ListaClienteResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3797704292667779484L;

	private List<Cliente> listaCliente;
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

	public List<Cliente> getListaCliente() {
		return listaCliente;
	}

	public void setListaCliente(List<Cliente> listaCliente) {
		this.listaCliente = listaCliente;
	}
	
	
	
}
