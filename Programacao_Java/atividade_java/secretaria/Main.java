package secretaria;
public class Main {
    public static void main (String[]args){
        Aluno aluno = new Aluno("Matheus");
        aluno.setNumeroCPF("123.432.344-16");
        aluno.setEmail("Aluno.email@legal.com");
        aluno.setEndereco("Rua maneira");
        aluno.setNomeResp("Roberto");
        aluno.setNumeroTelefone("554512331231");

        Curso curso = new Curso("POG");
        UnidadeCurricular unidadeCurricular = new UnidadeCurricular("Matemática", curso);
        Matricula matricula = new Matricula(aluno, unidadeCurricular);
        Avaliacao avaliacao = new Avaliacao(aluno.getNome(), unidadeCurricular);
        Double nota = 9.0;
        Notas notas = new Notas(aluno, avaliacao, nota);
        // matricula.setCodigo("S00000");


    }
}