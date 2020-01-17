package pe.edu.idat.rest.view.dto.response;

import java.io.Serializable;
import java.util.List;

public class CursoListadoPorAlumnoResponseDTO implements Serializable {

	private static final long serialVersionUID = -6783764861001145129L;

	private String codigoRespuesta;
	private String mensajeRespuesta;
	private List<CursoListarPorAlumnoResponseDTO> cursos;
	
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
	public List<CursoListarPorAlumnoResponseDTO> getCursos() {
		return cursos;
	}
	public void setCursos(List<CursoListarPorAlumnoResponseDTO> cursos) {
		this.cursos = cursos;
	}

}
