package secretaria;
public class Aluno {

    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;
    private String responsavel;

    /** classe para pegar o nome */
	public void setNome(String nome) {
		if(nome.length() >= 3 && nome.matches("[A-Za-z]*")) {
			this.nome = nome;
		} else {
			System.out.print("Nome Invalido");
		}
	}
	/** clase get nome */
	public String getNome() {
		return nome;
	}
	/** classe para pegar o email */
	public void setEmail(String email) {
		if (email.matches("[@]*") && email.matches("[A-Za-z]*")) {
			this.email = email;
		} else {
			System.out.print("email invalido");
		}
	}
	/** clase get email */
	public String getEmail() {
		return email;
	}
	/** classe para pegar o nome do responsavel */
	public void setNomeResp(String responsavel) {
		if(responsavel.length() >= 3 && responsavel.matches("[A-Za-z]*")) {
			this.responsavel = responsavel;
		} else {
			System.out.print("Nome Invalido");
		}
	}
	/** clase get nome do responsavel */
	public String getNomeResp() {
		return responsavel;
	}
	/** classe para pegar o numero de telefone */
	public void setNumeroTelefone(String telefone) {
		if(telefone.matches("[0-9]*") && telefone.length() >= 0 && telefone.length() <= 9) {
			this.telefone = telefone;
		} else {
			System.out.print("numero invalido");
		}
	}
	/** clase get numero de telefone */
	public String getNumeroTelefone() {
		return telefone;
	}
	/** classe para pegar o CPF */
	public void setNumeroCPF(String cpf) {
		if(cpf.toString().matches("[0-9]*") && cpf.length() >= 0 && cpf.length() <= 11) {
			this.cpf = cpf;
		} else {
			System.out.print("cpf invalido");
		}
	}
	/** clase get CPF */
	public String getNomeCPF() {
		return cpf;
	}
	/** class para pegar o endereço */
	public void setEndereco(String endereco) {
		if(endereco.matches("[A-Za-z]*") && endereco.length() > 5){
			this.endereco = endereco;
		} else {
			System.out.println("Endereço Invalido!");
		}
	}
	/** classe get endereco */
	public String getEndereco(){
		return endereco;
	}
	/** construtor aluno */
	public Aluno(String nome) {
		setNome(nome);
	}

}