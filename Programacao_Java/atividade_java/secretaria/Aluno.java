package secretaria;

import java.util.Date;

public class Aluno {
	
	private String nomeAluno;
	private Date datadeNascimento;
	private String endereço;
	private String email;
	private String nomeResponsavel;
	private int numeroTelefone;
	private int cpf;
	private Matricula matricula;

	public void setNome(String nome) {
		if(nome.length() >= 3 && nome.matches("[A-Za-z]*")) {
			nomeAluno = nome;
		} else {
			System.out.print("Nome Invalido");
		}
	}
	public String getNome() {
		return nomeAluno;
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
	public void setNomeResp(String nomeResp) {
		if(nomeResp.length() >= 3 && nomeResp.matches("[A-Za-z]*")) {
			nomeResponsavel = nomeResp;
		} else {
			System.out.print("Nome Invalido");
		}
	}
	public String getNomeResp() {
		return nomeResponsavel;
	}
	public void setNumeroTelefone(Integer numero) {
		if(numero.toString().matches("[0-9]")) {
			numeroTelefone = numero;
		} else {
			System.out.print("numero invalido");
		}
	}public void setNumeroCPF(Integer NumeroCPF) {
		if(cpf.toString().matches("[0-9]") && cpf.length() >= 0 && cpf.length() <= 11) {
			cpf = NumeroCPF;
		} else {
			System.out.print("cpf invalido");
		}
	}
	
}