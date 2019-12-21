package pe.edu.idat.rest.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.idat.rest.persistence.domain.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {

}
