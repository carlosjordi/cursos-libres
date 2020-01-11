package pe.edu.idat.rest.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pe.edu.idat.rest.persistence.domain.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
	
	@Query(
			value = 
			"select a from Alumno a " +
			"inner join fetch a.inscripcions i " +
			"inner join fetch i.curso c " +
			"where c.idCurso = :idCurso"
	)
	public List<Alumno> listarAlumnosPorCurso(@Param("idCurso") Integer idCurso);

}
