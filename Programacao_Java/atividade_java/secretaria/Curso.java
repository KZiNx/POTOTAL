package secretaria;

public class Curso {

	private String nomeCurso;
	private int cargaHoraria;
	private Unidades_curriculares unidades_curriculares; 
	
	public void setNomeCurso(String nome) {
		if(nome.length() >= 3 && nome.matches("[A-Za-z]*")) {
			nomeCurso = nome;
		} else {
			System.out.print("Nome Invalido");
		}
	}
	public String getNome() {
		return nomeCurso;
	}
	public void setCargaHoraria(int hora) {
		if(cargaHoraria > 0) {
			cargaHoraria = hora;
		} else {
			System.out.print("Nome Invalido");
		}
	}
	public String getcargaHoraria() {
		return nomeCurso;
	}
}