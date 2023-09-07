package com.springboot.demo.exceptions;

public class EmployeeNotFoundException extends RuntimeException {

    /**
	 * 
	 */
//	private static final long serialVersionUID = 1L;

	public EmployeeNotFoundException() {
        super();
    }

    public EmployeeNotFoundException(String message) {
        super(message);
    }

    public EmployeeNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmployeeNotFoundException(Throwable cause) {
        super(cause);
    }
}

