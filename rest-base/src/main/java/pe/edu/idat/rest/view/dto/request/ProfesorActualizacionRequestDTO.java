package pe.edu.idat.rest.view.dto.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class ProfesorActualizacionRequestDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3126929117540681892L;

	
	@NotNull(message = "idProfesor es un atributo obligatorio")
	private Integer idProfesor;
	
	@NotBlank(message = "passProfesor es un atributo obligatorio")
	private String passProfesor;
	
	
	public ProfesorActualizacionRequestDTO() {
		super();
	}
	public ProfesorActualizacionRequestDTO(Integer idProfesor, String passProfesor) {
		super();
		this.idProfesor = idProfesor;
		this.passProfesor = passProfesor;
	}
	public Integer getIdProfesor() {
		return idProfesor;
	}
	public void setIdProfesor(Integer idProfesor) {
		this.idProfesor = idProfesor;
	}
	public String getPassProfesor() {
		return passProfesor;
	}
	public void setPassProfesor(String passProfesor) {
		this.passProfesor = passProfesor;
	}
	
	
}
