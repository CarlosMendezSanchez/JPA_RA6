package com.hlc.usuario_uno_a_uno.error.excepcion;

public class ResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(String message) {
        super(message);
    }
}