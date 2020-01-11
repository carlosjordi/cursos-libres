package pe.edu.idat.rest.view.dto.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

public class CursoActualizacionRequestDTO implements Serializable {

	private static final long serialVersionUID = 3666892148836440984L;
	
	@NotNull(message = "id es un atributo obligatorio")
	private Integer id;
	
	@NotBlank(message = "descripcion es un atributo obligatorio")
	private String descripcion;
	
	@NotNull(message = "costo es un atributo obligatorio")
	private Double costo;
	
	@NotNull(message = "costo es un atributo obligatorio")
	private Integer vacantes;
	
	@NotNull(message = "vacantesActuales es un atributo obligatorio")
	private Integer vacantesActuales;
	
	@NotBlank(message = "FechaFin es un atributo obligatorio")
	@Pattern(
			regexp = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/(19|20)\\d\\d",
			message = "fechaInicioActividad debe tener el formato dd/mm/aaaa"
		)
	private String FechaInicio;
	
	@NotBlank(message = "FechaFin es un atributo obligatorio")
	@Pattern(
			regexp = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/(19|20)\\d\\d",
			message = "fechaInicioActividad debe tener el formato dd/mm/aaaa"
		)
	private String FechaFin;
	
	@NotNull(message = "turno es un atributo obligatorio")
	@Range(
		min = 1L,
		max = 3L,
		message = "La turno puede tener el valor 1: mañana, 2:tarde, 3: noche"
	)
	private Integer turno;
	
	@NotBlank(message = "lugar es un atributo obligatorio")
	private String lugar;
	
	@NotNull(message = "idProfesor es un atributo obligatorio")
	private Integer idProfesor;
	
	public CursoActualizacionRequestDTO() {
		super();
	}
	
	public CursoActualizacionRequestDTO(Integer id, String descripcion, Double costo, Integer vacantes,
			Integer vacantesActuales, String fechaInicio, String fechaFin, Integer turno, String lugar,
			Integer idProfesor) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.costo = costo;
		this.vacantes = vacantes;
		this.vacantesActuales = vacantesActuales;
		FechaInicio = fechaInicio;
		FechaFin = fechaFin;
		this.turno = turno;
		this.lugar = lugar;
		this.idProfesor = idProfesor;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public Integer getVacantesActuales() {
		return vacantesActuales;
	}
	public void setVacantesActuales(Integer vacantesActuales) {
		this.vacantesActuales = vacantesActuales;
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
