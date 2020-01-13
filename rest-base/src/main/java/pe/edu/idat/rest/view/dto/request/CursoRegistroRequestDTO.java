package pe.edu.idat.rest.view.dto.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

public class CursoRegistroRequestDTO implements Serializable {

	private static final long serialVersionUID = 9128948376178677947L;

	@NotBlank(message = "descripción es un atributo obligatorio")
	private String descripcion;

	@NotNull(message = "costo es un atributo obligatorio")
	private Double costo;

	@NotNull(message = "vacantes es un atributo obligatorio")
	private Integer vacantes;

	@NotBlank(message = "FechaInicio es un atributo obligatorio")
	//@Pattern(regexp = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/(19|20)\\d\\d", message = "fechaInicioActividad debe tener el formato dd/mm/aaaa")
	private String FechaInicio;

	@NotBlank(message = "FechaFin es un atributo obligatorio")
	//@Pattern(regexp = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/(19|20)\\d\\d", message = "fechaInicioActividad debe tener el formato dd/mm/aaaa")
	private String FechaFin;

	@NotNull(message = "turno es un atributo obligatorio")
	@Range(min = 1L, max = 3L, message = "La turno puede tener el valor 1: mañana, 2:tarde, 3: noche")
	private Integer turno;

	@NotBlank(message = "lugar es un atributo obligatorio")
	private String lugar;

	@NotNull(message = "idProfesor es un atributo obligatorio")
	private Integer idProfesor;

	public CursoRegistroRequestDTO() {
		super();
	}

	public CursoRegistroRequestDTO(String descripcion, Double costo, Integer vacantes, String fechaInicio,
			String fechaFin, Integer turno, String lugar, Integer idProfesor) {
		super();
		this.descripcion = descripcion;
		this.costo = costo;
		this.vacantes = vacantes;
		FechaInicio = fechaInicio;
		FechaFin = fechaFin;
		this.turno = turno;
		this.lugar = lugar;
		this.idProfesor = idProfesor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getCosto() {
		return costo;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}

	public Integer getVacantes() {
		return vacantes;
	}

	public void setVacantes(Integer vacantes) {
		this.vacantes = vacantes;
	}

	public String getFechaInicio() {
		return FechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		FechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return FechaFin;
	}

	public void setFechaFin(String fechaFin) {
		FechaFin = fechaFin;
	}

	public Integer getTurno() {
		return turno;
	}

	public void setTurno(Integer turno) {
		this.turno = turno;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public Integer getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(Integer idProfesor) {
		this.idProfesor = idProfesor;
	}

}
