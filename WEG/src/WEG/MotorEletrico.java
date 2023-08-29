package WEG;

public class MotorEletrico extends ProdutoWEG {

  private String tipoEnrolamento;
  private double eficiência;

  public String getTipoEnrolamento() {
    return tipoEnrolamento;
  }

  public void setTipoEnrolamento(String tipoEnrolamento) {
    this.tipoEnrolamento = tipoEnrolamento;
  }

  public double getEficiência() {
    return eficiência;
  }

  public void setEficiência(double eficiência) {
    this.eficiência = eficiência;
  }

  /**
   * Método principal da classe MotorEletrico (exemplo de uso).
   *
   * @param args Os argumentos de linha de comando (não utilizados aqui).
   */
  public static void main(String[] args) {
    MotorEletrico motor = new MotorEletrico(
      "#456",
      "Motor",
      750,
      220,
      1,
      399.99,
      "Dupla Camada",
      0.85
    );

    System.out.println("Código: " + motor.getCodigo());
    System.out.println("Tipo: " + motor.getTipo());
    System.out.println("Potência: " + motor.getPotencia());
    System.out.println("Tensão: " + motor.getTensao());
    System.out.println("Capacidade: " + motor.getCapacidade());
    System.out.println("Preço: " + motor.getPreco());
    System.out.println("Tipo de Enrolamento: " + motor.getTipoEnrolamento());
    System.out.println("Eficiência: " + motor.getEficiência());
  }

  /**
   * Construtor da classe MotorEletrico.
   *
   * @param codigo          O código do motor elétrico.
   * @param tipo            O tipo do motor elétrico.
   * @param preco           O preço do motor elétrico.
   * @param potencia        A potência do motor elétrico.
   * @param tensao          A tensão do motor elétrico.
   * @param capacidade      A capacidade do motor elétrico.
   * @param tipoEnrolamento O tipo de enrolamento do motor elétrico.
   * @param eficiência      A eficiência do motor elétrico.
   */
  public MotorEletrico(
    String codigo,
    String tipo,
    double preco,
    int potencia,
    int tensao,
    double capacidade,
    String tipoEnrolamento,
    double eficiência
  ) {
    super(codigo, tipo, preco, potencia, tensao, capacidade);
    this.tipoEnrolamento = tipoEnrolamento;
    this.eficiência = eficiência;
  }

  /**
   * Realiza uma manutenção no motor elétrico.
   *
   * @param servico1 O serviço de manutenção a ser realizado.
   */
  public void realizarManutencao(ServicoManutencao servico1) {
    // TODO: Implementar a lógica de realização de manutenção para o motor elétrico
  }
}
