package com.intercorp.retail.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationProperties {

	@Value("${microservicio.name}")
	private String microservicioName;

	@Value("${anio.promedio}")
	private String anioPromedio;

	public String getMicroservicioName() {
		return microservicioName;
	}

	public void setMicroservicioName(String microservicioName) {
		this.microservicioName = microservicioName;
	}
	
	public String getAnioPromedio() {
		return anioPromedio;
	}

	public void setAnioPromedio(String anioPromedio) {
		this.anioPromedio = anioPromedio;
	}
	
	

}
