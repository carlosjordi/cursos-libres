package pe.edu.idat.rest.view.dto.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class InscripcionRetiroRequestDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5516180585056500294L;
	
	
	@NotNull(message = "idAlumno es un atributo obligatorio")
	private Integer idAlumno;
	
	@NotNull(message = "idCurso es un atributo obligatorio")
	private Integer idCurso ;
	
	@NotNull(message = "estado es un atributo obligatorio")
	private Integer estado;
	
	@NotBlank(message = "description es un atributo obligatorio")
	private String description;
	
	
	
	public InscripcionRetiroRequestDTO() {
		super();
	}
	public InscripcionRetiroRequestDTO(Integer idAlumno, Integer idCurso, Integer estado, String description) {
		super();
		this.idAlumno = idAlumno;
		this.idCurso = idCurso;
		this.estado = estado; // 1_inscrito 2 retirado
		this.description = description;
	}
	public Integer getIdAlumno() {
		return idAlumno;
	}
	public void setIdAlumno(Integer idAlumno) {
		this.idAlumno = idAlumno;
	}
	public Integer getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}

