import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int codigo;
    private String dataDeEntrega;
    private Cliente cliente;
    private Endereco endereco;
    private List<Item> itens;

    public String getDataDeEntrega() {
        return dataDeEntrega;
    }

    public int getCodigo() {
        return codigo;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void incluirEndereco(Endereco address) {
        this.endereco = address;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void incluirCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void incluirItem(Item item) {
        itens.add(item);
    }

    public Pedido(int codigo, String dataDeEntrega) {
        this.codigo = codigo;
        this.dataDeEntrega = dataDeEntrega;
        this.itens = new ArrayList<>();
    }
}
