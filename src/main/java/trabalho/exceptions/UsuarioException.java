package trabalho.exceptions;

import jakarta.xml.ws.WebFault;

@WebFault(name = "UsuarioException")
public class UsuarioException extends Exception {

    public UsuarioException(String message) {
        super(message);
    }
}
