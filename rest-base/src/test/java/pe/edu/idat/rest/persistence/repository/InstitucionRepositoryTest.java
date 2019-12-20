package pe.edu.idat.rest.persistence.repository;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.Gson;

import pe.edu.idat.rest.config.BaseTest;
import pe.edu.idat.rest.persistence.domain.Institucion;

public class InstitucionRepositoryTest extends BaseTest {

	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@Test
	public void listarAlumnosTest() {
		
		List<Alumno> lista = alumnoRepository.findAll();
		System.out.println("lista = " + new Gson().toJson(lista));
		
		
	}
	
	
	
}
