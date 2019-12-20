package pe.edu.idat.rest.view.dto.response;

import java.io.Serializable;

import pe.edu.idat.rest.view.exception.ErrorResourceDTO;

public class BaseResponseDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1060013908504906386L;
	
	private String codigoRespuesta;
	private String mensajeRespuesta;
	private ErrorResourceDTO objErrorResource;
	
	
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
	public ErrorResourceDTO getObjErrorResource() {
		return objErrorResource;
	}
	public void setObjErrorResource(ErrorResourceDTO objErrorResource) {
		this.objErrorResource = objErrorResource;
	}
	
	

}
