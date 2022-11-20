package ar.edu.unlam.pb2;

public class Sensor {
private Integer idSensor;
private Boolean estado;

public Sensor(Integer idSensor) {
	this.idSensor = idSensor;
	this.estado=false;
}

public Integer getIdSensor() {
	return idSensor;
}

public void setIdSensor(Integer idSensor) {
	this.idSensor = idSensor;
}

public Boolean getEstado() {
	return estado;
}

public void setEstado(Boolean estado) {
	this.estado = estado;
}


}
