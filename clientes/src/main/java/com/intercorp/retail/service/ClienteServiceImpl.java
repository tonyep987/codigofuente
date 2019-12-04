package com.intercorp.retail.service;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intercorp.retail.config.ApplicationProperties;
import com.intercorp.retail.model.Cliente;
import com.intercorp.retail.repository.ClienteRepository;
import com.intercorp.retail.repository.bean.CreaClienteRequest;
import com.intercorp.retail.repository.bean.CreaClienteResponse;
import com.intercorp.retail.repository.bean.ListaClienteResponse;
import com.intercorp.retail.repository.bean.PideClienteResponse;
import com.intercorp.retail.util.Utilitario;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
    private ApplicationProperties properties;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	private Utilitario utilitario;
	/**@Autowired
	private Gson gson;*/
	
	@Override
	public ListaClienteResponse listaCliente() {
		ListaClienteResponse clientes = new ListaClienteResponse();
		
		long tiempoInicio = System.currentTimeMillis();
		
		try {
			clientes = clienteRepository.listaCliente();
			//clientes.getListaCliente()
			Calendar calendar = Calendar.getInstance();
			int i = 0;
			for(Cliente cliente : clientes.getListaCliente()) {
				calendar.setTime(cliente.getFechanacimiento()); 
			    calendar.add(Calendar.YEAR, Integer.parseInt(properties.getAnioPromedio()));
				clientes.getListaCliente().get(i).setFechaPosibleMuerte(calendar.getTime());
				i++;
			}
			
			//double xAvg = points.stream().mapToDouble( p -> p.x).average().getAsDouble();
			double xAvg = clientes.getListaCliente().stream().mapToDouble( p -> p.getEdad()).average().getAsDouble();
			//	double xDve = clientes.getListaCliente().stream().mapToDouble( p -> p.getEdad()). .getAsDouble();
			
		}catch(Exception e) {
			
		}
		
		
		return clientes;
	}

	@Override
	public PideClienteResponse pideCliente() {
		ListaClienteResponse clientes = new ListaClienteResponse();
		PideClienteResponse pideClienteResponse = new PideClienteResponse();
		long tiempoInicio = System.currentTimeMillis();
		
		try {
			clientes = clienteRepository.listaCliente();
			double xAvg = 0.0;
			double xDe = 0.0;
			Double array[] = new Double[clientes.getListaCliente().size()];
			int i = 0;
			for(Cliente cliente : clientes.getListaCliente()) {
				array[i]  =  Double.parseDouble(String.valueOf(cliente.getEdad()));
				i++;
			}
			xDe = utilitario.hallarDesviacionEstandar(array);
			xAvg = clientes.getListaCliente().stream().mapToDouble( p -> p.getEdad()).average().getAsDouble();
			//double xAvg = points.stream().mapToDouble( p -> p.x).average().getAsDouble();
			pideClienteResponse.setCodigoRespuesta("200");
			pideClienteResponse.setDescripcionRespuesta("Exito");
			pideClienteResponse.setDesviacionEstandar(xDe);
			pideClienteResponse.setPromedio(xAvg);
			pideClienteResponse.setTotalClientes(clientes.getListaCliente().size());
			//	double xDve = clientes.getListaCliente().stream().mapToDouble( p -> p.getEdad()). .getAsDouble();
			
		}catch(Exception e) {
			
		}
		
		return pideClienteResponse;
	}

	@Override
	public CreaClienteResponse creaCliente(CreaClienteRequest request) {

		CreaClienteResponse creaClienteResponse = new CreaClienteResponse();
		long tiempoInicio = System.currentTimeMillis();
		try {
			creaClienteResponse = clienteRepository.crearCliente(request);
			
		}catch(Exception e) {
			
		}
		
		return creaClienteResponse;
	}

}
