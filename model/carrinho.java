public class carrinho {

    private cliente cliente;
    private int quantidade;
    private int valor;

    /**
     * 
     * 
     * @return (Cliente)
     */
    public cliente getCliente() {
        return cliente;
    }

    /**
     * 
     * @param cliente (Cliente)
     */
    public void setCliente(cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * 
     * @return (int)
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     *
     * 
     * @param quantidade (int)
     */
    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            System.out.print("quantidade invalida");
        }
    }

    /**
     * 
     * @return (int)
     */
    public int getValor() {
        return valor;
    }

    /**
     * 
     * 
     * @param valor (int)
     */
    public void setValor(int valor) {
        if (valor >= 0) {
            this.valor = valor;
        } else {
            System.out.print("valor invalido");
        }
    }

}