package secretaria;

public class notas {

    private Avaliacoes avaliacoes;
    private Double nota;
    private Alunos alunos;

    /**
     * @param alunos (Alunos)
     * @return (boolean)
     */

    public boolean setAlunos(Alunos alunos) {
        if (alunos.getClass().getSimpleName() == "alunos") {
            this.alunos = alunos;
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param avaliacoes (Avaliacoes)
     * @return (boolean)
     */
    public boolean setAvaliacoes(Avaliacoes avaliacoes) {
        if (avaliacoes.getClass().getSimpleName() == "avaliacoes") {
            this.avaliacoes = avaliacoes;
            return true;
        } else {
            return false;
        }
    }

    /**
     * @return (Avaliacoes)
     */
    public Avaliacoes getAvaliacoes() {
        return this.avaliacoes;
    }

    /**
     * @return (Alunos)
     */
    public Alunos getAlunos() {
        return this.alunos;
    }

    /**
     * @param nota (Double)
     * @return (boolean)
     */
    public void setNota(Double nota) {
        if (nota >= 0.0 && nota <= 10.0) {
            this.nota = nota;
        } else {
            System.out.println("nota invalida");
        }
    }

    /**
     * @return (Double)
     */
    public Double getNota() {
        return nota;
    }

    /**
     * 
     * @param Alunos     (Alunos)
     * @param Avaliacoes (Avaliacoes)
     * @param nota2       (Double)
     */

    public notas(Alunos Alunos, Avaliacoes Avaliacoes, double nota2) {
        setAlunos(Alunos);
        setAvaliacoes(Avaliacoes);
        setNota(nota2);
    }
}