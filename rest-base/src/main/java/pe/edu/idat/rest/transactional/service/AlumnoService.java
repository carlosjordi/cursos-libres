package pe.edu.idat.rest.transactional.service;

import pe.edu.idat.rest.view.dto.request.AlumnoActualizacionRequestDTO;
import pe.edu.idat.rest.view.dto.request.AlumnoRegistroRequestDTO;
import pe.edu.idat.rest.view.dto.response.AlumnoActualizacionResponseDTO;
import pe.edu.idat.rest.view.dto.response.AlumnoListadoPorCursoResponseDTO;
import pe.edu.idat.rest.view.dto.response.AlumnoRegistroResponseDTO;

public interface AlumnoService {
	
	public AlumnoRegistroResponseDTO registrarAlumno(
			AlumnoRegistroRequestDTO request);
	
	public AlumnoActualizacionResponseDTO actualizarAlumno(
			AlumnoActualizacionRequestDTO request);
	
	public AlumnoListadoPorCursoResponseDTO listarPorCurso(Integer idCurso);
	
}
