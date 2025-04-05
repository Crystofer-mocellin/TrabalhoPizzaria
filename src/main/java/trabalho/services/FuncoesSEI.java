package trabalho.services;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import trabalho.exceptions.UsuarioException;

@WebService
public interface FuncoesSEI {

    @WebMethod
    String boasVindas(@WebParam(name = "nome") String nome,
                      @WebParam(name = "cpf") Integer cpf,
                      @WebParam(name = "email") String email,
                      @WebParam(name = "telefone") String telefone,
                      @WebParam(name = "senha") String senha)
            throws UsuarioException;

@WebMethod
String salvarNovoUsuario(@WebParam(name = "nome") String nome,
                         @WebParam(name = "cpf") Integer cpf,
                         @WebParam(name = "email") String email,
                         @WebParam(name = "telefone") String telefone,
                         @WebParam(name = "senha") String senha)
        throws UsuarioException;
}