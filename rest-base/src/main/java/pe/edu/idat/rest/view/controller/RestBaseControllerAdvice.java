package pe.edu.idat.rest.view.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import pe.edu.idat.rest.view.dto.response.BaseResponseDTO;
import pe.edu.idat.rest.view.exception.DemoException;
import pe.edu.idat.rest.view.exception.DemoSOAException;
import pe.edu.idat.rest.view.exception.ErrorResourceDTO;
import pe.edu.idat.rest.view.exception.FieldErrorResourceDTO;


@ControllerAdvice(basePackages = {"pe.edu.idat.rest.view.controller"})
public class RestBaseControllerAdvice extends ResponseEntityExceptionHandler {
	

	@ExceptionHandler({ DemoSOAException.class })
    protected ResponseEntity<Object> handleInvalidRequestSOA(RuntimeException e, WebRequest request) {

		//-- Variables
		DemoSOAException exceptionBase = (DemoSOAException) e;
        List<FieldErrorResourceDTO> fieldErrorResources = new ArrayList<FieldErrorResourceDTO>();
        
        //-- Logica - fields
        if(exceptionBase.getErrors()!=null) {
	        List<FieldError> fieldErrors = exceptionBase.getErrors().getFieldErrors();
	        for (FieldError fieldError : fieldErrors) {
	            FieldErrorResourceDTO fieldErrorResource = new FieldErrorResourceDTO();
	            fieldErrorResource.setResource(fieldError.getObjectName());
	            fieldErrorResource.setField(fieldError.getField());
	            fieldErrorResource.setCode(fieldError.getCode());
	            fieldErrorResource.setMessage(fieldError.getDefaultMessage());
	            
	            fieldErrorResources.add(fieldErrorResource);
	        }
        }
        
        ErrorResourceDTO error = new ErrorResourceDTO("99", exceptionBase.getMsjError());
        error.setFieldErrors(fieldErrorResources);

        //-- Logica - header
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        // estoy comentando esto por lo mismo
        //headers.setAccessControlAllowOrigin("*");
        
        //-- Respuesta
        BaseResponseDTO response = new BaseResponseDTO();
        response.setObjErrorResource(error);
        response.setCodigoRespuesta("99");
        response.setMensajeRespuesta(error.getMessage());
        
        return handleExceptionInternal(e, response, headers, HttpStatus.OK, request); //-- TODO: debe ser HttpStatus.UNPROCESSABLE_ENTITY, pero se pondra 200 para no complicar al front-end
    }
	
	@ExceptionHandler({ DemoException.class })
    protected ResponseEntity<Object> handleInvalidRequestBD(RuntimeException e, WebRequest request) {
		
		//-- Variables
		DemoException exceptionBase = (DemoException) e;

        //-- Logica - base
        ErrorResourceDTO error = new ErrorResourceDTO("99", exceptionBase.getMsjError());
        
        //-- Logica header
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        // estoy comentando esto para ver si así nos comunicamos con el front
        //headers.setAccessControlAllowOrigin("*");
        
        //-- Respuesta
        BaseResponseDTO response = new BaseResponseDTO();
        response.setObjErrorResource(error);
        response.setCodigoRespuesta("99");
        response.setMensajeRespuesta(error.getMessage());
        
        return handleExceptionInternal(e, response, headers, HttpStatus.OK, request); //-- TODO: debe ser HttpStatus.UNPROCESSABLE_ENTITY, pero se pondra 200 para no complicar al front-end
    }
	
	
}
