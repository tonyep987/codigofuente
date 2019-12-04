package com.intercorp.retail.service;

import com.intercorp.retail.repository.bean.CreaClienteRequest;
import com.intercorp.retail.repository.bean.CreaClienteResponse;
import com.intercorp.retail.repository.bean.ListaClienteResponse;
import com.intercorp.retail.repository.bean.PideClienteResponse;

public interface ClienteService {

	public ListaClienteResponse listaCliente();
	
	public PideClienteResponse pideCliente();
	
	public CreaClienteResponse creaCliente(CreaClienteRequest request);
}
