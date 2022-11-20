package ar.edu.unlam.pb2;

public class Administrador extends Usuario {

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
	


}
