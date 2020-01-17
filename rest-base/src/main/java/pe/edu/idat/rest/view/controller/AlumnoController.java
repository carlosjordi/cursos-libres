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

import pe.edu.idat.rest.transactional.service.AlumnoService;
import pe.edu.idat.rest.view.dto.request.AlumnoActualizacionRequestDTO;
import pe.edu.idat.rest.view.dto.request.AlumnoRegistroRequestDTO;
import pe.edu.idat.rest.view.dto.response.AlumnoActualizacionResponseDTO;
import pe.edu.idat.rest.view.dto.response.AlumnoListadoPorCursoResponseDTO;
import pe.edu.idat.rest.view.dto.response.AlumnoListadoResponseDTO;
import pe.edu.idat.rest.view.dto.response.AlumnoListarResponseDTO;
import pe.edu.idat.rest.view.dto.response.AlumnoRegistroResponseDTO;
import pe.edu.idat.rest.view.exception.DemoSOAException;

@RestController
@CrossOrigin(allowCredentials = "true", origins = { "*" }, allowedHeaders = { "*" }, methods = { RequestMethod.GET,
		RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@RequestMapping(value = { "/api/v1/alumnos" })
public class AlumnoController {

	@Autowired
	private AlumnoService alumnoService;

	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ResponseBody
	public AlumnoRegistroResponseDTO registroAlumno(
			@Valid @RequestBody AlumnoRegistroRequestDTO alumnoRegistroRequestDTO, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			throw new DemoSOAException("Error en atributos obligatorios del request alumnoRegistroRequestDTO",
					bindingResult);
		}
		return alumnoService.registrarAlumno(alumnoRegistroRequestDTO);
	}

	@RequestMapping(value = "/", method = RequestMethod.PUT)
	@ResponseBody
	public AlumnoActualizacionResponseDTO actualizarInstitucion(
			@Valid @RequestBody AlumnoActualizacionRequestDTO alumnoActualizacionRequestDTO,
			BindingResult bindingResult) throws Exception {

		if (bindingResult.hasErrors()) {
			throw new DemoSOAException("Error en atributos obligatorio del request alumnoActualizacionRequestDTO",
					bindingResult);
		}
		return alumnoService.actualizarAlumno(alumnoActualizacionRequestDTO);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public AlumnoListadoResponseDTO listarAlumnos() {
		return alumnoService.listarAlumnos();
	}

	@RequestMapping(value = "/{codigo-curso}", method = RequestMethod.GET)
	@ResponseBody
	public AlumnoListadoPorCursoResponseDTO listarAlumnosPorCurso(
			@PathVariable(value = "codigo-curso") Integer codigo) {
		return alumnoService.listarPorCurso(codigo);
	}
	
	@RequestMapping(value = "/alumno/{codigo-alumno}", method = RequestMethod.GET)
	@ResponseBody
	public AlumnoListarResponseDTO buscarAlumnoPorId(
			@PathVariable(value = "codigo-alumno") Integer codigo) {
		return alumnoService.buscarAlumnoPorId(Long.valueOf(codigo));
	}

//	
//	@RequestMapping(value ="/sedes/registros", method = RequestMethod.POST)
//	@ResponseBody
//	public InstitucionSedeRegistroResponseDTO registroSede(
//		@Valid @RequestBody InstitucionSedeRegistroRequestDTO institucionSedeRegistroRequestDTO,
//		BindingResult bindingResult
//	) {
//		
//		if( bindingResult.hasErrors() ) {
//			throw new DemoSOAException(
//				"Error en atributos obligatorios del request InstitucionSedeRegistroRequestDTO",
//				bindingResult
//			);
//		}
//		
//		InstitucionSedeRegistroResponseDTO response = 
//			institucionService.registroSede(institucionSedeRegistroRequestDTO);
//		
//		return response;
//	}
//	
//	
//	@RequestMapping(value="/{id}/sedes", method = RequestMethod.GET)
//	@ResponseBody
//	public InstitucionSedeResponseDTO obtenerSedes(
//		@PathVariable(value="id") String id	
//	) {
//		
//		InstitucionSedeResponseDTO response = institucionService.obtenerSedes(id);
//		
//		return response;
//	}
//	

}
