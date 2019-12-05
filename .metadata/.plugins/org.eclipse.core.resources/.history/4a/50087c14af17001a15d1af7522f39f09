package com.intercorp.retail.util;

public class Utilitario {

	 public Double hallarPromedio(Double[] cadenaDeNumeros){
	        if(cadenaDeNumeros == null){
	            System.out.println("la cadena de numeros es nula, no puedo hallar elpromedio");
	            return null;
	        }
	        //***hallar cantidad de datos
	        Integer qNumeros = cadenaDeNumeros.length;
	        Double sumatoria = 0.0;
	        //***hallar sumatoria
	        sumatoria = this.hallarSumatoria(cadenaDeNumeros);
	        //***hallar Promedio
	        Double promedio = sumatoria / qNumeros;
	        return promedio;
	    }
	    
	    public Double[] hallarCuadradoDelValorAbsolutoDeLasDistanciasAlPromedio(Double[] cadenaDeNumeros, Double promedio){
	        if(cadenaDeNumeros == null){
	            System.out.println("la cadena de numeros es nula, no puedo hallar la distancia al promedio");
	            return null;
	        }
	        Double[] distanciasAlPromedio = new Double[cadenaDeNumeros.length];
	        for (int i = 0; i < cadenaDeNumeros.length; i++) {
	            Double numeroActual = cadenaDeNumeros[i];
	            Double distancia = numeroActual - promedio;
//	            System.out.println("distancia "+distancia);
	            Double distanciaAbsoluto = Math.abs(distancia);
	            Double cuadradoDelAbsoluto = Math.pow(distanciaAbsoluto, 2);
	            distanciasAlPromedio[i] = cuadradoDelAbsoluto;
//	            System.out.println("cuadradoDelAbsoluto "+cuadradoDelAbsoluto);
	        }
	        return distanciasAlPromedio;
	    }
	    
	    public Double hallarSumatoria(Double[] distanciasAlpromedio){
	        if(distanciasAlpromedio == null){
	            System.out.println("Error, las distanciasAlpromedio es nula, no puedo hallar la sumatoria");
	            return null;
	        }
	        Double sumatoria = 0.0;
	        for (int i = 0; i < distanciasAlpromedio.length; i++) {
	            Double distancia = distanciasAlpromedio[i];
	            sumatoria += distancia;
	        }
	        return sumatoria;
	    }
	    
	    public Double hallarDesviacionEstandar(Double[] cadenaDeNumeros){
	        Double desviacionEstandar = 0.0;
	        if(cadenaDeNumeros == null){
	            System.out.println("la cadena de numeros es nula, no puedo hallar la desviacion estandar");
	            return null;
	        }
	        //***hallar cantidad de datos
	        Integer qNumeros = cadenaDeNumeros.length;
	        //***hallar Promedio
	        Double promedio = this.hallarPromedio(cadenaDeNumeros);
//	        System.out.println("Promedio "+promedio);
	        //***hallar el cuadrado del valor absoluto de la distancia de cada dato al promedio
	        Double[] cuadradoDelAbsolutoDeLasdistanciasAlPromedio = this.hallarCuadradoDelValorAbsolutoDeLasDistanciasAlPromedio(cadenaDeNumeros, promedio);
	        //***hallar la sumatoria del conjunto de datos resultado del anterior paso
	        Double sumatoriaDelCuadradoDelAbsolutoDeLaDist = this.hallarSumatoria(cuadradoDelAbsolutoDeLasdistanciasAlPromedio);
//	        System.out.println("sumatoriaCuadrados "+sumatoriaDelCuadradoDelAbsolutoDeLaDist);
	        //***dividir la sumatoria sobre la cantidad de datos dada al inicio
	        Double divisionSumatoriaCuadradoYQNumeros = sumatoriaDelCuadradoDelAbsolutoDeLaDist / qNumeros;
//	        System.out.println("divisionSumatoriaCuadrados "+divisionSumatoriaCuadradoYQNumeros);
	        //***hallar la raiz cuadrada de ese valor
	        desviacionEstandar = Math.sqrt(divisionSumatoriaCuadradoYQNumeros);
	        return desviacionEstandar;
	    }
	    
	    public Double hallarLimiteSuperior(Double porcentajePromedio, Double desviacionEstandar){
	        Double limiteSuperior = 0.0;
	        limiteSuperior = porcentajePromedio + (desviacionEstandar * 3.9);
	        return limiteSuperior;
	    }
	    
	    public Double hallarLimiteInferior(Double porcentajePromedio, Double desviacionEstandar){
	        Double limiteSuperior = 0.0;
	        limiteSuperior = porcentajePromedio - (desviacionEstandar * 3.9) ;
	        return limiteSuperior;
	    }
}
