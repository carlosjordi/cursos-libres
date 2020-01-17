package pe.edu.idat.rest.persistence.repository;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.idat.rest.config.BaseTest;
import pe.edu.idat.rest.persistence.domain.Curso;

public class CursoRepositoryTest extends BaseTest {

	@Autowired
	private CursoRepository cursoRepository;

	@Test
	public void registrarCursoTest() {

		cursoRepository.registrarCurso(3, "Android", 450.00, 20, 20, "2020-01-30", "2020-03-30", 1, "La jaus",
				new Date());
	}

	@Test
	public void listarCursosTest() {
		List<Curso> cursos = cursoRepository.findAll();
		for (Curso c : cursos) {
			System.out.println("=================");
			System.out.println("ID: " + c.getIdCurso());
			System.out.println("Descripcion: " + c.getDescripcion());
			System.out.println("Costo: " + c.getCosto());
			System.out.println("Vacantes: " + c.getVacantes());
			System.out.println("Inicio: " + c.getFechaInicio());
			System.out.println("Fin: " + c.getFechaFin());
			System.out.println("Lugar: " + c.getLugar());
			System.out.println("Turno: " + c.getTurno());
			System.out.println("=================");
		}
	}
	
	@Test
	public void actualizarCursoTest() {
		cursoRepository.actualizarCurso(1, "curso actualizado", 200.00, 20, "2020-01-16", "2020-02-16", 3, "Casa nueva", 3);
	}
}
