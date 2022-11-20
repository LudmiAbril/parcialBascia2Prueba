package ar.edu.unlam.pb2;

public class Configurador extends Usuario implements Configurable {

	public Configurador(Integer dni, String nombre, Central central) {
		super(dni, nombre, central);
	}

	@Override
	public void agregarUsuarioAListaDeUsuariosValidosDeUnaAlarma(Integer dniUsuario, Integer idAlarma, String cdConfig)
			throws CodigoConfiguracionIncorrectoException {
		if(this.getCentral().buscarAlarmaPorId(idAlarma).getCodigoConfiguracion().equals(cdConfig)) {
			this.getCentral().buscarAlarmaPorId(idAlarma).agregarUsuariovalido(this.getCentral().buscarUsuarioDni(dniUsuario));
		}else {
			throw new CodigoConfiguracionIncorrectoException("el codigo de cofniguracion es incorrecto");
		}
		
	}

	@Override
	public void agregarSensorALaAlarma(Integer idAlarma, String codConfig, Sensor sensor)
			throws SensorDuplicadoException {
		if(this.getCentral().buscarAlarmaPorId(idAlarma).getCodigoConfiguracion().equals(codConfig)) {
			if(this.getCentral().buscarAlarmaPorId(idAlarma).agregarSensor(sensor)==false) {
				throw new SensorDuplicadoException("el sensor ya esta registrado");
			}
		}
		
	}

	@Override
	public void activarSensorDeAlarma(Integer idSensor, Integer idAlarma, String codConfigAlarma) {
		if(this.getCentral().buscarAlarmaPorId(idAlarma).getCodigoConfiguracion().equals(codConfigAlarma)) {
			this.getCentral().buscarAlarmaPorId(idAlarma).activarSensor(idSensor);
		}
		
	}

	

}
