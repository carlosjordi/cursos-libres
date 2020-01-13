package pe.edu.idat.rest.persistence.domain;
// Generated 20/12/2019 11:30:41 AM by Hibernate Tools 4.3.2-SNAPSHOT

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Profesor generated by hbm2java
 */
@Entity
@Table(name = "profesor", catalog = "cursoslibres")
public class Profesor implements java.io.Serializable {

	private static final long serialVersionUID = 878176819381451776L;
	private Integer idProfesor;
	private String codigoProfesor;
	private String passProfesor;
	private String nombre;
	private String apellidos;
	private String dni;
	private int especialidad;
	private int anosExperiencia;
	private Date fechaRegistro;
	private Set<Curso> cursos = new HashSet<Curso>(0);

	public Profesor() {
	}

	public Profesor(String codigoProfesor, String passProfesor, String nombre, String apellidos, String dni,
			int especialidad, int anosExperiencia, Date fechaRegistro) {
		this.codigoProfesor = codigoProfesor;
		this.passProfesor = passProfesor;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.especialidad = especialidad;
		this.anosExperiencia = anosExperiencia;
		this.fechaRegistro = fechaRegistro;
	}

	public Profesor(String codigoProfesor, String passProfesor, String nombre, String apellidos, String dni,
			int especialidad, int anosExperiencia, Date fechaRegistro, Set<Curso> cursos) {
		this.codigoProfesor = codigoProfesor;
		this.passProfesor = passProfesor;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.especialidad = especialidad;
		this.anosExperiencia = anosExperiencia;
		this.fechaRegistro = fechaRegistro;
		this.cursos = cursos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idProfesor", unique = true, nullable = false)
	public Integer getIdProfesor() {
		return this.idProfesor;
	}

	public void setIdProfesor(Integer idProfesor) {
		this.idProfesor = idProfesor;
	}

	@Column(name = "codigoProfesor", nullable = false, length = 10)
	public String getCodigoProfesor() {
		return this.codigoProfesor;
	}

	public void setCodigoProfesor(String codigoProfesor) {
		this.codigoProfesor = codigoProfesor;
	}

	@Column(name = "passProfesor", nullable = false)
	public String getPassProfesor() {
		return this.passProfesor;
	}

	public void setPassProfesor(String passProfesor) {
		this.passProfesor = passProfesor;
	}

	@Column(name = "nombre", nullable = false)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "apellidos", nullable = false)
	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Column(name = "dni", nullable = false, length = 20)
	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Column(name = "especialidad", nullable = false)
	public int getEspecialidad() {
		return this.especialidad;
	}

	public void setEspecialidad(int especialidad) {
		this.especialidad = especialidad;
	}

	@Column(name = "anosExperiencia", nullable = false)
	public int getAnosExperiencia() {
		return this.anosExperiencia;
	}

	public void setAnosExperiencia(int anosExperiencia) {
		this.anosExperiencia = anosExperiencia;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaRegistro", nullable = false, length = 19)
	public Date getFechaRegistro() {
		return this.fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "profesor")
	public Set<Curso> getCursos() {
		return this.cursos;
	}

	public void setCursos(Set<Curso> cursos) {
		this.cursos = cursos;
	}

}
