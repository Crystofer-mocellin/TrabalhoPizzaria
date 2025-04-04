package trabalho.services;

import jakarta.jws.WebService;
import trabalho.daos.ClienteDAO;
import trabalho.models.Cliente;

@WebService(endpointInterface =
"trabalho.services.FuncoesSEI")
public class FuncoesSIB implements FuncoesSEI {

    @Override
    public String boasVindas(String nome, Integer cpf, String email, String telefone, String senha){
       Cliente cliente = new Cliente();
       cliente.setNome(nome);
       cliente.setCpf(cpf);
       cliente.setEmail(email);
       cliente.setTelefone(telefone);
       cliente.setSenha(senha);

       if(clienteExiste(cliente.getCpf())){
           return "Bem vindo(a) de volta" + nome;
       } else {
           salvarNovoCliente(cliente);
           return "Cadastro efetuado com sucesso!";
       }
    }

    @Override
    public String salvarNovoCliente(String nome, Integer cpf, String email, String telefone, String senha){
     Cliente cliente = new Cliente(nome, cpf, email, telefone, senha);
     ClienteDAO dao = new ClienteDAO();
     dao.salvar(cliente);

     return "Cadastro efetuado com sucesso!";
    }

}
