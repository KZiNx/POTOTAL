package WEG;

public class TESTE {

  public static void main(String[] args) {
    WEG weg = new WEG();

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
    weg.adicionarProduto(motor);

    InvesorFrequencia inversor = new InvesorFrequencia(
      "#789",
      "Inversor",
      799.99,
      300,
      220,
      200,
      50.0,
      3
    );
    weg.adicionarProduto(inversor);

    Gerador gerador = new Gerador(
      "#696",
      "Gerador",
      1200.2,
      600,
      440,
      100.0,
      "Gasolina",
      "365 dias"
    );
    weg.adicionarProduto(gerador);

    ServicoManutencao servico1 = new ServicoManutencao(
      "Limpeza e Lubrificação",
      100.0
    );
    ServicoManutencao servico2 = new ServicoManutencao(
      "Inspeção Elétrica",
      150.0
    );
    weg.adicionarServicoManutencao(servico1);
    weg.adicionarServicoManutencao(servico2);

    // Listar informações de produtos e suas manutenções
    System.out.println("Informações de Produtos e Manutenção:");
    System.out.println("------------------------------------");
    for (ProdutoWEG produto : weg.getProdutosDisponiveis()) {
      System.out.println("Produto: " + produto.getTipo());
      System.out.println("Código: " + produto.getCodigo());
      System.out.println("Potência: " + produto.getPotencia() + " W");
      System.out.println("Tensão: " + produto.getTensao() + " V");
      System.out.println("Capacidade: " + produto.getCapacidade());
      System.out.println("Preço: " + produto.getPreco() + " Reais");

      System.out.println("Serviços de Manutenção:");
      for (ServicoManutencao servico : weg.getServicosManutencao()) {
        System.out.println(
          "  - " +
          servico.getDescricao() +
          " (Custo: " +
          servico.getCusto() +
          " Reais)"
        );
      }

      System.out.println("------------------------------------");
    }
  }
}
