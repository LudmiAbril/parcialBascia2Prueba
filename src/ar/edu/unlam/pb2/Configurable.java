package ar.edu.unlam.pb2;

public interface Configurable {
	
abstract void agregarUsuarioAListaDeUsuariosValidosDeUnaAlarma(Integer dniUsuario, Integer idAlarma, String cdConfig) throws CodigoConfiguracionIncorrectoException;
abstract void agregarSensorALaAlarma(Integer idAlarma, String codConfig, Sensor sensor) throws SensorDuplicadoException;
abstract void activarAlarma(Integer idSensor, Integer idAlarma,String codConfigAlarma);
}
