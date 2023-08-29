package WEG;

public class ServicoManutencao {

  private String descricao;
  private double custo;

  /**
   * Construtor da classe ServicoManutencao.
   *
   * @param descricao A descrição do serviço de manutenção.
   * @param custo     O custo do serviço de manutenção.
   */
  public ServicoManutencao(String descricao, double custo) {
    this.descricao = descricao;
    this.custo = custo;
  }

  /**
   * Retorna a descrição do serviço de manutenção.
   *
   * @return A descrição do serviço de manutenção.
   */
  public String getDescricao() {
    return descricao;
  }

  /**
   * Define a descrição do serviço de manutenção.
   *
   * @param descricao A nova descrição do serviço de manutenção.
   */
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  /**
   * Retorna o custo do serviço de manutenção.
   *
   * @return O custo do serviço de manutenção.
   */
  public double getCusto() {
    return custo;
  }

  /**
   * Define o custo do serviço de manutenção.
   *
   * @param custo O novo custo do serviço de manutenção.
   */
  public void setCusto(double custo) {
    this.custo = custo;
  }

  /**
   * Método principal da classe ServicoManutencao .
   *
   * @param args Os argumentos de linha de comando .
   */
  public static void main(String[] args) {
    ServicoManutencao servico = new ServicoManutencao(
      "Limpeza e Lubrificação",
      100.0
    );

    System.out.println("Descrição do Serviço: " + servico.getDescricao());
    System.out.println("Custo do Serviço: " + servico.getCusto() + " Reais");
  }
}
