package pe.edu.idat.rest.transactional.service;

import pe.edu.idat.rest.view.dto.request.CursoActualizacionRequestDTO;
import pe.edu.idat.rest.view.dto.request.CursoRegistroRequestDTO;
import pe.edu.idat.rest.view.dto.request.InscripcionRetiroRequestDTO;
import pe.edu.idat.rest.view.dto.response.CursoActualizacionResponseDTO;
import pe.edu.idat.rest.view.dto.response.CursoListadoPorAlumnoResponseDTO;
import pe.edu.idat.rest.view.dto.response.CursoListadoResponseDTO;
import pe.edu.idat.rest.view.dto.response.CursoListarResponseDTO;
import pe.edu.idat.rest.view.dto.response.CursoRegistroResponseDTO;
import pe.edu.idat.rest.view.dto.response.InscripcionRetiroResponseDTO;

public interface CursoService {

	
	public CursoRegistroResponseDTO registrarCurso(
			CursoRegistroRequestDTO request);
	
	public CursoActualizacionResponseDTO actualizarCurso(
			CursoActualizacionRequestDTO request);
	
	public InscripcionRetiroResponseDTO InscripcionOretiro(
			InscripcionRetiroRequestDTO request);
	
	public CursoListadoResponseDTO listarCursos();
	
	public CursoListarResponseDTO buscarCursoPorId(Integer id);
	
	public CursoListadoPorAlumnoResponseDTO listarCursosPorAlumno(Long idAlumno);
	
}
