package WEG;

public class Gerador extends ProdutoWEG {

  private String Tipocombustivel;
  private String autonomia;

  /**
   * Construtor da classe Gerador.
   *
   * @param codigo          O código do gerador.
   * @param tipo            O tipo do gerador.
   * @param preco           O preço do gerador.
   * @param potencia        A potência do gerador.
   * @param tensao          A tensão do gerador.
   * @param capacidade      A capacidade do gerador.
   * @param Tipocombustivel O tipo de combustível do gerador.
   * @param autonomia       A autonomia do gerador.
   */
  public Gerador(
    String codigo,
    String tipo,
    double preco,
    int potencia,
    int tensao,
    double capacidade,
    String Tipocombustivel,
    String autonomia
  ) {
    super(codigo, tipo, preco, potencia, tensao, capacidade);
    this.Tipocombustivel = Tipocombustivel;
    this.autonomia = autonomia;
  }

  /**
   * Retorna o tipo de combustível do gerador.
   *
   * @return O tipo de combustível do gerador.
   */
  public String getTipocombustivel() {
    return Tipocombustivel;
  }

  /**
   * Define o tipo de combustível do gerador.
   *
   * @param Tipocombustivel O novo tipo de combustível do gerador.
   */
  public void setTipocombustivel(String Tipocombustivel) {
    this.Tipocombustivel = Tipocombustivel;
  }

  /**
   * Retorna a autonomia do gerador.
   *
   * @return A autonomia do gerador.
   */
  public String getAutonomia() {
    return autonomia;
  }

  /**
   * Define a autonomia do gerador.
   *
   * @param autonomia A nova autonomia do gerador.
   */
  public void setAutonomia(String autonomia) {
    this.autonomia = autonomia;
  }

  /**
   * Método principal da classe Gerador (exemplo de uso).
   *
   * @param args Os argumentos de linha de comando (não utilizados aqui).
   */
  public static void main(String[] args) {
    Gerador gerador = new Gerador(
      "#789",
      "Gerador",
      799.99,
      300,
      220,
      50.0,
      "Gasolina",
      "365 dias"
    );

    System.out.println("Código: " + gerador.getCodigo());
    System.out.println("Tipo: " + gerador.getTipo());
    System.out.println("Preço: " + gerador.getPreco());
    System.out.println("Potência: " + gerador.getPotencia());
    System.out.println("Tensão: " + gerador.getTensao());
    System.out.println("Capacidade: " + gerador.getCapacidade());
    System.out.println("Tipo de combustível: " + gerador.getTipocombustivel());
    System.out.println(
      "Número de dias que pode ficar ligado: " + gerador.getAutonomia()
    );
  }
}
