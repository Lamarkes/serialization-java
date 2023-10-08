import java.io.Serializable;

public class Carrinho implements Serializable {

    private Produto produto;
    private Double total;

    public Carrinho() {
    }

    public Carrinho(Produto produto, Double total) {
        this.produto = produto;
        this.total = total;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Carrinho{" +
                "produto=" + produto +
                ", total=" + total +
                '}';
    }
}
