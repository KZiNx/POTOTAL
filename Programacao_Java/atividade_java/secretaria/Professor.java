package secretaria;

public class Professor {
	
	private String nomeProfessor;
	private int datadeNascimento;
	private String cpf;
	private Matricula matricula;
	private String endereco;
	private String email;
	private String numeroTelefone;
	
	public void setNome(String nome) {
		if(nome.length() >= 3 && nome.matches("[A-Za-z]*")) {
			nomeProfessor = nome;
		} else {
			System.out.print("Nome Invalido");
		}
	}
	public String getNome() {
		return nomeProfessor;
	}
	public void setEmail(String mail) {
		if (mail.matches("[@]*")) {
			email = mail;
		} else {
			System.out.print("email invalido");
		}
	}
	public String getEmail() {
		return email;
	}
	public void setNumeroTelefone(String numero) {
		if(numeroTelefone.toString().matches("[0-9]*") && numeroTelefone.length() >= 0 && numeroTelefone.length() <= 9) {
			numeroTelefone = numero;
		} else {
			System.out.print("numero invalido");
		}
	}
	public String getNumeroTelefone() {
		return numeroTelefone;
	}
	public void setNumeroCPF(String numeroCPF) {
		if(cpf.toString().matches("[0-9]*") && cpf.length() >= 0 && cpf.length() <= 11) {
			cpf = numeroCPF;
		} else {
			System.out.print("cpf invalido");
		}
	}
	public String getNomeCPF() {
		return cpf;
	}
	public void setdatadeNascimento(int data) {
		if(cpf.length() >= 0 && cpf.length() <= 1950) {
			datadeNascimento = data;
		} else {
			System.out.print("data invalido");
		}
	}
	public int getdataNascimento() {
		return datadeNascimento;
	}
}