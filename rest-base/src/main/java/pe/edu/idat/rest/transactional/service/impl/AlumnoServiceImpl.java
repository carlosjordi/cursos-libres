package pe.edu.idat.rest.transactional.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.idat.rest.persistence.repository.AlumnoRepository;
import pe.edu.idat.rest.transactional.service.AlumnoService;
import pe.edu.idat.rest.view.dto.request.AlumnoActualizacionRequestDTO;
import pe.edu.idat.rest.view.dto.request.AlumnoRegistroRequestDTO;
import pe.edu.idat.rest.view.dto.response.AlumnoActualizacionResponseDTO;
import pe.edu.idat.rest.view.dto.response.AlumnoRegistroResponseDTO;

@Transactional
@Service("AlumnoService")
public class AlumnoServiceImpl implements AlumnoService{

	
	@Autowired
	private AlumnoRepository alumnoRepository;
	
	
	@Override
	public AlumnoRegistroResponseDTO registrarAlumno(AlumnoRegistroRequestDTO request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AlumnoActualizacionResponseDTO actualizarAlumno(AlumnoActualizacionRequestDTO request) {
		// TODO Auto-generated method stub
		return null;
	}

}
