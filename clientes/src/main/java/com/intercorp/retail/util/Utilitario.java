package com.intercorp.retail.util;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Utilitario { 
	    public  Double hallarDesviacionEstandar(Double[] cadenaDeNumeros){
	    			double sum=0;
	    			double finalsum = 0;
	    			double average = 0;
	    			for( double i : cadenaDeNumeros) {
	    			finalsum = (sum += i);
	    			}
	    			average = finalsum/(cadenaDeNumeros.length);
	    			double sumX=0;
	    			double finalsumX=0;
	    			double[] x1_average = new double[2000];
	    			for (int i = 0; i<cadenaDeNumeros.length; i++){
	    			double fvalue = (Math.pow((cadenaDeNumeros[i] - average), 2));
	    			x1_average[i]= fvalue;
	    			}
	    			for(double i : x1_average) {
	    			finalsumX = (sumX += i);
	    			}
	    			Double AverageX = finalsumX/(cadenaDeNumeros.length);
	    			double SquareRoot = Math.sqrt(AverageX);
	    			return SquareRoot;
	    }

}
