package ar.edu.unlam.pb2;



public class Accion implements Comparable<Accion> {
	private Integer idDeAccion;
	private Alarma alarmaSobreLaQueSeOpera;
	private Usuario usuarioQueRealizaLaAccion;
	private String fecha;
	private TipoOperacion tipoDeOperacion;
	
	
	public Accion(Integer idDeAccion, Alarma alarmaSobreLaQueSeOpera, Usuario usuarioQueRealizaLaAccion, String fecha,
			TipoOperacion tipoDeOperacion) {
		this.idDeAccion = idDeAccion;
		this.alarmaSobreLaQueSeOpera = alarmaSobreLaQueSeOpera;
		this.usuarioQueRealizaLaAccion = usuarioQueRealizaLaAccion;
		this.fecha = fecha;
		this.tipoDeOperacion = tipoDeOperacion;
	}

	public Integer getIdDeAccion() {
		return idDeAccion;
	}

	public void setIdDeAccion(Integer idDeAccion) {
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

	@Override
	public int compareTo(Accion o) {
		if(this.idDeAccion>o.getIdDeAccion()) {
			return 1;
		}
		if(this.idDeAccion<o.getIdDeAccion()) {
			return -1;
		} return 0;
	}


	
	
	
	
	

}
