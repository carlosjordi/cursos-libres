package pe.edu.idat.rest.view.exception;

import org.springframework.validation.Errors;

/**
 * Clase Exception para SOA (Rest, SOAP, JMS) 
 * 
 * @author digital-is
 */
public class DemoSOAException extends DemoBaseException {

	private static final long serialVersionUID = -4432439686788994771L;

	private Errors errors;

	
	public DemoSOAException(String message, Errors errors) {
		super(message);
		this.errors = errors;
	}

	public Errors getErrors() {
		return errors;
	}
	
	
}
