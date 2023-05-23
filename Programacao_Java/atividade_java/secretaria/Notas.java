package secretaria;

public class notas {

    private Alunos Alunos;
    private Avaliacoes Avaliacoes;
    private float nota;

    public boolean setAlunos(Alunos Alunos) {
        if (Alunos.getClass().getSimpleName() == "alunos") {
            this.Alunos = Alunos;
            return true;
        } else {
            return false;
        }
    }

    public boolean setAvaliacoes(Avaliacoes Avaliacoes) {
        if (Avaliacoes.getClass().getSimpleName() == "avaliacoes") {
            this.Avaliacoes = Avaliacoes;
            return true;
        } else {
            return false;
        }
    }

    public Avaliacoes getAvaliacoes() {
        return this.Avaliacoes;
    }

    public Alunos getAlunos() {
        return this.Alunos;
    }

    public void setNota(float nota) {
        if (nota >= 0.0 && nota <= 10.0) {
            this.nota = nota;
        } else {
            System.out.println("nota invalida");
        }
    }

    public float getNota() {
        return nota;
    }

    public notas(Alunos Alunos, Avaliacoes Avaliacoes, float nota) {
        setAlunos(Alunos);
        setAvaliacoes(Avaliacoes);
        setNota(nota);
    }
}