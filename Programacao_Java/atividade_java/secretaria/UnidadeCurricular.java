package secretaria;
public class UnidadeCurricular {
    
    private String nome;
    private Curso curso;

    /** funcao para pegar o nome da unidade curricular */
    public void setNome(String nome){
        if(nome.matches("[A-Za-z]*")){
            this.nome = nome;
        } else {
            System.out.println("Nome invalido!");
        }
    }
    /** funcao get nome da unidade curricular */
    public String getNome(){
        return nome;
    }
    /** funcao que recebe o nome do curso */
    public boolean setCurso(Curso curso){
        if (curso.getClass().getSimpleName() == "Curso"){
            this.curso = curso;
            return true;
        }else{
            return false;
        }
    }
    /** funcao get curso */
    public Curso getCurso(){
        return this.curso;
    }
    /** construtor unidade curricular */
    public UnidadeCurricular(String nome, Curso curso){
        setNome(nome);
        setCurso(curso);
    }
}