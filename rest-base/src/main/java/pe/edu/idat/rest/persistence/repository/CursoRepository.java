package pe.edu.idat.rest.persistence.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.idat.rest.persistence.domain.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {

	@Modifying
	@Transactional
	@Query(value = "insert into curso (idProfesor, descripcion, costo, vacantes, vacantesActuales, fechaInicio,\n"
			+ " fechaFin, turno, lugar, fechaRegistro) values (:id, :des, :cos, :vac, :vacA, :fi, :ff, :tur, :lug, :fr)", nativeQuery = true)
	void registrarCurso(@Param("id") Integer id, @Param("des") String des, @Param("cos") Double costo,
			@Param("vac") Integer vac, @Param("vacA") Integer vacAct, @Param("fi") String fechaI,
			@Param("ff") String fechaF, @Param("tur") Integer turno, @Param("lug") String lugar,
			@Param("fr") Date fechaRegistro);

	@Modifying
	@Transactional
	@Query(value = "update curso set descripcion = :des, costo = :cos, vacantes = :vac, fechaInicio = :fi, "
			+ "fechaFin = :ff, turno = :tu, lugar = :lu, idProfesor = :iP where idCurso = :id", nativeQuery = true)
	void actualizarCurso(@Param("id") Integer id, @Param("des") String des, @Param("cos") Double costo,
			@Param("vac") Integer vac, @Param("fi") String fechaI, @Param("ff") String fechaF,
			@Param("tu") Integer turno, @Param("lu") String lugar, @Param("iP") Integer idProfesor);

}
