package com.intercorp.retail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.intercorp.retail.repository.bean.CreaClienteRequest;
import com.intercorp.retail.repository.bean.CreaClienteResponse;
import com.intercorp.retail.repository.bean.ListaClienteResponse;
import com.intercorp.retail.repository.bean.PideClienteResponse;
import com.intercorp.retail.service.ClienteService;

@RestController
@RequestMapping(path = "/rest-api/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping(path="/listclientes", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ListaClienteResponse listaClientes() {
		ListaClienteResponse clientes = new ListaClienteResponse();
		
		clientes = clienteService.listaCliente();
		
		return clientes;
	}
	
	@GetMapping(path="/kpideclientes", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody PideClienteResponse pideClientes() {
		PideClienteResponse pideCliente = new PideClienteResponse();
		
		pideCliente = clienteService.pideCliente();
		
		return pideCliente;
	}
	
	@PostMapping(path="/creacliente", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody CreaClienteResponse creaClientes(@RequestBody CreaClienteRequest request) {
		CreaClienteResponse creaCliente = new CreaClienteResponse();
		
		creaCliente = clienteService.creaCliente(request);
		
		return creaCliente;
	}
}
