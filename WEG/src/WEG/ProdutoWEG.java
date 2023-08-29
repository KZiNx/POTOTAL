package WEG;

public class ProdutoWEG {

  private String codigo;
  private String tipo;
  private int potencia;
  private int tensao;
  private double capacidade;
  private double preco;

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public int getPotencia() {
    return potencia;
  }

  public void setPotencia(int potencia) {
    this.potencia = potencia;
  }

  public int getTensao() {
    return tensao;
  }

  public void setTensao(int tensao) {
    this.tensao = tensao;
  }

  public double getCapacidade() {
    return capacidade;
  }

  public void setCapacidade(double capacidade) {
    this.capacidade = capacidade;
  }

  public double getPreco() {
    return preco;
  }

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
   */
  public void descricaoProduto() {
    // TODO: Implementar a descrição do produto
  }
}
