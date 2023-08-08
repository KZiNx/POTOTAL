package model;

public class Produto {
    private String nomePro;
    private double preco;
    private int quantidade;
    private String categoria;
    private String descricao;
    private int estoque;

    public Produto(String nomePro, double preco) {
        this.nomePro = nomePro;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNomePro() {
        return nomePro;
    }

    public void setNomePro(String nomePro) {
        this.nomePro = nomePro;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            throw new IllegalArgumentException("Produto com preço inválido");
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            throw new IllegalArgumentException("Produto com quantidade inválida");
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        if (estoque >= 0) {
            this.estoque = estoque;
        } else {
            throw new IllegalArgumentException("Produto com estoque inválido");
        }
    }
}
