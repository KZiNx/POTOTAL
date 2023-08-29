package WEG;

/**
 * A classe ProdutoWEG representa um produto da empresa WEG.
 */
public class ProdutoWEG {

    private String codigo;
    private String tipo;
    private int potencia;
    private int tensao;
    private double capacidade;
    private double preco;

    /**
     * Obtém o código do produto.
     *
     * @return O código do produto.
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define o código do produto.
     *
     * @param codigo O código do produto a ser definido.
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtém o tipo do produto.
     *
     * @return O tipo do produto.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define o tipo do produto.
     *
     * @param tipo O tipo do produto a ser definido.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtém a potência do produto.
     *
     * @return A potência do produto.
     */
    public int getPotencia() {
        return potencia;
    }

    /**
     * Define a potência do produto.
     *
     * @param potencia A potência do produto a ser definida.
     */
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    /**
     * Obtém a tensão do produto.
     *
     * @return A tensão do produto.
     */
    public int getTensao() {
        return tensao;
    }

    /**
     * Define a tensão do produto.
     *
     * @param tensao A tensão do produto a ser definida.
     */
    public void setTensao(int tensao) {
        this.tensao = tensao;
    }

    /**
     * Obtém a capacidade do produto.
     *
     * @return A capacidade do produto.
     */
    public double getCapacidade() {
        return capacidade;
    }

    /**
     * Define a capacidade do produto.
     *
     * @param capacidade A capacidade do produto a ser definida.
     */
    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    /**
     * Obtém o preço do produto.
     *
     * @return O preço do produto.
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Define o preço do produto.
     *
     * @param preco O preço do produto a ser definido.
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * Construtor da classe ProdutoWEG.
     *
     * @param codigo     O código do produto.
     * @param tipo       O tipo do produto.
     * @param preco      O preço do produto.
     * @param potencia   A potência do produto.
     * @param tensao     A tensão do produto.
     * @param capacidade A capacidade do produto.
     */
    public ProdutoWEG(
            String codigo,
            String tipo,
            double preco,
            int potencia,
            int tensao,
            double capacidade
    ) {
        setCodigo(codigo);
        setTipo(tipo);
        setPreco(preco);
        setPotencia(potencia);
        setTensao(tensao);
        setCapacidade(capacidade);
    }

    /**
     * Construtor vazio da classe ProdutoWEG.
     */
    public ProdutoWEG() {}

    /**
     * Método de descrição do produto.
     * TODO: Implementar a descrição do produto
     */
    public void descricaoProduto() {
        // TODO: Implementar a descrição do produto
    }
}
