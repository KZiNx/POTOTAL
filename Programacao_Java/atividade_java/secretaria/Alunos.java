package secretaria;

public class Alunos {

	private String nome;
	private String cpf;
	private String endereco;
	private String telefone;
	private String email;
	private String responsavel;

	public void setNome(String nome) {
		if (nome.matches("[A-Za-z]*")) {
			this.nome = nome;
		} else {
			System.out.print("nome invalido");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setEmail(String email) {
		if (email.matches("[@]*") && email.matches("[A-Za-z]*") && email.matches("[0-9]*")) {
			this.email = email;
		} else {
			System.out.print("email invalido");
		}
	}

	public String getEmail() {
		return email;
	}

	public void setNomeResp(String responsavel) {
		if (responsavel.matches("[A-Za-z]*")) {
			this.responsavel = responsavel;
		} else {
			System.out.print("nome invalido");
		}
	}

	public String getNomeResp() {
		return responsavel;
	}

	public void setNumeroTelefone(String telefone) {
		if (telefone.matches("[0-9]*") && telefone.length() == 9) {
			this.telefone = telefone;
		} else {
			System.out.print("numero invalido");
		}
	}

	public String getNumeroTelefone() {
		return telefone;
	}

	public void setNumeroCPF(String cpf) {
		if (cpf.toString().matches("[0-9]*") && cpf.length() == 11) {
			this.cpf = cpf;
		} else {
			System.out.print("cpf invalido");
		}
	}

	public String getNomeCPF() {
		return cpf;
	}

	public void setEndereco(String endereco) {
		if (endereco.matches("[A-Za-z]*") && endereco.matches("[0-9]*")) {
			this.endereco = endereco;
		} else {
			System.out.println("endereço invalido");
		}
	}

	public String getEndereco() {
		return endereco;
	}

	public Alunos(String nome) {
		setNome(nome);
	}

}