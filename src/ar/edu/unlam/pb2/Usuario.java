package ar.edu.unlam.pb2;

public class Usuario {
	private Integer DNI;
	private String nombre;
	private Central central;
	
	public Usuario(Integer dni, String nombre, Central central) {
		this.DNI = dni;
		this.nombre = nombre;
		this.central=central;
	}

	public Integer getDNI() {
		return DNI;
	}

	public void setDNI(Integer dNI) {
		this.DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Central getCentral() {
		return central;
	}

	public void setCentral(Central central) {
		this.central = central;
	}
	
	

}
