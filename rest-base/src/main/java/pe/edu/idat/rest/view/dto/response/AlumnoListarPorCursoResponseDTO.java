package pe.edu.idat.rest.view.dto.response;

import java.io.Serializable;

public class AlumnoListarPorCursoResponseDTO implements Serializable{

	private static final long serialVersionUID = -4365836634509297301L;
	
	private Integer id;
	private String codigoAlumno;
	private String nombre;
	private String apellido;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCodigoAlumno() {
		return codigoAlumno;
	}
	public void setCodigoAlumno(String codigoAlumno) {
		this.codigoAlumno = codigoAlumno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}
