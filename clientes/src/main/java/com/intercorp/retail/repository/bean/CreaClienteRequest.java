package com.intercorp.retail.repository.bean;

import java.io.Serializable;

import com.intercorp.retail.entity.TbCliente;

public class CreaClienteRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3491518917843508779L;

	private TbCliente cliente;

	public TbCliente getCliente() {
		return cliente;
	}

	public void setCliente(TbCliente cliente) {
		this.cliente = cliente;
	}
	
	
}
