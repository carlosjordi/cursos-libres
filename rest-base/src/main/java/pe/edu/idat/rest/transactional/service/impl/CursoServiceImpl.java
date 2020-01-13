package pe.edu.idat.rest.transactional.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.idat.rest.persistence.repository.CursoRepository;
import pe.edu.idat.rest.transactional.service.CursoService;
import pe.edu.idat.rest.view.dto.request.CursoActualizacionRequestDTO;
import pe.edu.idat.rest.view.dto.request.CursoRegistroRequestDTO;
import pe.edu.idat.rest.view.dto.request.InscripcionRetiroRequestDTO;
import pe.edu.idat.rest.view.dto.response.CursoActualizacionResponseDTO;
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
		response.setMensajeRespuesta("Ok");
		response.setId(null);
		return response;
	}

	@Override
	public CursoActualizacionResponseDTO actualizarCurso(CursoActualizacionRequestDTO request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InscripcionRetiroResponseDTO InscripcionOretiro(InscripcionRetiroRequestDTO request) {
		// TODO Auto-generated method stub
		return null;
	}

//	private Date stringToDate(String fecha) throws ParseException {
//		return new SimpleDateFormat("yyyy-MM-dd").parse(fecha);
//	}

}
