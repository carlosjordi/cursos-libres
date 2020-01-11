package pe.edu.idat.rest.transactional.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;

import pe.edu.idat.rest.persistence.domain.Alumno;
import pe.edu.idat.rest.persistence.repository.AlumnoRepository;
import pe.edu.idat.rest.transactional.service.AlumnoService;
import pe.edu.idat.rest.view.dto.request.AlumnoActualizacionRequestDTO;
import pe.edu.idat.rest.view.dto.request.AlumnoRegistroRequestDTO;
import pe.edu.idat.rest.view.dto.response.AlumnoActualizacionResponseDTO;
import pe.edu.idat.rest.view.dto.response.AlumnoListadoPorCursoResponseDTO;
import pe.edu.idat.rest.view.dto.response.AlumnoRegistroResponseDTO;

@Transactional
@Service("alumnoService")
public class AlumnoServiceImpl implements AlumnoService{

	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@Override
	public AlumnoRegistroResponseDTO registrarAlumno(AlumnoRegistroRequestDTO request) {
		
		Alumno alumno = new Alumno();
		alumno.setNombres(request.getNombres());
		alumno.setApellidos(request.getApellidos());
		alumno.setEdad(request.getEdad());
		alumno.setTelefono(request.getTelefono());
		alumno.setDni(request.getDni());
		alumno.setCorreo(request.getCorreo());
		alumno.setDireccion(request.getDireccion());
		alumno.setCodigoAlumno(generarCodigoAlumno(alumno));
		alumno.setPassAlumno(passwordPorDefecto(alumno));
		alumno.setFechaRegistro(new Date());
		
		alumno = alumnoRepository.save(alumno);
		
		AlumnoRegistroResponseDTO response = new AlumnoRegistroResponseDTO();
		response.setCodigoRespuesta("01");
		response.setMensajeRespuesta("Ok");
		response.setId(alumno.getIdAlumno());
		response.setCodigoAlumno(alumno.getCodigoAlumno());
		response.setContrasena(alumno.getPassAlumno());
		return response;
	}

	@Override
	public AlumnoActualizacionResponseDTO actualizarAlumno(AlumnoActualizacionRequestDTO request) {

		Alumno alumno = alumnoRepository.findOne(Long.valueOf(request.getId().toString()));
		alumno.setPassAlumno(request.getContrasena());
		
		alumnoRepository.save(alumno);
		
		AlumnoActualizacionResponseDTO response = new AlumnoActualizacionResponseDTO();
		response.setCodigoRespuesta("01");
		response.setMensajeRespuesta("Ok");
		return response;
	}

	@Override
	public AlumnoListadoPorCursoResponseDTO listarPorCurso(Integer idCurso) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private String generarCodigoAlumno(Alumno a) {
		String inicialApellido = a.getApellidos().substring(0, 1);
		String anoActual = "20";
		String dni = a.getDni();
		return inicialApellido + anoActual + dni;
	}
	
	private String passwordPorDefecto(Alumno a) {
		String inicialApellido = a.getApellidos().substring(0, 1);
		String telefono = a.getTelefono();
		return inicialApellido + telefono;
	}

}
