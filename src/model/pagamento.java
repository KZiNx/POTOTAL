package model;

public class pagamento {

    private double total;
    private double frete;
    private String venda;
    private int parcela;
    private int desconto;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        if (total > 0) {
            this.total = total;
        }
    }

    public int getParcela() {
        return parcela;
    }

    public void setParcela(int parcela) {
        if (parcela >= 1) {
            this.parcela = parcela;
        }
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        if (desconto >= 0) {
            this.desconto = desconto;
        }
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        if (frete >= 0) {
            this.frete = frete;
        }
    }

    public String getVenda() {
        return venda;
    }

    public void setVenda(String venda) {
        this.venda = venda;
    }
}
