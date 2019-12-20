package pe.edu.idat.rest.transactional.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.idat.rest.persistence.domain.Institucion;
import pe.edu.idat.rest.persistence.repository.InstitucionRepository;
import pe.edu.idat.rest.transactional.service.InstitucionService;
import pe.edu.idat.rest.view.dto.request.InstitucionRegistroRequestDTO;
import pe.edu.idat.rest.view.dto.request.InstitucionSedeRegistroRequestDTO;
import pe.edu.idat.rest.view.dto.response.InstitucionDatoResponseDTO;
import pe.edu.idat.rest.view.dto.response.InstitucionRegistroResponseDTO;
import pe.edu.idat.rest.view.dto.response.InstitucionSedeListaResponseDTO;
import pe.edu.idat.rest.view.dto.response.InstitucionSedeRegistroResponseDTO;
import pe.edu.idat.rest.view.dto.response.InstitucionSedeResponseDTO;
import pe.edu.idat.rest.view.exception.DemoException;

@Transactional
@Service("institucionService")
public class InstitucionServiceImpl implements InstitucionService {

	@Autowired
	private InstitucionRepository institucionRepository;
	
	
	@Override
	public InstitucionRegistroResponseDTO registroInstitucion(
		InstitucionRegistroRequestDTO request
	) {
		
		//-- Validar
		List<Institucion> lista = institucionRepository.findAll();
		Optional<Institucion> codigoModularEncontrado = lista.stream()
			.filter(i -> i.getCodigoModular().equals(request.getCodigoModular()) )
			.findFirst();
		
		if( codigoModularEncontrado.orElse(null) != null ) {
			throw new DemoException(
				"El atributo codigoModular " + request.getCodigoModular() + " ya existe",
				null
			);
		}
		
		//-- Logica
		Institucion institucion = new Institucion();
		institucion.setCodigoModular( request.getCodigoModular() );
		institucion.setRuc( request.getRuc() );
		institucion.setRazonSocial( request.getRazonSocial() );
		institucion.setNombreComercial( request.getNombreComercial() );
		institucion.setDireccion( request.getDireccionLegal() );
		institucion.setUbigeo( request.getUbigeo() );
		institucion.setPrograma( request.getPrograma() );
		institucion.setModalidad( request.getModalidad() );
		institucion.setPaginaWeb( request.getPaginaWeb() );
		institucion.setEstado(1); //-- Activo
		
		institucion = institucionRepository.save(institucion);
		
		//-- Respuesta
		InstitucionRegistroResponseDTO response = new InstitucionRegistroResponseDTO();
		response.setCodigoRespuesta("01");
		response.setMensajeRespuesta("OK");
		response.setId( institucion.getCodigo().toString() );
		
		return response;
	}

	@Override
	public InstitucionDatoResponseDTO dataInstitucion(String codigoModular) {

		//-- Logica
		List<Institucion> lista = institucionRepository.findAll();
		Optional<Institucion> institucion = lista.stream()
			.filter(i -> i.getCodigoModular().equals(codigoModular) )
			.findFirst();

		if( institucion.orElse(null) == null ) {
			InstitucionDatoResponseDTO response = new InstitucionDatoResponseDTO();
			response.setCodigoRespuesta("99");
			response.setMensajeRespuesta( 
				"El codigoModular ".concat(codigoModular).concat(" no existe. Ingrear otro") 
			);
			
			return response;
		}
		
		//-- Respuesta	
		InstitucionDatoResponseDTO response = new InstitucionDatoResponseDTO();
		response.setCodigoRespuesta("01");
		response.setMensajeRespuesta("OK");
		response.setId( institucion.get().getCodigo().toString() );
		response.setCodigoModular( institucion.get().getCodigoModular() );
		response.setRuc( institucion.get().getRuc() );
		response.setRazonSocial( institucion.get().getRazonSocial() );
		response.setNombreComercial( institucion.get().getNombreComercial() );
		response.setDireccionLegal( institucion.get().getDireccion() );
		response.setUbigeo( institucion.get().getUbigeo() );
		response.setPrograma( institucion.get().getPrograma().toString() );
		response.setModalidad( institucion.get().getModalidad().toString() );
		response.setPaginaWeb( institucion.get().getPaginaWeb() );
		
		return response;
	}

	@Override
	public InstitucionSedeRegistroResponseDTO registroSede(
			InstitucionSedeRegistroRequestDTO institucionSedeRegistroRequestDTO) {
		
		if( 
			this.stringToDate(
				institucionSedeRegistroRequestDTO.getFechaInicioActividad(), 
				"dd/MM/yyyy"
			).compareTo( new Date() ) > 0 
		) {
			
			throw new DemoException(
				"El atributo fechaInicioActividad no puede ser mayor a HOY", 
				null
			);
			
		}
		
		
		InstitucionSedeRegistroResponseDTO response = new InstitucionSedeRegistroResponseDTO();
		response.setCodigoRespuesta("01");
		response.setMensajeRespuesta("OK");

		return response;
	}

	@Override
	public InstitucionSedeResponseDTO obtenerSedes(String id) {


		InstitucionSedeResponseDTO response = new InstitucionSedeResponseDTO();
		response.setCodigoRespuesta("01");
		response.setMensajeRespuesta("OK");
		response.setRazonSocial("UTP SAC");
		response.setNombreComercial("UTP");
		
		List<InstitucionSedeListaResponseDTO> sedes =
			new ArrayList<InstitucionSedeListaResponseDTO>();
		InstitucionSedeListaResponseDTO item = null;
		
		item = new InstitucionSedeListaResponseDTO();
		item.setCodigo(1);
		item.setNombreSede("UTP - Tomas Valle");
		item.setDireccion("Av. Tomas Valle S/N");
		item.setUbigeo("150135");
		item.setFechaInicioActividad("10/01/2008");
		item.setModalidad("Superior Universitario");
		item.setPaginaWeb("");
		sedes.add(item);
		
		item = new InstitucionSedeListaResponseDTO();
		item.setCodigo(2);
		item.setNombreSede("UTP - Arequipa");
		item.setDireccion("Av. Arequipa S/N");
		item.setUbigeo("150101");
		item.setFechaInicioActividad("10/02/2002");
		item.setModalidad("Superior Universitario");
		item.setPaginaWeb("");
		sedes.add(item);
		
		response.setSedes(sedes);
		
		
		return response;
	}
	
	
	private Date stringToDate(String date, String format) {
		
		if(date == null) {
			return null;
		}
		
		try {
			return new SimpleDateFormat(format).parse(date);
		} catch (ParseException e) {
			return null;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
