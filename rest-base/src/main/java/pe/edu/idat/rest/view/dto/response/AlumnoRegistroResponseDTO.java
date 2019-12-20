package pe.edu.idat.rest.view.dto.response;

import java.io.Serializable;

public class AlumnoRegistroResponseDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7907342371750114164L;

	private Integer id;
	private String codigoAlumno;
	private String contrasena;
	private String codigoRespuesta;
	private String mensajeRespuesta;
	
	
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
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getCodigoRespuesta() {
		return codigoRespuesta;
	}
	public void setCodigoRespuesta(String codigoRespuesta) {
		this.codigoRespuesta = codigoRespuesta;
	}
	public String getMensajeRespuesta() {
		return mensajeRespuesta;
	}
	public void setMensajeRespuesta(String mensajeRespuesta) {
		this.mensajeRespuesta = mensajeRespuesta;
	}
	
	
}
