package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Alarma {
	private Integer idAlarma;
	private String codActivacionODesactivacion;
	private String codigoConfiguracion;
	private String nombreAlarma;
	private Set<Usuario>usuariosValidosParaOperar;
	private Set<Accion>accionesRealizadas;
	private Set <Sensor> listaDeSensores;
	
	public Alarma(Integer idAlarma, String codActivacionODesactivacion, String codigoConfiguracion, String nombreAlarma) {
		this.idAlarma = idAlarma;
		this.codActivacionODesactivacion = codActivacionODesactivacion;
		this.codigoConfiguracion = codigoConfiguracion;
		this.nombreAlarma = nombreAlarma;
		this.usuariosValidosParaOperar = new HashSet<Usuario>();
		this.accionesRealizadas = new TreeSet<Accion>();
		this.listaDeSensores= new TreeSet<Sensor>();
	}
	
	public void activarSensor(Integer idSensor) {
		for(Sensor e:this.listaDeSensores) {
			if(e.getIdSensor().equals(idSensor)) {
				e.setEstado(true);
			}
		}
	}
	
	public Boolean agregarSensor(Sensor sensor) {
		return this.listaDeSensores.add(sensor);
	}
	
	public boolean agregarUsuariovalido(Usuario usuario) {
		return this.usuariosValidosParaOperar.add(usuario);
	}
	
	public boolean ActivarDesactivar() {
		for(Sensor e: this.listaDeSensores) {
			if(e.getEstado()==false) {
				return false;
			}
		} 
		return true;
	}
	
	public void registrarAccion(Accion accion) {
		this.accionesRealizadas.add(accion);
	}

	public Integer getIdAlarma() {
		return idAlarma;
	}

	public void setIdAlarma(Integer idAlarma) {
		this.idAlarma = idAlarma;
	}

	public String getCodActivacionODesactivacion() {
		return codActivacionODesactivacion;
	}

	public void setCodActivacionODesactivacion(String codActivacionODesactivacion) {
		this.codActivacionODesactivacion = codActivacionODesactivacion;
	}

	public String getCodigoConfiguracion() {
		return codigoConfiguracion;
	}

	public void setCodigoConfiguracion(String codigoConfiguracion) {
		this.codigoConfiguracion = codigoConfiguracion;
	}

	public String getNombreAlarma() {
		return nombreAlarma;
	}

	public void setNombreAlarma(String nombreAlarma) {
		this.nombreAlarma = nombreAlarma;
	}

	public Set<Usuario> getUsuariosValidosParaOperar() {
		return usuariosValidosParaOperar;
	}

	public void setUsuariosValidosParaOperar(Set<Usuario> usuariosValidosParaOperar) {
		this.usuariosValidosParaOperar = usuariosValidosParaOperar;
	}

	public Set<Accion> getAccionesRealizadas() {
		return accionesRealizadas;
	}

	public void setAccionesRealizadas(Set<Accion> accionesRealizadas) {
		this.accionesRealizadas = accionesRealizadas;
	}

	public Set<Sensor> getListaDeSensores() {
		return listaDeSensores;
	}

	public void setListaDeSensores(Set<Sensor> listaDeSensores) {
		this.listaDeSensores = listaDeSensores;
	}

	
	
	
	

}
