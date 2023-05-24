package secretaria;

public class matriculas {

    private String codigo;
    private Alunos alunosAlunos;
    private UnidadesCurriculares unidadeCurricular;
    /**
     * 
     * @param alunosAlunos (Alunos)
     * @param unidadesCurriculares (Alunos)
     */
    public matriculas(Alunos alunosAlunos, UnidadesCurriculares unidadesCurriculares) {
        setAlunos(alunosAlunos);
        setUnidadeCurricular(unidadesCurriculares);
    }
    /**
     * 
     * @param codigo (String)
     */
    public void setCodigo(String codigo) {
        if (codigo.matches("[A-Z0-9]*") && codigo.length() == 6) {
            this.codigo = codigo;
        }
    }
/**
 * 
 * @return (String)
 */
    public String getCodigo() {
        return codigo;
    }
/**
 * 
 * @param alunosAlunos (Alunos)
 * @return (boolean)
 */
    public boolean setAlunos(Alunos alunosAlunos) {
        if (alunosAlunos.getClass().getSimpleName() == "Alunos") {
            this.alunosAlunos = alunosAlunos;
            return true;
        } else {
            System.out.println("aluno invalido");
            return false;
        }
    }
/**
 * 
 * @return (Alunos)
 */
    public Alunos getAlunos() {
           return this.alunosAlunos;
    }

/**
 * 
 * @param unidadesCurriculares (boolean)
 * @return (boolean)
 */
    public boolean setUnidadeCurricular(UnidadesCurriculares unidadesCurriculares) {
        if (unidadesCurriculares.getClass().getSimpleName() == "UnidadeCurricular") {
            this.unidadeCurricular = unidadesCurriculares;
            return true;
        } else {
            System.out.println("unidade curricular invalida");
            return false;
        }
    }
/**
 * @return(unidades_curriculares)
 */
    public UnidadesCurriculares getUnidadesCurriculares() {
        return this.unidadeCurricular;
    }
}