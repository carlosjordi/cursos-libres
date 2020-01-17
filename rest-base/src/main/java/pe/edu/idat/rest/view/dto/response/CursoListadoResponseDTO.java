package pe.edu.idat.rest.view.dto.response;

import java.io.Serializable;
import java.util.List;

public class CursoListadoResponseDTO implements Serializable{

	private static final long serialVersionUID = 4456510707901849915L;
	
	private String codigoRespuesta;
	private String mensajeRespuesta;
	private List<CursoListarResponseDTO> cursos;
	
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
	public List<CursoListarResponseDTO> getCursos() {
		return cursos;
	}
	public void setCursos(List<CursoListarResponseDTO> cursos) {
		this.cursos = cursos;
	}

}
