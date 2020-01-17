package pe.edu.idat.rest.view.dto.response;

import java.io.Serializable;

public class CursoActualizacionResponseDTO implements Serializable {

	private static final long serialVersionUID = -516456044723569788L;

	private String codigoRespuesta;
	private String mensajeRespuesta;

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