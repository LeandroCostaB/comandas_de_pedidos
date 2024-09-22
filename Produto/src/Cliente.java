import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private int idade;
    private Endereco endereco;
    private List<Pedido> pedidos;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.pedidos = new ArrayList<>();
    }

    public void fazerPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", endereco=" + endereco +
                '}';
    }

    public void cadastrarEndereco(Endereco address) {
        this.endereco = address;
    }
}
