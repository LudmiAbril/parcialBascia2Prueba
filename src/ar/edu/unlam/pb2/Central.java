package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Set;

public class Central {
private String nombre;
private Set <Alarma> alarmas;
private Set <Usuario> usuarios;

public Central(String nombre) {
	this.nombre=nombre;
	this.alarmas=new HashSet<Alarma>();
	this.usuarios=new HashSet<Usuario>();
}

public Usuario buscarUsuarioDni(Integer dni) {
	for(Usuario u:usuarios) {
		if(u.getDNI().equals(dni)) {
			return u;
		}
	} return null;
}

public Alarma buscarAlarmaPorId(Integer id) {
	for(Alarma a:alarmas) {
		if(a.getIdAlarma().equals(id)) {
			return a;
		}
	} return null;
}

public Boolean guardarUsuario(Usuario usuario) {
	return this.usuarios.add(usuario);
}

public Boolean guardarAlarma(Alarma alarma) {
	return this.alarmas.add(alarma);
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public Set<Alarma> getAlarmas() {
	return alarmas;
}

public void setAlarmas(Set<Alarma> alarmas) {
	this.alarmas = alarmas;
}

public Set<Usuario> getUsuarios() {
	return usuarios;
}

public void setUsuarios(Set<Usuario> usuarios) {
	this.usuarios = usuarios;
}

}
