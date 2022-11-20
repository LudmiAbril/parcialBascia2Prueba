package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void queSePuedaAgregarUnaAlarmaAlaCentral() {
		Central central=new Central("central-test");
		Alarma alarma=new Alarma(123, "act123", "conf123", "alarmaBeep");
		Usuario admin=new Administrador(22146345,"lali",central);
		
		assertTrue(((Administrador)admin).agregarAlarma(alarma));
	}

}
