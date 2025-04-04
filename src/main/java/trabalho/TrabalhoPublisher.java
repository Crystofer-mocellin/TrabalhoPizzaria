package trabalho;

import jakarta.xml.ws.Endpoint;
import trabalho.services.FuncoesSIB;

public class TrabalhoPublisher {

    public static void main(String[] args) {
        Endpoint.publish(
                "http://localhost:8080/usuario",
                new FuncoesSIB());

                System.out.println("Serviço publicado");

    }
}
