package WEG;

public class InvesorFrequencia extends ProdutoWEG {

	private double capacidadeFrequencia;
	private int numeroFases;

	public InvesorFrequencia(String codigo, String tipo, double preco, int potencia, int tensao, double capacidade,
			double capacidadeFrequencia, int numeroFases) {
		super(codigo, tipo, preco, potencia, tensao, capacidade);
		this.capacidadeFrequencia = capacidadeFrequencia;
		this.numeroFases = numeroFases;
	}

	public double getCapacidadeFrequencia() {
		return capacidadeFrequencia;
	}

	public void setCapacidadeFrequencia(double capacidadeFrequencia) {
		this.capacidadeFrequencia = capacidadeFrequencia;
	}

	public int getNumeroFases() {
		return numeroFases;
	}

	public void setNumeroFases(int numeroFases) {
		this.numeroFases = numeroFases;
	}

	public static void main(String[] args) {

		InvesorFrequencia inversor = new InvesorFrequencia("#789", "Inversor", 799.99, 300, 220, 200, 50.0, 3);

		System.out.println("Código: " + inversor.getCodigo());
		System.out.println("Tipo: " + inversor.getTipo());
		System.out.println("Preço: " + inversor.getPreco());
		System.out.println("Potência: " + inversor.getPotencia());
		System.out.println("Tensão: " + inversor.getTensao());
		System.out.println("Capacidade: " + inversor.getCapacidade());
		System.out.println("Capacidade de Frequência: " + inversor.getCapacidadeFrequencia());
		System.out.println("Número de Fases: " + inversor.getNumeroFases());
	}
}
