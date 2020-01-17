package pe.edu.idat.rest.transactional.service;

import pe.edu.idat.rest.view.dto.request.AlumnoActualizacionRequestDTO;
import pe.edu.idat.rest.view.dto.request.AlumnoRegistroRequestDTO;
import pe.edu.idat.rest.view.dto.response.AlumnoActualizacionResponseDTO;
import pe.edu.idat.rest.view.dto.response.AlumnoListadoPorCursoResponseDTO;
import pe.edu.idat.rest.view.dto.response.AlumnoListadoResponseDTO;
import pe.edu.idat.rest.view.dto.response.AlumnoListarResponseDTO;
import pe.edu.idat.rest.view.dto.response.AlumnoRegistroResponseDTO;

public interface AlumnoService {
	
	public AlumnoRegistroResponseDTO registrarAlumno(
			AlumnoRegistroRequestDTO request);
	
	public AlumnoActualizacionResponseDTO actualizarAlumno(
			AlumnoActualizacionRequestDTO request);
	
	public AlumnoListadoResponseDTO listarAlumnos();
	
	public AlumnoListadoPorCursoResponseDTO listarPorCurso(Integer idCurso);
	
	public AlumnoListarResponseDTO buscarAlumnoPorId(Long idAlumno);
}
