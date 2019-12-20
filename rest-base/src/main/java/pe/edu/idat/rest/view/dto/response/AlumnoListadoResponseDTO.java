package pe.edu.idat.rest.view.dto.response;

import java.io.Serializable;
import java.util.List;

public class AlumnoListadoResponseDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9102845187755287847L;

	
	private String codigoRespuesta;
	private String mensajeRespuesta;
	private List<AlumnoListarResponseDTO> alumnos;
	
	
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
	public List<AlumnoListarResponseDTO> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(List<AlumnoListarResponseDTO> alumnos) {
		this.alumnos = alumnos;
	}
	
	
}
