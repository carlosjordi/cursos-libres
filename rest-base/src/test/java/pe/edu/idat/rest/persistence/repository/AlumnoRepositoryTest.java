package pe.edu.idat.rest.persistence.repository;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.Gson;

import pe.edu.idat.rest.config.BaseTest;
import pe.edu.idat.rest.persistence.domain.Alumno;

public class AlumnoRepositoryTest extends BaseTest {

	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@Test
	public void registrarAlumnoTest() {
		
		Alumno alumno = new Alumno();
		alumno.setIdAlumno(10L);
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
	public void actualizarAlumnoTest() {
		
		Alumno alumno = new Alumno();
		alumno.setIdAlumno(2L);
		alumno.setCodigoAlumno("CA93");
		alumno.setPassAlumno("mi password");
		alumno.setNombres("Juan Carlos");
		alumno.setApellidos("Castillo Aycachi");
		alumno.setEdad(26);
		alumno.setTelefono("979666355");
		alumno.setDni("70555913");
		alumno.setCorreo("carlosjordi@gmail.com");
		alumno.setDireccion("otra casita");
		alumno.setFechaRegistro(new Date());
		alumno.setInscripcions(null);
		Alumno a = alumnoRepository.save(alumno);
		
		System.out.println(new Gson().toJson(a));
	}
	
	@Test
	public void listarAlumnosTest() {
		
		List<Alumno> lista = alumnoRepository.findAll();
		for (Alumno alumno : lista) {
			System.out.println("id: " + alumno.getIdAlumno());
			System.out.println("codigo: " + alumno.getCodigoAlumno());
			System.out.println("nombres: " + alumno.getNombres());
			System.out.println("apellidos: " + alumno.getApellidos());
			System.out.println("edad: " + alumno.getEdad());
			System.out.println("telefono: " + alumno.getTelefono());
			System.out.println("dni: " + alumno.getDni());
			System.out.println("correo: " + alumno.getCorreo());
			System.out.println("direccion: " + alumno.getDireccion());
		}	
	}
	
	@Test
	public void listarAlumnosPorCursoTest() {
		List<Alumno> lista = alumnoRepository.listarAlumnosPorCurso(2);
		for (Alumno a: lista) {
			System.out.println("id: " + a.getIdAlumno());
			System.out.println("nombre: " + a.getNombres());
			System.out.println("apellidos: " + a.getApellidos());
			System.out.println("codigoAlumno: " + a.getCodigoAlumno());
		}
	}
	
}
