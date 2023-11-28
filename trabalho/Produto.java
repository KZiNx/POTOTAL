public class Produto {

    private long numeroCadastro;
    private String nome;
    private double preco;
    private int estoque;

    public Produto(long numeroCadastro, String nome, double preco, int estoque) {
        setNumeroCadastro(numeroCadastro);
        setNome(nome);
        setPreco(preco);
        setEstoque(estoque);
    };

    public long getNumeroCadastro() {
        return numeroCadastro;
    }

    public void setNumeroCadastro(long numeroCadastro) {
        this.numeroCadastro = numeroCadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void alterarPreco(double preco) {
        setPreco(preco);
    }

    public void adicionarEstoque(int quantidade) {
        setEstoque(estoque + quantidade);
    }

    public void removerEstoque(int quantidade) {
        setEstoque(estoque - quantidade);
    }

}
