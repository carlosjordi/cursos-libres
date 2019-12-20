package pe.edu.idat.rest.view.exception;

import org.springframework.validation.Errors;

/**
 * Clase Exception para Base de Datos
 * 
 * @author digital-is
 */
public class DemoException extends DemoBaseException {

	private static final long serialVersionUID = -321198944673468713L;

	private Errors errors;

	
	public DemoException(String message, Errors errors) {
		super(message);
		this.errors = errors;
	}

	public Errors getErrors() {
		return errors;
	}
	

}
