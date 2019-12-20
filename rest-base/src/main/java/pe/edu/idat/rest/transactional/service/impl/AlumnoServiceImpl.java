package pe.edu.idat.rest.transactional.service.impl;

import java.util.List;
import java.util.Optional;

import pe.edu.idat.rest.persistence.domain.Alumno;
import pe.edu.idat.rest.persistence.repository.AlumnoRepository;
import pe.edu.idat.rest.transactional.service.AlumnoService;
import pe.edu.idat.rest.view.dto.request.AlumnoActualizacionRequestDTO;
import pe.edu.idat.rest.view.dto.request.AlumnoRegistroRequestDTO;
import pe.edu.idat.rest.view.dto.response.AlumnoActualizacionResponseDTO;
import pe.edu.idat.rest.view.dto.response.AlumnoRegistroResponseDTO;
import pe.edu.idat.rest.view.exception.DemoException;

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
