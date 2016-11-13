package com.agilelife.alejosd5;

import static org.junit.Assert.*;

import org.junit.Test;

public class MensajeTest {

	@Test
	public void obtenerMensajeSegunParamentro() {
		Mensaje mensaje = new Mensaje();
		String resultado = mensaje.obtenerMensaje("alejosd5");
		assertNotNull(resultado);
		assertEquals("Hola: alejosd5", resultado);
	}

}
