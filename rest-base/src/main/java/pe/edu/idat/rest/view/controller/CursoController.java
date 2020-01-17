package pe.edu.idat.rest.view.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.idat.rest.transactional.service.CursoService;
import pe.edu.idat.rest.view.dto.request.AlumnoActualizacionRequestDTO;
import pe.edu.idat.rest.view.dto.request.CursoActualizacionRequestDTO;
import pe.edu.idat.rest.view.dto.request.CursoRegistroRequestDTO;
import pe.edu.idat.rest.view.dto.response.AlumnoActualizacionResponseDTO;
import pe.edu.idat.rest.view.dto.response.AlumnoListadoPorCursoResponseDTO;
import pe.edu.idat.rest.view.dto.response.CursoActualizacionResponseDTO;
import pe.edu.idat.rest.view.dto.response.CursoListadoPorAlumnoResponseDTO;
import pe.edu.idat.rest.view.dto.response.CursoListadoResponseDTO;
import pe.edu.idat.rest.view.dto.response.CursoListarResponseDTO;
import pe.edu.idat.rest.view.dto.response.CursoRegistroResponseDTO;
import pe.edu.idat.rest.view.exception.DemoSOAException;

@RestController
@CrossOrigin(allowCredentials = "true", origins = { "*" }, allowedHeaders = { "*" }, methods = { RequestMethod.GET,
		RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@RequestMapping(value = { "/api/v1/cursos" })
public class CursoController {

	@Autowired
	private CursoService cursoService;

	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ResponseBody
	public CursoRegistroResponseDTO registrarCurso(@Valid @RequestBody CursoRegistroRequestDTO cursoRegistroRequestDTO,
			BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			throw new DemoSOAException("Error en atributos obligatorios del request cursoRegistroRequestDTO",
					bindingResult);
		}
		return cursoService.registrarCurso(cursoRegistroRequestDTO);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public CursoListadoResponseDTO listarCursos() {
		return cursoService.listarCursos();
	}
	
	@RequestMapping(value = "/", method = RequestMethod.PUT)
	@ResponseBody
	public CursoActualizacionResponseDTO actualizarCurso(
			@Valid @RequestBody CursoActualizacionRequestDTO cursoActualizacionRequestDTO,
			BindingResult bindingResult) throws Exception {

		if (bindingResult.hasErrors()) {
			throw new DemoSOAException("Error en atributos obligatorio del request cursoActualizacionRequestDTO",
					bindingResult);
		}
		return cursoService.actualizarCurso(cursoActualizacionRequestDTO);
	}
	
	@RequestMapping(value = "/curso/{codigo-curso}", method = RequestMethod.GET)
	@ResponseBody
	public CursoListarResponseDTO buscarCursoPorId(
			@PathVariable(value = "codigo-curso") Integer codigo) {
		return cursoService.buscarCursoPorId(codigo);
	}
	
	@RequestMapping(value = "/{codigo-alumno}", method = RequestMethod.GET)
	@ResponseBody
	public CursoListadoPorAlumnoResponseDTO listarCursosPorAlumno(
			@PathVariable(value = "codigo-alumno") Long codigo) {
		return cursoService.listarCursosPorAlumno(codigo);
	}
	
}
