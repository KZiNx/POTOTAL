package secretaria;

public class notas {

    private Avaliacoes avaliacoes;
    private float nota;
    private Alunos alunos;

    public boolean setAlunos(Alunos alunos) {
        if (alunos.getClass().getSimpleName() == "alunos") {
            this.alunos = alunos;
            return true;
        } else {
            return false;
        }
    }

    public boolean setAvaliacoes(Avaliacoes avaliacoes) {
        if (avaliacoes.getClass().getSimpleName() == "avaliacoes") {
            this.avaliacoes = avaliacoes;
            return true;
        } else {
            return false;
        }
    }

    public Avaliacoes getAvaliacoes() {
        return this.avaliacoes;
    }

    public Alunos getAlunos() {
        return this.alunos;
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