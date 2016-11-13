package com.agilelife.alejosd5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MensajeTest {
	
	private Mensaje mensaje;
	
	@Before
	public void setup(){
		System.out.println("setup");
		mensaje = new Mensaje();
	}

	@Test
	public void obtenerMensajeSegunParamentro() {
		System.out.println("obtenerMensajeSegunParamentro");
		String resultado = mensaje.obtenerMensaje("alejosd5");
		assertEquals("Hola: alejosd5", resultado);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void validarRespuestaMensajeNull(){
		System.out.println("validarRespuestaMensajeNull");
		mensaje.obtenerMensaje(null);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void validarRespuestaMensajeParamentroVacio(){
		System.out.println("validarRespuestaMensajeParamentroVacio");
		mensaje.obtenerMensaje("");
	}
	
	@After
	public void tearDown(){
		System.out.println("tearDown");
		mensaje = null;
	}

}
