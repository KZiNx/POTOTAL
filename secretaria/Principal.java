package secretaria;

public class Principal {

/**
 * 
 * @param args (String)
 */    
public static void main (String[]args){
        Alunos aluno = new Alunos("Kevin");
        aluno.setNumCPF("109-025-699-02");
        aluno.setEmail("subzeromaster007@hotmail.com");
        aluno.setEndereco("campo alegre");
        aluno.setNomeResp("Jessey Lee Siqueira");
        aluno.setNumTelefone("991887371");
         
        Cursos cursos = new Cursos("Programação");
        UnidadesCurriculares UnidadesCurriculares = new UnidadesCurriculares("Informatica", cursos);
        matriculas matricula = new matriculas(aluno, UnidadesCurriculares);
        Avaliacoes avaliacao = new Avaliacoes(aluno.getNome(), UnidadesCurriculares);
        Double nota = 7.5;
        notas notas = new notas(aluno, avaliacao, nota);
       
        // matricula.setCodigo("S00000");


    }
}