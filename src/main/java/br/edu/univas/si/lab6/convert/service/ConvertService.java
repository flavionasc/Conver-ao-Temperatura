package br.edu.univas.si.lab6.convert.service;

public class ConvertService {
	
	private ConvertService() {
		//To avoid a new instance of ConvertService class
	}
	
	public static  Float getIndex(Float celsius) {
		return (float)((celsius * 1.8)+32);
		
	}
	
	public static String getDescription(Float convertIndex) {
		//TODO to be implemented as home work
		return "";
	}

}
