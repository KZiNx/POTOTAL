public class Pagamento {

    private double precoFinal;
    private String metodoPagamento;
    private int parcelas;

    public Pagamento(double precoFinal, String metodoPagamento, int parcelas) {
        setPrecoFinal(precoFinal);
        setMetodoPagamento(metodoPagamento);
        setParcelas(parcelas);
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public void calcularValorParcelas(){
        System.out.println("O valor da parcela: RS" + (precoFinal / parcelas));
    }

}



