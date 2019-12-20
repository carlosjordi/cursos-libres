package pe.edu.idat.rest.transactional.service;

import pe.edu.idat.rest.view.dto.request.ProfesorActualizacionRequestDTO;
import pe.edu.idat.rest.view.dto.request.ProfesorRegistroRequestDTO;
import pe.edu.idat.rest.view.dto.response.ProfesorActualizacionResponseDTO;
import pe.edu.idat.rest.view.dto.response.ProfesorRegistroResponseDTO;

public interface ProfesorService {

	public ProfesorRegistroResponseDTO registrarProfesor(
			ProfesorRegistroRequestDTO request);
	
	public ProfesorActualizacionResponseDTO actualizarProfesor(
			ProfesorActualizacionRequestDTO request);
}
