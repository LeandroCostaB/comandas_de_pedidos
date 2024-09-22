import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente client = new Cliente("Felipe", 18);
        Endereco addressCliente = new Endereco("Rua Alberto Nacional", "PR", 839, "85905-400", "Toledo", "Brasil", true);
        client.cadastrarEndereco(addressCliente);

        Pedido pedido = new Pedido(4345321, "10/10/2024");
        Endereco addressEntrega = new Endereco("Rua Sagitarius A", "PR", 839, "2505-400", "Cascavel", "Brasil", false);
        pedido.incluirCliente(client);
        pedido.incluirEndereco(addressEntrega);

        Produto produtoNotebook = new Produto("Notebook", 1200.0, 102421);
        Item itemNotebook = new Item(2, produtoNotebook);
        pedido.incluirItem(itemNotebook);

        Produto produtoPS5 = new Produto("PS5", 3500.75, 33459);
        Item itemPS5 = new Item(1, produtoPS5);
        pedido.incluirItem(itemPS5);

        client.fazerPedido(pedido);

        List<Pedido> pedidos = client.getPedidos();
        System.out.println("============================================================================");
        System.out.println("■ Nome do Cliente: " + client.getNome());
        System.out.println("■ Endereço do Cliente: " + client.getEndereco().getEnderecoCompleto());
        System.out.println("============================================================================\n");
        System.out.println("■ Pedidos do Cliente:");
        for (int i = 0; i < pedidos.size(); i++) {
            System.out.println("============================================================================");
            Pedido pedidoList = pedidos.get(i);
            System.out.println("■ Número do pedido: " + (i + 1));
            System.out.println("■ Endereço do pedido: " + pedidoList.getEndereco().getEnderecoCompleto());
            System.out.println("■ Código do pedido: " + pedidoList.getCodigo());

            List<Item> itensPedido = pedidoList.getItens();
            System.out.println("\n■ Itens do Pedido:");
            double valorTotal = 0;
            for (Item itemList : itensPedido) {
                Produto produtoList = itemList.getProduto();
                valorTotal += itemList.getQuantidade() * produtoList.getValor();
                System.out.println("    ⬤ Nome do Produto: " + produtoList.getNome());
                System.out.println("    ⬤ Valor do Produto: " + produtoList.getValor());
                System.out.println("    ⬤ Quantidade: " + itemList.getQuantidade() + "\n");
            }

            System.out.println("■ Valor Total: " + valorTotal);
            System.out.println("■ Data de entrega do Pedido: " + pedidoList.getDataDeEntrega());
            System.out.println("============================================================================\n");
        }


    }
}