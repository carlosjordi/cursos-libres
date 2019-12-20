package pe.edu.idat.rest.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.idat.rest.persistence.domain.Institucion;

public interface InstitucionRepository extends JpaRepository<Institucion, Long> {

}
