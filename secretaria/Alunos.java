package secretaria;

public class Alunos {

	private String nome;
	private String cpf;
	private String endereco;
	private String telefone;
	private String email;
	private String responsavel;
/**
 * 
 * @param nome (String)
 */
	public void setNome(String nome) {
		if (nome.matches("[A-Za-z]*")) {
			this.nome = nome;
		} else {
			System.out.print("nome invalido");
		}
	}
/**
 * 
 * @return (String)
 */
	public String getNome() {
		return nome;
	}
/**
 * 
 * @param email (String)
 */
	public void setEmail(String email) {
		if (email.matches("[@]*") && email.matches("[A-Za-z]*") && email.matches("[0-9]*")) {
			this.email = email;
		} else {
			System.out.print("email invalido");
		}
	}
/**
 * 
 * @return (String)
 */
	public String getEmail() {
		return email;
	}
/**
 * 
 * @param responsavel (String)
 */
	public void setNomeResp(String responsavel) {
		if (responsavel.matches("[A-Za-z]*")) {
			this.responsavel = responsavel;
		} else {
			System.out.print("nome invalido");
		}
	}
/**
 * 
 * @return (String)
 */
	public String getNomeResp() {
		return responsavel;
	}
/**
 * 
 * @param telefone (String)
 */
	public void setNumTelefone(String telefone) {
		if (telefone.matches("[0-9]*") && telefone.length() == 9) {
			this.telefone = telefone;
		} else {
			System.out.print("numero invalido");
		}
	}
/**
 * 
 * @return (String)
 */
	public String getNumeroTelefone() {
		return telefone;
	}
/**
 * 
 * @param cpf (String)
 */
	public void setNumCPF(String cpf) {
		if (cpf.toString().matches("[0-9]*") && cpf.length() == 11) {
			this.cpf = cpf;
		} else {
			System.out.print("cpf invalido");
		}
	}
/**
 * 
 * @return (String)
 */
	public String getCPF() {
		return cpf;
	}
/**
 * 
 * @param endereco (String)
 */
	public void setEndereco(String endereco) {
		if (endereco.matches("[A-Za-z]*") && endereco.matches("[0-9]*")) {
			this.endereco = endereco;
		} else {
			System.out.println("endereço invalido");
		}
	}
/**
 * 
 * @return (String)
 */
	public String getEndereco() {
		return endereco;
	}
/**
 * 
 * @param nome (String)
 */
	public Alunos(String nome) {
		setNome(nome);
	}

}