package secretaria;
public class Notas {
    
    private Aluno aluno;
    private Avaliacao avaliacao;
    private Double nota;

    /** funcao que recebe a nota */
    public void setNota(Double nota){
        if(nota >= 0.0 && nota <= 10.0){
            this.nota = nota;
        } else {
            System.out.println("Nota invalida!");
        }
    }
    /** funcao get na nota */
    public Double getNota(){
        return nota;
    }
    /** funcao para receber o aluno */
    public boolean setAluno(Aluno aluno){
        if (aluno.getClass().getSimpleName() == "Aluno"){
            this.aluno = aluno;
            return true;
        }else{
            return false;
        }
    }
    /** funcao get aluno */
    public Aluno getAluno(){
        return this.aluno;
    }
    /** funcao que recebe avaliacao */
    public boolean setAvaliacao(Avaliacao avaliacao){
        if (avaliacao.getClass().getSimpleName() == "Avaliacao"){
            this.avaliacao = avaliacao;
            return true;
        }else{
            return false;
        }
    }
    /** funcao get avaliacao */
    public Avaliacao getavaliacao(){
        return this.avaliacao;
    }
    /** construtor notas */
    public Notas(Aluno aluno, Avaliacao avaliacao, Double nota) {
        setAluno(aluno);
        setAvaliacao(avaliacao);
        setNota(nota);
    }
}