package pe.edu.idat.rest.view.dto.response;

import java.io.Serializable;

public class CursoRegistroResponseDTO implements Serializable{

	private static final long serialVersionUID = -6759276892694316587L;
	
	private Integer id;
	private String codigoRespuesta;
	private String mensajeRespuesta;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
