package ar.edu.unlam.pb2;

import java.util.Map;

public class Activador extends Usuario implements Activable {

	public Activador(Integer dni, String nombre, Central central) {
		super(dni, nombre, central);
	}

	@Override
	public Boolean activarDesactivarAlarma(Alarma alarma, String CodigoActivacionAlarma) {
		if(alarma.getCodActivacionODesactivacion().equals(CodigoActivacionAlarma)) {
			return alarma.ActivarDesactivar();
		}return false;
	}

}
