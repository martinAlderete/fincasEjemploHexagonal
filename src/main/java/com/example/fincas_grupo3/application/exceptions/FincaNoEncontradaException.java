package com.example.fincas_grupo3.application.exceptions;

public class FincaNoEncontradaException extends ObjectNotFoundException {
    public FincaNoEncontradaException(String message) {
        super(message);
    }
}
