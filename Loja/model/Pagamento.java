package model;
public class Pagamento {

    private Cliente cliente;
    private Carrinho carrinho;
    private double valorTotal;
    private String formaPagamento;

    public Pagamento(Cliente cliente, Carrinho carrinho, double valorTotal, String formaPagamento) {
        this.cliente = cliente;
        this.carrinho = carrinho;
        this.valorTotal = valorTotal;
        this.formaPagamento = formaPagamento;
    }

    public void processarPagamento() {
        if (cliente.getSaldo() >= valorTotal) {
            cliente.setSaldo(cliente.getSaldo() - valorTotal);
            carrinho.esvaziarCarrinho();
            System.out.println("Pagamento realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente. Pagamento não foi efetuado.");
        }
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }
}
