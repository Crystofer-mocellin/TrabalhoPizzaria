package trabalho.models;
import java.util.List;

public class Pedido {


    public class Pedido{
        private int id;
        private Cliente cliente;
        private List<SaborPizza> sabores;
        private Borda borda;
        private double valorTotal;
        private Status status;

        public enum Status {
            RECEBIDO,
            EM_PREPARO,
            PRONTO_PARA_RETIRADA,
            SAIU_PARA_ENTREGA,
            ENTREGUE
        }

        // Getters e Setters
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Cliente getCliente() {
            return cliente;
        }

        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }

        public List<SaborPizza> getSabores() {
            return sabores;
        }

        public void setSabores(List<SaborPizza> sabores) {
            this.sabores = sabores;
        }

        public Borda getBorda() {
            return borda;
        }

        public void setBorda(Borda borda) {
            this.borda = borda;
        }

        public double getValorTotal() {
            return valorTotal;
        }

        public void setValorTotal(double valorTotal) {
            this.valorTotal = valorTotal;
        }

        public Status getStatus() {
            return status;
        }

        public void setStatus(Status status) {
            this.status = status;
        }
    }

}
