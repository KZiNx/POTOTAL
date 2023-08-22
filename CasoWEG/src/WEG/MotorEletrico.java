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

	public static void main(String[] args) {

		MotorEletrico motor = new MotorEletrico("#456", "Motor", 750, 220, 1, 399.99,
				"Dupla Camada", 0.85);

		System.out.println("Código: " + motor.getCodigo());
		System.out.println("Tipo: " + motor.getTipo());
		System.out.println("Potência: " + motor.getPotencia());
		System.out.println("Tensão: " + motor.getTensao());
		System.out.println("Capacidade: " + motor.getCapacidade());
		System.out.println("Preço: " + motor.getPreco());
		System.out.println("Tipo de Enrolamento: " + motor.getTipoEnrolamento());
		System.out.println("Eficiência: " + motor.getEficiência());
		
	}

	public MotorEletrico(String codigo, String tipo, double preco, int potencia, int tensao, double capacidade, String tipoEnrolamento, double eficiência) {
		super(codigo, tipo, preco, potencia, tensao, capacidade);
		this.tipoEnrolamento = tipoEnrolamento;
		this.eficiência = eficiência;
	}
	
}
