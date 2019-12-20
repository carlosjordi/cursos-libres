package pe.edu.idat.rest.view.dto.request;

import java.io.Serializable;

public class AlumnoRegistroRequestDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1670953872974457622L;
	
	@NotBlank(message = "nombres es un atributo obligatorio")
	private String nombres;
	
	@NotBlank(message = "apellidos es un atributo obligatorio")
	private String apellidos;
	
	@NotNull(message = "edad es un atributo obligatorio")
	private Integer edad;
	
	@NotBlank(message = "telefono es un atributo obligatorio")
	@Size(min = 7, max = 9)
	private String telefono;
	
	@NotBlank(message = "dni es un atributo obligatorio")
	@Size(min = 8, max = 8)
	private String dni;
	
	@NotBlank(message = "correo es un atributo obligatorio")
	private String correo;
	
	@NotBlank(message = "direccion es un atributo obligatorio")
	private String direccion;
	
	
	
	

	public AlumnoRegistroRequestDTO() {
		super();
	}

	public AlumnoRegistroRequestDTO(String nombres, String apellidos, Integer edad, String telefono, String dni,
			String correo, String direccion) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
		this.telefono = telefono;
		this.dni = dni;
		this.correo = correo;
		this.direccion = direccion;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
	

}
