package trabalho;

import jakarta.xml.ws.Endpoint;
import trabalho.services.funcoesSIB;

public class TrabalhoPublisher {

    public static void main(String[] args) {
        Endpoint.publish(
                "http://localhost:8080/usuario",
                new funcoesSIB());

                System.out.println("Serviço publicado");

    }
}
