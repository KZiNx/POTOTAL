import java.util.ArrayList;
public class Pedido {

    private long numeroPedido;
    private String status;
    private ArrayList<Produto> carrinho;
    private ArrayList<Integer> quantidades;
    private Cliente cliente;
    private Pagamento pagamento;
    private Envio envio;

    public Pedido(long numeroPedido, ArrayList<Produto> carrinho, ArrayList<Integer> quantidades, Cliente cliente, Pagamento pagamento, Envio envio) {
        setNumeroPedido(numeroPedido);
        setStatus("aguardado pagamento");
        setCarrinho(carrinho);
        setQuantidades(quantidades);
        setCliente(cliente);
        setPagamento(pagamento);
        setEnvio(envio);
    }

    public Pedido(long numeroPedido, Produto produto, int quantidade, Cliente cliente, Pagamento pagamento, Envio envio) {
        setNumeroPedido(numeroPedido);
        setStatus("aguardado pagamento");

        ArrayList<Produto> carrinho = new ArrayList<>();
        carrinho.add(produto);
        setCarrinho(carrinho);

        ArrayList<Integer> quantidades = new ArrayList<>();
        quantidades.add(quantidade);
        setQuantidades(quantidades);

        setCliente(cliente);
        setPagamento(pagamento);
        setEnvio(envio);
    }

    public long getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(long numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Produto> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(ArrayList<Produto> carrinho) {
        this.carrinho = carrinho;
    }

    public ArrayList<Integer> getQuantidades() {
        return quantidades;
    }

    public void setQuantidades(ArrayList<Integer> quantidades) {
        this.quantidades = quantidades;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Envio getEnvio() {
        return envio;
    }

    public void setEnvio(Envio envio) {
        this.envio = envio;
    }

    public void emitirNotaFiscal() {
        String produtosCarrinho = "";
        for (int i = 0; i < carrinho.size(); i++){
            Produto p = carrinho.get(i);
            Integer q = quantidades.get(i);
            produtosCarrinho += " Produto:" + p.getNome() + "\n Quantidade " + q + "\n Preço por unidade: RS" + p.getPreco();
        }

        System.out.println("pedido " + numeroPedido
        + "\n Cliente: " + cliente.getNome()
        + produtosCarrinho
        + "\n Preço total: RS" + pagamento.getPrecoFinal());
    }

    public void acompanharStatus() {
        System.out.println(envio.getStatus());
    }

}


