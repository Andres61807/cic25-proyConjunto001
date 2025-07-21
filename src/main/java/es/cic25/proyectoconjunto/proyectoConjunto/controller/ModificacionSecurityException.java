package es.cic25.proyectoconjunto.proyectoConjunto.controller;

public class ModificacionSecurityException extends RuntimeException {

    public ModificacionSecurityException() {
        super("Has tratado de modificar mediante creación");
    }


    public ModificacionSecurityException(String message) {
        super(message);
    }

    public ModificacionSecurityException(String message, Throwable throable) {
        super(message, throable);
    }


}
