package pe.edu.idat.rest.view.dto.response;

import java.io.Serializable;

public class CursoListarPorAlumnoResponseDTO implements Serializable {

	private static final long serialVersionUID = 8600696088079336372L;
	
	private Integer id;
	private String descripcion;
	private Integer turno;
	private String lugar;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getTurno() {
		return turno;
	}
	public void setTurno(Integer turno) {
		this.turno = turno;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

}
