//package pe.edu.idat.rest.view.controller;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import pe.edu.idat.rest.transactional.service.InstitucionService;
//import pe.edu.idat.rest.view.dto.request.InstitucionActualizacionRequestDTO;
//import pe.edu.idat.rest.view.dto.request.InstitucionRegistroRequestDTO;
//import pe.edu.idat.rest.view.dto.request.InstitucionSedeRegistroRequestDTO;
//import pe.edu.idat.rest.view.dto.response.InstitucionActualizacionResponseDTO;
//import pe.edu.idat.rest.view.dto.response.InstitucionDatoResponseDTO;
//import pe.edu.idat.rest.view.dto.response.InstitucionRegistroResponseDTO;
//import pe.edu.idat.rest.view.dto.response.InstitucionSedeListaResponseDTO;
//import pe.edu.idat.rest.view.dto.response.InstitucionSedeRegistroResponseDTO;
//import pe.edu.idat.rest.view.dto.response.InstitucionSedeResponseDTO;
//import pe.edu.idat.rest.view.exception.DemoSOAException;
//
//@RestController
//@RequestMapping(value = {"/api/v1/instituciones"})
//public class InstitucionController {
//	
//	@Autowired
//	private InstitucionService institucionService;
//	
//	
//	@RequestMapping(value = "/registros", method = RequestMethod.POST)
//	@ResponseBody
//	public InstitucionRegistroResponseDTO registroInstitucion(
//		@Valid @RequestBody InstitucionRegistroRequestDTO institucionRegistroRequestDTO,
//		BindingResult bindingResult
//	) {
//		
//		if( bindingResult.hasErrors() ) {
//			throw new DemoSOAException(
//				"Error en atributos obligatorios del request InstitucionRegistroRequestDTO",
//				bindingResult
//			);
//		}
//		
//		InstitucionRegistroResponseDTO response = institucionService.registroInstitucion(
//			institucionRegistroRequestDTO
//		);
//		
//		return response;
//	}
//	
//	@RequestMapping(value = "/datos/{codigo-modular}")
//	@ResponseBody
//	public InstitucionDatoResponseDTO dataInstitucion(
//		@PathVariable(value="codigo-modular") String codigoModular) {
//		
//		InstitucionDatoResponseDTO response = institucionService.dataInstitucion(codigoModular);
//		
//		return response;
//	}
//	
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
//	
//	@RequestMapping(value = "/actualizaciones", method = RequestMethod.POST)
//	@ResponseBody
//	public InstitucionActualizacionResponseDTO actualizarInstitucion(
//		@Valid @RequestBody InstitucionActualizacionRequestDTO institucionActualizacionRequestDTO, 
//		BindingResult bindingResult
//	) throws Exception {
//		
//		if(bindingResult.hasErrors()) {
//			throw new DemoSOAException(
//				"Error en atributos obligatorio del request InstitucionActualizacionRequestDTO", 
//				bindingResult
//			);
//		}
//		
//		InstitucionActualizacionResponseDTO institucionActualizacionResponseDTO = new InstitucionActualizacionResponseDTO();
//		
//		
//		return institucionActualizacionResponseDTO;
//		
//	}		
//
//	
//	
//}
