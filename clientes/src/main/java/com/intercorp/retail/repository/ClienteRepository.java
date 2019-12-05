package com.intercorp.retail.repository;

import com.intercorp.retail.repository.bean.CreaClienteRequest;
import com.intercorp.retail.repository.bean.CreaClienteResponse;
import com.intercorp.retail.repository.bean.ListaClienteResponse;

public interface ClienteRepository{

	CreaClienteResponse crearCliente(CreaClienteRequest request);
	
	ListaClienteResponse listaCliente();
}
