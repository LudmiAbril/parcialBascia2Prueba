package ar.edu.unlam.pb2;



public class Accion {
	private String idDeAccion;
	private Alarma alarmaSobreLaQueSeOpera;
	private Usuario usuarioQueRealizaLaAccion;
	private String fecha;
	private TipoOperacion tipoDeOperacion;
	
	
	public Accion(String idDeAccion, Alarma alarmaSobreLaQueSeOpera, Usuario usuarioQueRealizaLaAccion, String fecha,
			TipoOperacion tipoDeOperacion) {
		this.idDeAccion = idDeAccion;
		this.alarmaSobreLaQueSeOpera = alarmaSobreLaQueSeOpera;
		this.usuarioQueRealizaLaAccion = usuarioQueRealizaLaAccion;
		this.fecha = fecha;
		this.tipoDeOperacion = tipoDeOperacion;
	}

	public String getIdDeAccion() {
		return idDeAccion;
	}

	public void setIdDeAccion(String idDeAccion) {
		this.idDeAccion = idDeAccion;
	}

	public Alarma getAlarmaSobreLaQueSeOpera() {
		return alarmaSobreLaQueSeOpera;
	}

	public void setAlarmaSobreLaQueSeOpera(Alarma alarmaSobreLaQueSeOpera) {
		this.alarmaSobreLaQueSeOpera = alarmaSobreLaQueSeOpera;
	}

	public Usuario getUsuarioQueRealizaLaAccion() {
		return usuarioQueRealizaLaAccion;
	}

	public void setUsuarioQueRealizaLaAccion(Usuario usuarioQueRealizaLaAccion) {
		this.usuarioQueRealizaLaAccion = usuarioQueRealizaLaAccion;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public TipoOperacion getTipoDeOperacion() {
		return tipoDeOperacion;
	}

	public void setTipoDeOperacion(TipoOperacion tipoDeOperacion) {
		this.tipoDeOperacion = tipoDeOperacion;
	}


	
	
	
	
	

}
