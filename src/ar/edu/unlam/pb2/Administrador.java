package ar.edu.unlam.pb2;

public class Administrador extends Usuario implements Configurable, Activable {

	public Administrador(Integer dni, String nombre, Central central) {
		super(dni, nombre, central);
		
	}
	
	public Boolean agregarAlarma(Alarma alarma) {
		return this.getCentral().guardarAlarma(alarma);
	}
	
	public Boolean AgregarUsuario(Usuario usuario) {
		if(usuario instanceof Configurador || usuario instanceof Activador) {
			return this.getCentral().guardarUsuario(usuario);
		}return false;
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
	
	@Override
	public Boolean activarDesactivarAlarma(Alarma alarma, String CodigoActivacionAlarma) {
		if(alarma.getCodActivacionODesactivacion().equals(CodigoActivacionAlarma)) {
			return alarma.ActivarDesactivar();
		}return false;
	}
	
	


}
