package com.agilelife.alejosd5;

import static org.junit.Assert.*;

import org.junit.Test;

public class MensajeTest {

	@Test
	public void obtenerMensajeSegunParamentro() {
		Mensaje mensaje = new Mensaje();
		String resultado = mensaje.obtenerMensaje("alejosd5");
		assertEquals("Hola: alejosd5", resultado);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void validarRespuestaMensajeNull(){
		Mensaje mensaje = new Mensaje();
		mensaje.obtenerMensaje(null);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void validarRespuestaMensajeParamentroVacio(){
		Mensaje mensaje = new Mensaje();
		mensaje.obtenerMensaje("");
	}

}
