package WEG;

public class Gerador extends ProdutoWEG {

	private String Tipocombustivel;
	private String autonomia;

	public Gerador(String codigo, String tipo, double preco, int potencia, int tensao, double capacidade,
			String Tipocombustivel, String autonomia) {
		super(codigo, tipo, preco, potencia, tensao, capacidade);
		this.Tipocombustivel = Tipocombustivel;
		this.autonomia = autonomia;
	}

	public String getTipocombustivel() {
		return Tipocombustivel;
	}

	public void setTipocombustivel(String Tipocombustivel) {
		this.Tipocombustivel = Tipocombustivel;
	}

	public String getautonomia() {
		return autonomia;
	}

	public void setautonomia(String autonomia) {
		this.autonomia = autonomia;
	}

	public static void main(String[] args) {

		Gerador gerador = new Gerador("#789", "Gerador", 799.99, 300, 220, 50.0, "Gasolina", "365 dias");

		System.out.println("Código: " + gerador.getCodigo());
		System.out.println("Tipo: " + gerador.getTipo());
		System.out.println("Preço: " + gerador.getPreco());
		System.out.println("Potência: " + gerador.getPotencia());
		System.out.println("Tensão: " + gerador.getTensao());
		System.out.println("Capacidade: " + gerador.getCapacidade());
		System.out.println("Tipo de combustivel: " + gerador.getTipocombustivel());
		System.out.println("Número de dias que pode ficar ligado: " + gerador.getautonomia());

	}
}
