package secretaria;

public class teste {
	public static void main (String []args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Bernardo");
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Daniel");
		Aluno aluno3 = new Aluno();
		aluno3.setNome("Kevin");
		
		System.out.print("Nome: " + aluno1.getNome());
		System.out.print("Nome: " + aluno2.getNome());
		System.out.print("Nome: " + aluno3.getNome());
		
	}
}
