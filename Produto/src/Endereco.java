public class Endereco {
    private Boolean enderecoAtual;
    private String rua;
    private String estado;
    private int numero;
    private String cep;
    private String cidade;
    private String pais;

    public String getEnderecoCompleto() {
        return String.format("%s, %d - %s - %s", rua, numero, cep, pais);
    }

    public String getRua() {
        return rua;
    }

    public String getEstado() {
        return estado;
    }

    public int getNumero() {
        return numero;
    }

    public String getCep() {
        return cep;
    }

    public String getPais() {
        return pais;
    }

    public String getCidade() {
        return cidade;
    }

    public Endereco(String rua, String estado, int numero, String cep, String cidade, String pais, Boolean enderecoAtual) {
        this.rua = rua;
        this.estado = estado;
        this.numero = numero;
        this.cep = cep;
        this.cidade = cidade;
        this.pais = pais;
        this.enderecoAtual = enderecoAtual;
    }

    @Override
    public String toString() {
        return "EnderecoCliente{" +
                "enderecoAtual=" + enderecoAtual +
                ", rua='" + rua + '\'' +
                ", estado='" + estado + '\'' +
                ", numero=" + numero +
                ", cep='" + cep + '\'' +
                ", cidade='" + cidade + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
