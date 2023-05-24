package secretaria;

public class UnidadesCurriculares {

    private String nome;
    private Cursos cursos;
/**
 * 
 * @param nome (String)
 */
    public void setNome(String nome) {
        if (nome.matches("[A-Za-z]*")) {
            this.nome = nome;
        } else {
            System.out.println("nome invalido");
        }

    }
/**
 * 
 * @return (String)
 */
    public String getNome() {
        return nome;

    }
/**
 * 
 * @param cursos (Cursos)
 * @return (boolean)
 */
    public boolean setCurso(Cursos cursos) {
        if (cursos.getClass().getSimpleName() == "Curso") {
            this.cursos = cursos;
            return true;
        } else {
            return false;
        }
    }
/**
 * 
 * @return (Cursos)
 */
    public Cursos gertCursos() {
        return this.cursos;
    }
/**
 * 
 * @param nome (String)
 * @param cursos (Cursos)
 */
    public UnidadesCurriculares(String nome, Cursos cursos) {
        setNome(nome);
        setCurso(cursos);
    }

}