package secretaria;

public class matriculas {

    private String codigo;
    private Alunos alunosAlunos;
    private unidades_curriculares unidadeCurricular;

    public matriculas(Alunos alunosAlunos, unidades_curriculares unidadeCurricular) {
        setAlunos(alunosAlunos);
        setUnidadeCurricular(unidadeCurricular);
    }

    public void setCodigo(String codigo) {
        if (codigo.matches("[A-Z0-9]*") && codigo.length() == 6) {
            this.codigo = codigo;
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public boolean setAlunos(Alunos alunosAlunos) {
        if (alunosAlunos.getClass().getSimpleName() == "Alunos") {
            this.alunosAlunos = alunosAlunos;
            return true;
        } else {
            System.out.println("aluno invalido");
            return false;
        }
    }

    public Alunos getAlunos() {
           return this.alunosAlunos;
    }

    public boolean setUnidadeCurricular(unidades_curriculares unidadeCurricular) {
        if (unidadeCurricular.getClass().getSimpleName() == "UnidadeCurricular") {
            this.unidadeCurricular = unidadeCurricular;
            return true;
        } else {
            System.out.println("unidade curricular invalida");
            return false;
        }
    }

    public unidades_curriculares getUnidadesCurriculares() {
        return this.unidadeCurricular;
    }
}