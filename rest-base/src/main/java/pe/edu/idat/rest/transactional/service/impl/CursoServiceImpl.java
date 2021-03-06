package pe.edu.idat.rest.transactional.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.idat.rest.persistence.domain.Curso;
import pe.edu.idat.rest.persistence.repository.CursoRepository;
import pe.edu.idat.rest.transactional.service.CursoService;
import pe.edu.idat.rest.view.dto.request.CursoActualizacionRequestDTO;
import pe.edu.idat.rest.view.dto.request.CursoRegistroRequestDTO;
import pe.edu.idat.rest.view.dto.request.InscripcionRetiroRequestDTO;
import pe.edu.idat.rest.view.dto.response.CursoActualizacionResponseDTO;
import pe.edu.idat.rest.view.dto.response.CursoListadoPorAlumnoResponseDTO;
import pe.edu.idat.rest.view.dto.response.CursoListadoResponseDTO;
import pe.edu.idat.rest.view.dto.response.CursoListarPorAlumnoResponseDTO;
import pe.edu.idat.rest.view.dto.response.CursoListarResponseDTO;
import pe.edu.idat.rest.view.dto.response.CursoRegistroResponseDTO;
import pe.edu.idat.rest.view.dto.response.InscripcionRetiroResponseDTO;

@Transactional
@Service("cursoService")
public class CursoServiceImpl implements CursoService {

	@Autowired
	private CursoRepository cursoRepository;

	@Override
	public CursoRegistroResponseDTO registrarCurso(CursoRegistroRequestDTO request) {

		cursoRepository.registrarCurso(request.getIdProfesor(), request.getDescripcion(), request.getCosto(),
				request.getVacantes(), request.getVacantes(), request.getFechaInicio(), request.getFechaFin(),
				request.getTurno(), request.getLugar(), new Date());

		CursoRegistroResponseDTO response = new CursoRegistroResponseDTO();
		response.setCodigoRespuesta("01");
		response.setMensajeRespuesta("Curso Registrado");
		response.setId(null);
		return response;
	}

	@Override
	public CursoActualizacionResponseDTO actualizarCurso(CursoActualizacionRequestDTO request) {

		cursoRepository.actualizarCurso(request.getId(), request.getDescripcion(), request.getCosto(),
				request.getVacantes(), request.getFechaInicio(), request.getFechaFin(), request.getTurno(),
				request.getLugar(), request.getIdProfesor());

		CursoActualizacionResponseDTO response = new CursoActualizacionResponseDTO();
		response.setCodigoRespuesta("01");
		response.setMensajeRespuesta("Curso Actualizado");
		return response;
	}

	@Override
	public InscripcionRetiroResponseDTO InscripcionOretiro(InscripcionRetiroRequestDTO request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CursoListadoResponseDTO listarCursos() {

		List<Curso> listado = cursoRepository.findAll();

		List<CursoListarResponseDTO> cursos = new ArrayList<CursoListarResponseDTO>();
		CursoListarResponseDTO item = null;

		for (Curso c : listado) {
			item = new CursoListarResponseDTO();
			item.setId(c.getIdCurso());
			item.setDescripcion(c.getDescripcion());
			item.setCosto(Double.valueOf(c.getCosto().toString()));
			item.setFechaInicio(c.getFechaInicio().toString());
			item.setFechaFin(c.getFechaFin().toString());
			item.setLugar(c.getLugar());
			item.setVacantes(c.getVacantes());
			item.setTurno(c.getTurno());
			cursos.add(item);
		}

		CursoListadoResponseDTO response = new CursoListadoResponseDTO();
		response.setCodigoRespuesta("01");
		response.setMensajeRespuesta("Listado de Cursos");
		response.setCursos(cursos);
		return response;
	}

	@Override
	public CursoListarResponseDTO buscarCursoPorId(Integer id) {

		Curso c = cursoRepository.findOne(id);

		CursoListarResponseDTO response = new CursoListarResponseDTO();
		response.setId(c.getIdCurso());
		response.setCosto(Double.valueOf(c.getCosto().toString()));
		response.setDescripcion(c.getDescripcion());
		response.setFechaFin(c.getFechaFin().toString());
		response.setFechaInicio(c.getFechaInicio().toString());
		response.setLugar(c.getLugar());
		response.setTurno(c.getTurno());
		response.setVacantes(c.getVacantes());
		return response;
	}

	@Override
	public CursoListadoPorAlumnoResponseDTO listarCursosPorAlumno(Long idAlumno) {

		List<Curso> listaCursos = cursoRepository.listarCursosPorAlumno(idAlumno);

		List<CursoListarPorAlumnoResponseDTO> cursos = new ArrayList<>();
		CursoListarPorAlumnoResponseDTO item = null;

		for (Curso c : listaCursos) {
			item = new CursoListarPorAlumnoResponseDTO();
			item.setId(c.getIdCurso());
			item.setDescripcion(c.getDescripcion());
			item.setLugar(c.getLugar());
			item.setTurno(c.getTurno());
			cursos.add(item);
		}

		CursoListadoPorAlumnoResponseDTO response = new CursoListadoPorAlumnoResponseDTO();
		response.setCodigoRespuesta("01");
		response.setMensajeRespuesta("Cursos del alumno");
		response.setCursos(cursos);
		return response;
	}

//	private Date stringToDate(String fecha) throws ParseException {
//		return new SimpleDateFormat("yyyy-MM-dd").parse(fecha);
//	}

}
