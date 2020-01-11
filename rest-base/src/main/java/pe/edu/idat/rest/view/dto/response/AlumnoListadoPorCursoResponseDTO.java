package pe.edu.idat.rest.view.dto.response;

import java.io.Serializable;
import java.util.List;

public class AlumnoListadoPorCursoResponseDTO implements Serializable{

	private static final long serialVersionUID = 6068250474902883296L;

	private List<AlumnoListarPorCursoResponseDTO> alumnos;

	public List<AlumnoListarPorCursoResponseDTO> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<AlumnoListarPorCursoResponseDTO> alumnos) {
		this.alumnos = alumnos;
	}
}
