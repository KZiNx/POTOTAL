package model;

public class carrinho {

    private cliente cliente;
    private int quantidade;
    private int valor;

    public cliente getCliente() {
        return cliente;
    }

    public void setCliente(cliente cliente) {
        this.cliente = cliente;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            System.out.println("Quantidade inválida");
        }
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        if (valor >= 0) {
            this.valor = valor;
        } else {
            System.out.println("Valor inválido");
        }
    }

}
