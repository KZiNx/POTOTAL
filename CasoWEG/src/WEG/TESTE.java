package WEG;

public class TESTE {
	public static void main(String[]args) {
		
		ProdutoWEG produto = new ProdutoWEG ("produto","grande",120.10,12,13,13.50);
		MotorEletrico motor = new MotorEletrico ("motor","pequeno",120.10,12,13,13.50, "curto", 130);
		
		System.out.println(motor.getTipoEnrolamento());
		System.out.println(motor.getEficiência());

	}
	}
