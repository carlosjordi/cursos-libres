package pe.edu.idat.rest.view.dto.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class AlumnoActualizacionRequestDTO implements Serializable{

	private static final long serialVersionUID = -8664673664859208225L;
	
	
	@NotNull(message = "id es un atributo obligatorio")
	private Integer id;
	
	@NotBlank(message = "contrasena es un atributo obligatorio")
	private String contrasena;
	
	
	public AlumnoActualizacionRequestDTO() {
		super();
	}
	public AlumnoActualizacionRequestDTO(Integer id, String contrasena) {
		super();
		this.id = id;
		this.contrasena = contrasena;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	
}
