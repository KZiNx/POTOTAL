import java.util.ArrayList;

public class Main {
    public static ArrayList<Produto> listaDeProdutos = new ArrayList<>();
    public static ArrayList<Cliente> listaDeClientes = new ArrayList<>();

    public static void main(String[] args) {

        criarProdutos();
        criarClientes();

        for (int i = 0; i < listaDeClientes.size(); i++) {
            Cliente c = listaDeClientes.get(i);
            c.enviarEmail();
            Produto p = listaDeProdutos.get(i);
            if (p.getEstoque() >= i) {
                fazerCompra(c, p, i + 5);
            }
        }
    }

    public static void criarProdutos() {
        Produto p = new Produto(31245, "PC", 4500.99, 10);
        listaDeProdutos.add(p);
        Produto p1 = new Produto(78845, "Celular", 1200.99, 17);
        listaDeProdutos.add(p1);
        Produto p2 = new Produto(15482, "Comoda", 599.90, 2127);
        listaDeProdutos.add(p2);
    }

    public static void criarClientes() {
        Cliente c = new Cliente("Zéca", "123.456.789-01", "ZéZéduasbala@estudante.sc.senai.br", true);
        listaDeClientes.add(c);
        Cliente c1 = new Cliente("Thiago", "123.456.789-02", "Thiaguin@outlook.com", true);
        listaDeClientes.add(c1);
        Cliente c2 = new Cliente("Jalim", "123.456.789-03", "Jalim_Habei@gmail.com", false);
        listaDeClientes.add(c2);
    }

    public static void fazerCompra(Cliente cliente, Produto produto, int quantidade) {
        double precoFinal = produto.getPreco() * quantidade;
        Pagamento pagamento = new Pagamento(precoFinal, "cartao", 2);
        pagamento.calcularValorParcelas();

        Envio envio = new Envio("892.058.100", "Escolinha FF");

        Pedido novoPedido = new Pedido(123, produto, quantidade, cliente, pagamento, envio);

        cliente.adicionarPedido(novoPedido);

        novoPedido.emitirNotaFiscal();

        produto.removerEstoque(quantidade);

        envio.avisoEntrega();
    }

}


