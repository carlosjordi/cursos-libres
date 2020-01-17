package pe.edu.idat.rest.transactional.service.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.Gson;

import pe.edu.idat.rest.config.BaseTest;
import pe.edu.idat.rest.transactional.service.CursoService;
import pe.edu.idat.rest.view.dto.request.CursoActualizacionRequestDTO;
import pe.edu.idat.rest.view.dto.request.CursoRegistroRequestDTO;
import pe.edu.idat.rest.view.dto.response.CursoActualizacionResponseDTO;
import pe.edu.idat.rest.view.dto.response.CursoListadoPorAlumnoResponseDTO;
import pe.edu.idat.rest.view.dto.response.CursoListadoResponseDTO;
import pe.edu.idat.rest.view.dto.response.CursoListarResponseDTO;
import pe.edu.idat.rest.view.dto.response.CursoRegistroResponseDTO;

public class CursoServiceImplTest extends BaseTest {
	
	@Autowired
	private CursoService cursoService;
	
	@Test
	public void registrarCursoTest() {
		CursoRegistroRequestDTO request = new CursoRegistroRequestDTO();
		request.setIdProfesor(3);
		request.setVacantes(30);
		request.setDescripcion("React desde cero");
		request.setCosto(200.00);
		request.setFechaInicio("2020-01-20");
		request.setFechaFin("2020-04-01");
		request.setTurno(2);
		request.setLugar("La oficina con sillon");
		
		CursoRegistroResponseDTO response = cursoService.registrarCurso(request);
		System.out.println(new Gson().toJson(response));
	}
	
	@Test
	public void listarCursosTest() {
		
		CursoListadoResponseDTO response = cursoService.listarCursos();
		System.out.println(new Gson().toJson(response));
	}
	
	@Test
	public void actualizarCursoTest() {
		CursoActualizacionRequestDTO request = new CursoActualizacionRequestDTO();
		request.setId(1);
		request.setDescripcion("Curso renovado");
		request.setCosto(500.00);
		request.setFechaInicio("2020-01-30");
		request.setFechaFin("2020-04-20");
		request.setVacantes(20);
		request.setTurno(1);
		request.setLugar("Brazzers");
		request.setIdProfesor(3);
		
		CursoActualizacionResponseDTO response = cursoService.actualizarCurso(request);
		System.out.println(new Gson().toJson(response));
	}
	
	@Test
	public void buscarCursoPorIdTest() {
		CursoListarResponseDTO response = cursoService.buscarCursoPorId(3);
		System.out.println(new Gson().toJson(response));
	}
	
	@Test
	public void listarCursosPorAlumnoTest() {
		CursoListadoPorAlumnoResponseDTO response = cursoService.listarCursosPorAlumno(2L);
		System.out.println(new Gson().toJson(response));
	}

}
