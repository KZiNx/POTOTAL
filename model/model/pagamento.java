package model;

public class pagamento {

    private double total;
    private double frete;
    private String venda;
    private int parcela;
    private int desconto;

    /**
     * 
     * @return (double)
     */
    public double getTotal() {
        return total;
    }

    /**
     * 
     * @param total (double)
     */
    public void setTotal(double total) {
        if (total > 0) {
            this.total = total;
        }
    }
    
    /**
     *
     * @return (int)
     */
    public int getParcela() {
        return parcela;
    }

    /**
     * 
     * @param parcela (int)
     */
    public void setParcela(int parcela) {
        if (parcela >= 1) {
            this.parcela = parcela;
        }
    }

    /**
     * 
     * @return (int)
     */
    public int getDesconto() {
        return desconto;
    }

    /**
     * 
     * @param desconto (int)
     */
    public void setDesconto(int desconto) {
        if (desconto >= 0) {
            this.desconto = desconto;
        }
    }

    /**
     * metodo que retorna o valor do frete
     * 
     * @return (double)
     */
    public double getFrete() {
        return frete;
    }

    /**
     * 
     * @param frete (double)
     */
    public void setFrete(double frete) {
        if (frete >= 0) {
            this.frete = frete;
        }
    }

    /**
     * 
     * @return (String)
     */
    public String getVenda() {
        return venda;
    }

    /**
     * 
     * @param venda (String)
     */
    public void setVenda(String venda) {
        this.venda = venda;
    }
}