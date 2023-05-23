package secretaria;
public class Matricula {
    
    private String codigo;
    private Aluno aluno;
    private UnidadeCurricular unidadeCurricular;

    /** construto matricula */
    public Matricula(Aluno aluno, UnidadeCurricular unidadeCurricular){
        setAluno(aluno);
        setUnidadeCurricular(unidadeCurricular);
    }


    /** funcao para pegar o codigo */
    public void setCodigo(String codigo){
        if(codigo.matches("[A-Z0-9]*") && codigo.length() > 0 && codigo.length() <= 6){
            this.codigo = codigo;
        }
    }
    /** funcao get codigo */
    public String getCodigo(){
        return codigo;
    }
    /** funcao para verificar o aluno */
    public boolean setAluno(Aluno aluno){
        if (aluno.getClass().getSimpleName() == "Aluno"){
            this.aluno = aluno;
            return true;
        }else{
            System.out.println("Aluno inválido!");
            return false;
        }
    }
    /** funcao get aluno */
    public Aluno getAluno(){
        return this.aluno;
    }
    /** funcao para verificar unidade curricular */
    public boolean setUnidadeCurricular(UnidadeCurricular unidadeCurricular){
        if (unidadeCurricular.getClass().getSimpleName() == "UnidadeCurricular"){
            this.unidadeCurricular = unidadeCurricular;
            return true;
        }else{
            System.out.println("unidades Curriculares inválidas!");
            return false;
        }
    }
    /** funcao get unidade curricular */
    public UnidadeCurricular getUnidadesCurriculares(){
        return this.unidadeCurricular;
    }    
}