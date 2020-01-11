package pe.edu.idat.rest.persistence.repository;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.Gson;

import pe.edu.idat.rest.config.BaseTest;
import pe.edu.idat.rest.persistence.domain.Alumno;

public class InstitucionRepositoryTest extends BaseTest {

	@Autowired
	private AlumnoRepository alumnoRepository;
	
	
	@Test
	public void listarAlumnosTest() {
		
		List<Alumno> lista = alumnoRepository.findAll();
		for (Alumno alumno : lista) {
			System.out.println("codigo = " + alumno.getCodigoAlumno());
		}	
	}
	
	@Test
	public void registrarAlumnoTest() {
		
		Alumno alumno = new Alumno();
		alumno.setIdAlumno(10);
		alumno.setCodigoAlumno("CA93");
		alumno.setPassAlumno("CA70555913");
		alumno.setNombres("Juan Carlos");
		alumno.setApellidos("Castillo Aycachi");
		alumno.setEdad(26);
		alumno.setTelefono("979666355");
		alumno.setDni("70555913");
		alumno.setCorreo("carlosjordi@hotmail.com");
		alumno.setDireccion("mi casita xd");
		alumno.setFechaRegistro(new Date());
		alumno.setInscripcions(null);
		Alumno a = alumnoRepository.save(alumno);
		
		System.out.println(new Gson().toJson(a));
	}
	
	@Test
	public void listarAlumnosPorCursoTest() {
		Alumno alumno = alumnoRepository.findOne(1L);
	}
	
}
