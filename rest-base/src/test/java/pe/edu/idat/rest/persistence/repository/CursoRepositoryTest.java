package pe.edu.idat.rest.persistence.repository;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.idat.rest.config.BaseTest;

public class CursoRepositoryTest extends BaseTest {

	@Autowired
	private CursoRepository cursoRepository;

	@Test
	public void registrarCursoTest() {

		cursoRepository.registrarCurso(3, "Android", 450.00, 20, 20, "2020-01-30", "2020-03-30", 1, "La jaus",
				new Date());
	}
}
