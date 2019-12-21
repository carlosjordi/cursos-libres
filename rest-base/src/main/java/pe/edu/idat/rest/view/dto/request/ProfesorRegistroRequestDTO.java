package pe.edu.idat.rest.view.dto.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class ProfesorRegistroRequestDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3962864321015690192L;

	@NotBlank(message = "nombre es un atributo obligatorio")
	private String nombre;
	
	@NotBlank(message = "apellidos es un atributo obligatorio")
	private String apellidos;
	
	@NotBlank(message = "dni es un atributo obligatorio")
	@Size(min = 8, max = 8)
	private String dni;
	
	@NotBlank(message = "especialidad es un atributo obligatorio")
	private String especialidad;
	
	@NotNull(message = "anosExperiencia es un atributo obligatorio")
	private Integer anosExperiencia;
	
	
	
	public ProfesorRegistroRequestDTO() {
		super();
	}
	public ProfesorRegistroRequestDTO(String nombre, String apellidos, String dni, String especialidad,
			Integer anosExperiencia) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.especialidad = especialidad;
		this.anosExperiencia = anosExperiencia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public Integer getAnosExperiencia() {
		return anosExperiencia;
	}
	public void setAnosExperiencia(Integer anosExperiencia) {
		this.anosExperiencia = anosExperiencia;
	}
	
	
}
