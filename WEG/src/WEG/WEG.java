package WEG;

import java.util.ArrayList;
import java.util.List;

/**
 * A classe WEG representa um sistema da empresa WEG que gerencia produtos e serviços de manutenção.
 */
public class WEG {
    private List<ProdutoWEG> produtosDisponiveis;
    private List<ServicoManutencao> servicosManutencao;

    /**
     * Construtor padrão da classe WEG.
     * Inicializa as listas de produtos disponíveis e serviços de manutenção.
     */
    public WEG() {
        produtosDisponiveis = new ArrayList<>();
        servicosManutencao = new ArrayList<>();
    }

    /**
     * Adiciona um produto à lista de produtos disponíveis.
     *
     * @param produto O produto a ser adicionado.
     */
    public void adicionarProduto(ProdutoWEG produto) {
        produtosDisponiveis.add(produto);
    }

    /**
     * Adiciona um serviço de manutenção à lista de serviços de manutenção.
     *
     * @param servico O serviço de manutenção a ser adicionado.
     */
    public void adicionarServicoManutencao(ServicoManutencao servico) {
        servicosManutencao.add(servico);
    }

    /**
     * Obtém a lista de produtos disponíveis.
     *
     * @return A lista de produtos disponíveis.
     */
    public List<ProdutoWEG> getProdutosDisponiveis() {
        return produtosDisponiveis;
    }

    /**
     * Obtém a lista de serviços de manutenção disponíveis.
     *
     * @return A lista de serviços de manutenção disponíveis.
     */
    public List<ServicoManutencao> getServicosManutencao() {
        return servicosManutencao;
    }

    /**
     * Método principal que demonstra a funcionalidade do sistema.
     *
     * @param args Os argumentos de linha de comando (não utilizados aqui).
     */
    public static void main(String[] args) {
        WEG weg = new WEG();

        MotorEletrico motor = new MotorEletrico("#456", "Motor", 750, 220, 1, 399.99, "Dupla Camada", 0.85);
        weg.adicionarProduto(motor);

        InvesorFrequencia inversor = new InvesorFrequencia("#789", "Inversor", 799.99, 300, 220, 200, 50.0, 3);
        weg.adicionarProduto(inversor);

        Gerador gerador = new Gerador("#789", "Gerador", 799.99, 300, 220, 50.0, "Gasolina", "365 dias");
        weg.adicionarProduto(gerador);

        ServicoManutencao servico1 = new ServicoManutencao("Limpeza e Lubrificação", 100.0);
        ServicoManutencao servico2 = new ServicoManutencao("Inspeção Elétrica", 150.0);
        weg.adicionarServicoManutencao(servico1);
        weg.adicionarServicoManutencao(servico2);

        // ... (criação de outros serviços)

        // Listar informações de produtos e suas manutenções
        System.out.println("Informações de Produtos e Manutenção:");
        System.out.println("------------------------------------");
        for (ProdutoWEG produto : weg.getProdutosDisponiveis()) {
            produto.descricaoProduto();
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


