package com.email.proveider.core.exceptions;

public class ErrorMailSenderException  extends RuntimeException{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ErrorMailSenderException() {
		super();
	}
	
	public ErrorMailSenderException(String mesage) {
		super(mesage);
	}
	
	public ErrorMailSenderException(String mesage, Throwable cause) {
		super(mesage, cause);
	}

	public ErrorMailSenderException(Throwable cause) {
		// TODO Auto-generated constructor stub
	}
}
