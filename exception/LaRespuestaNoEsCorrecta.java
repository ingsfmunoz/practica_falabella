package practica.exception;


public class LaRespuestaNoEsCorrecta extends AssertionError {               

    public LaRespuestaNoEsCorrecta(String message, Throwable cause) {       
        super(message, cause);
    }
}