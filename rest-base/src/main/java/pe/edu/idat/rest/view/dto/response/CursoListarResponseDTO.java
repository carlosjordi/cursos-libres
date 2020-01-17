package pe.edu.idat.rest.view.dto.response;

import java.io.Serializable;

public class CursoListarResponseDTO implements Serializable{

	private static final long serialVersionUID = -5808939237412706069L;
	
	private Integer id;
	private String descripcion;
	private Double costo;
	private String fechaInicio;
	private String fechaFin;
	private Integer turno;
	private String lugar;
	private Integer vacantes;
	
	public Integer getVacantes() {
		return vacantes;
	}
	public void setVacantes(Integer vacantes) {
		this.vacantes = vacantes;
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
	public String getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public String getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
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
	
}
