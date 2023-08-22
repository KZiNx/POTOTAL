package WEG;

public class ServicoManutencao {

	private String descricao;
	private double custo;

	public ServicoManutencao(String descricao, double custo) {
		this.descricao = descricao;
		this.custo = custo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public static void main(String[] args) {

		ServicoManutencao servico = new ServicoManutencao("Limpeza e Lubrificação", 100.0);

		System.out.println("Descrição do Serviço: " + servico.getDescricao());
		System.out.println("Custo do Serviço: " + servico.getCusto() + " Reais");
	}
}
