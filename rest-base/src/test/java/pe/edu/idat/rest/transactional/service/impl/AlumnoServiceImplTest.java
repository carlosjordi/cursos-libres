package pe.edu.idat.rest.transactional.service.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.Gson;

import pe.edu.idat.rest.config.BaseTest;
import pe.edu.idat.rest.transactional.service.AlumnoService;
import pe.edu.idat.rest.view.dto.request.AlumnoActualizacionRequestDTO;
import pe.edu.idat.rest.view.dto.request.AlumnoRegistroRequestDTO;
import pe.edu.idat.rest.view.dto.response.AlumnoActualizacionResponseDTO;
import pe.edu.idat.rest.view.dto.response.AlumnoListadoPorCursoResponseDTO;
import pe.edu.idat.rest.view.dto.response.AlumnoListadoResponseDTO;
import pe.edu.idat.rest.view.dto.response.AlumnoRegistroResponseDTO;

public class AlumnoServiceImplTest extends BaseTest {

	@Autowired
	private AlumnoService alumnoService;
	
	@Test
	public void registroAlumnoTest() {
		
		AlumnoRegistroRequestDTO request = new AlumnoRegistroRequestDTO();
		request.setNombres("Bratzon Hilser");
		request.setApellidos("EL COME GIGANTES");
		request.setEdad(20);
		request.setTelefono("123456789");
		request.setDni("12345678");
		request.setCorreo("brazton@elcomegigantes.com");
		request.setDireccion("Los panetones #123 Jr Las hamburguesas");
		
		AlumnoRegistroResponseDTO response = alumnoService.registrarAlumno(request);
		System.out.println("response = " + new Gson().toJson(response));
		
	}
	
	@Test
	public void actualizarAlumnoTest() {
		
		AlumnoActualizacionRequestDTO request = new AlumnoActualizacionRequestDTO();
		request.setId(8);
		request.setContrasena("supersecretoxD");
		
		AlumnoActualizacionResponseDTO response = alumnoService.actualizarAlumno(request);
		System.out.println("response = " + new Gson().toJson(response));
	}
	
	@Test
	public void listarAlumnosTest() {
		
		AlumnoListadoResponseDTO response = alumnoService.listarAlumnos();
		System.out.println("response = " + new Gson().toJson(response));
	}
	
	@Test
	public void listarAlumnosPorCursoTest() {
		
		AlumnoListadoPorCursoResponseDTO response = alumnoService.listarPorCurso(2);
		System.out.println("response = " + new Gson().toJson(response));
	}
}
