package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class test {

	@Test
	public void queSePuedaAgregarUnaAlarmaAlaCentral() {
		Central central=new Central("central-test");
		Alarma alarma=new Alarma(123, "act123", "conf123", "alarmaBeep");
		Usuario admin=new Administrador(22146345,"lali",central);
		
		assertTrue(((Administrador)admin).agregarAlarma(alarma));
	}
	
	@Test
	public void queSePuedaAgregarUnUsuarioConfiguradorAUnaAlarma() {
		Central central=new Central("central-test");
		Usuario admin=new Administrador(22146345,"lali",central);
		Usuario configurador=new Configurador(123456789,"pepe",central);
		
		
        assertTrue(((Administrador)admin).AgregarUsuario(configurador));
	}

	@Test (expected = CodigoConfiguracionIncorrectoException.class)
	public void queAlAgregarUnUsuarioValidoAUnaAlarmaConUnCodigoDeConfiguracionInvalidoSeLanceCodigoInvalidoException() throws CodigoConfiguracionIncorrectoException {
		Central central=new Central("central-test");
		Alarma alarma=new Alarma(123, "act123", "conf123", "alarmaBeep");
		Usuario admin=new Administrador(22146345,"lali",central);
		Usuario usuario=new Usuario(123456789,"ari",central);
		
		((Administrador)admin).agregarAlarma(alarma);
		((Administrador)admin).agregarUsuarioAListaDeUsuariosValidosDeUnaAlarma(usuario.getDNI(), alarma.getIdAlarma(), "codinvalido");
		
	}
	
	@Test (expected = SensorDuplicadoException.class)
	public void alAgregarUnSensorDuplicadoAUnaAlarmaSeLanceSensorDuplicadoException() throws SensorDuplicadoException{
		Central central=new Central("central-test");
		Alarma alarma=new Alarma(123, "act123", "conf123", "alarmaBeep");
		Usuario admin=new Administrador(22146345,"lali",central);
		Sensor sensor=new Sensor(111);
		
		((Administrador)admin).agregarAlarma(alarma);
		((Administrador)admin).agregarSensorALaAlarma(alarma.getIdAlarma(), alarma.getCodigoConfiguracion(), sensor);
		((Administrador)admin).agregarSensorALaAlarma(alarma.getIdAlarma(), alarma.getCodigoConfiguracion(), sensor);
	}
	
	@Test 
	public void queNoSePuedaActivarUnaAlarmaSiHayAlMenosUnSensorDesactivado() throws SensorDuplicadoException {
		Central central=new Central("central-test");
		Alarma alarma=new Alarma(123, "act123", "conf123", "alarmaBeep");
		Usuario admin=new Administrador(22146345,"lali",central);
		Sensor sensor=new Sensor(111);
		
		((Administrador)admin).agregarAlarma(alarma);
		((Administrador)admin).agregarSensorALaAlarma(alarma.getIdAlarma(), alarma.getCodigoConfiguracion(), sensor);
		assertFalse(((Administrador)admin).activarDesactivarAlarma(alarma, alarma.getCodActivacionODesactivacion()));
	}
	
	@Test
	public void queParaUnaAlarmaDeterminadaSePuedaObtenerUnaListaDeAcciones(){
		Central central=new Central("central-test");
		Alarma alarma=new Alarma(123, "act123", "conf123", "alarmaBeep");
		Usuario admin=new Administrador(22146345,"lali",central);
		
		Accion accion1=new Accion(1,alarma,admin,"20/11/22",TipoOperacion.CONFIGURACION);
		alarma.registrarAccion(accion1);
		
		Accion accion2=new Accion(2,alarma,admin,"20/11/22",TipoOperacion.CONFIGURACION);
		alarma.registrarAccion(accion2);
		
		Accion accion3=new Accion(3,alarma,admin,"20/11/22",TipoOperacion.CONFIGURACION);
		alarma.registrarAccion(accion3);
		
		List<Accion> accionesPorOrden=new ArrayList<Accion>();
		accionesPorOrden.add(accion1);
		accionesPorOrden.add(accion2);
		accionesPorOrden.add(accion3);
		
		List<Accion>accionesObtenidas=new ArrayList<Accion>();
		accionesObtenidas.addAll(alarma.getAccionesRealizadas());
		
		assertEquals(accionesPorOrden,accionesObtenidas);
		
	}
	
}
