package com.agilelife.alejosd5;

public class Mensaje implements IMensaje{

	public Mensaje() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String obtenerMensaje(String nombre) {
		// TODO Auto-generated method stub
		return "Hola"+": "+nombre;
	}

}
