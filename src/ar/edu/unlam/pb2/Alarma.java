package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Alarma {
	private Integer idAlarma;
	private String codActivacionODesactivacion;
	private String codigoConfiguracion;
	private String nombreAlarma;
	private Set<Usuario>usuariosValidosParaOperar;
	private Set<Accion>accionesRealizadas;
	private Map <Integer,Sensor> listaDeSensores;
	
	public Alarma(Integer idAlarma, String codActivacionODesactivacion, String codigoConfiguracion, String nombreAlarma) {
		this.idAlarma = idAlarma;
		this.codActivacionODesactivacion = codActivacionODesactivacion;
		this.codigoConfiguracion = codigoConfiguracion;
		this.nombreAlarma = nombreAlarma;
		this.usuariosValidosParaOperar = new HashSet<Usuario>();
		this.accionesRealizadas = new TreeSet<Accion>();
		this.listaDeSensores= new TreeMap<Integer,Sensor>();
	}
	
	public boolean ActivarDesactivar() {
		for(Map.Entry<Integer,Sensor> entry : listaDeSensores.entrySet()) {
			if(entry.getValue().getEstado()==false) {
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

	public Map<Integer, Sensor> getListaDeSensores() {
		return listaDeSensores;
	}

	public void setListaDeSensores(Map<Integer, Sensor> listaDeSensores) {
		this.listaDeSensores = listaDeSensores;
	}
	
	
	
	

}
