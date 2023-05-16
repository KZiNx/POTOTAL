package secretaria;

public class Matricula {
	
	private String numeroMatricula;
	private String turma;
	private Curso curso;
	
	public void setNomeTurma(String nome) {
		if(turma.matches("[A-Za-z1-9]*")) {
			turma = nome;
		} else {
			System.out.print("Nome Invalido");
		}
	}
	public String getNome() {
		return turma;
	}
	public void setNumeroMatricula(String numero) {
		if(numeroMatricula.matches("[1-9]*")) {
			numeroMatricula = numero;
		} else {
			System.out.print("Nome Invalido");
		}
	}
	public String getNumeroMatricula() {
		return numeroMatricula;
	}
}