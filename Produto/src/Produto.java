public class Produto {
    private String nome;
    private double valor;
    private int codigo;

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public Produto(String nome, double valor, int codigo) {
        this.nome = nome;
        this.valor = valor;
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", codigo=" + codigo +
                '}';
    }
}
