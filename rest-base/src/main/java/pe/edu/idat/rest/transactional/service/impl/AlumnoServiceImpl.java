package pe.edu.idat.rest.transactional.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.idat.rest.persistence.domain.Alumno;
import pe.edu.idat.rest.persistence.repository.AlumnoRepository;
import pe.edu.idat.rest.transactional.service.AlumnoService;
import pe.edu.idat.rest.view.dto.request.AlumnoActualizacionRequestDTO;
import pe.edu.idat.rest.view.dto.request.AlumnoRegistroRequestDTO;
import pe.edu.idat.rest.view.dto.response.AlumnoActualizacionResponseDTO;
import pe.edu.idat.rest.view.dto.response.AlumnoListadoPorCursoResponseDTO;
import pe.edu.idat.rest.view.dto.response.AlumnoListadoResponseDTO;
import pe.edu.idat.rest.view.dto.response.AlumnoListarPorCursoResponseDTO;
import pe.edu.idat.rest.view.dto.response.AlumnoListarResponseDTO;
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
		response.setId(Integer.valueOf(alumno.getIdAlumno().toString()));
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
	public AlumnoListadoResponseDTO listarAlumnos() {

		List<Alumno> alumnos = alumnoRepository.findAll();
		
		List<AlumnoListarResponseDTO> alumnosResponse = new ArrayList<>();
		AlumnoListarResponseDTO item = null;
		
		for (Alumno a: alumnos) {
			item = new AlumnoListarResponseDTO();
			item.setId(Integer.valueOf(a.getIdAlumno().toString()));
			item.setCodigoAlumno(a.getCodigoAlumno());
			item.setNombres(a.getNombres());
			item.setApellidos(a.getApellidos());
			item.setEdad(a.getEdad());
			item.setTelefono(a.getTelefono());
			item.setDni(a.getDni());
			item.setCorreo(a.getCorreo());
			item.setDireccion(a.getDireccion());
			alumnosResponse.add(item);
		}
		
		AlumnoListadoResponseDTO response = new AlumnoListadoResponseDTO();
		response.setCodigoRespuesta("01");
		response.setMensajeRespuesta("Ok");
		response.setAlumnos(alumnosResponse);
		return response;
	}

	@Override
	public AlumnoListadoPorCursoResponseDTO listarPorCurso(Integer idCurso) {
		
		List<Alumno> alumnosPorCurso = alumnoRepository.listarAlumnosPorCurso(idCurso);
		
		List<AlumnoListarPorCursoResponseDTO> alumnosResponse = new ArrayList<AlumnoListarPorCursoResponseDTO>();
		AlumnoListarPorCursoResponseDTO item = null;
		
		for (Alumno a: alumnosPorCurso) {
			item = new AlumnoListarPorCursoResponseDTO();
			item.setId(Integer.valueOf(a.getIdAlumno().toString()));
			item.setCodigoAlumno(a.getCodigoAlumno());
			item.setNombre(a.getNombres());
			item.setApellido(a.getApellidos());
			alumnosResponse.add(item);
		}
		
		AlumnoListadoPorCursoResponseDTO response = new AlumnoListadoPorCursoResponseDTO();
		response.setAlumnos(alumnosResponse);
		return response;
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
