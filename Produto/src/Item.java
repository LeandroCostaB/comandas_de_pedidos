public class Item {
    private int quantidade;
    private Produto produto;

    public void incluirProduto(Produto produto) {
        this.produto = produto;
    }

    public Item(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Item{" +
                "quantidade=" + quantidade +
                ", produto=" + produto +
                '}';
    }
}
