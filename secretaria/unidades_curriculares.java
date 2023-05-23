package secretaria;
public class unidades_curriculares{
    
    private String nome;
    private Cursos curso;

    public void setNome(String nome){
        if(nome.matches("[A-Za-z]*")){
            this.nome = nome;
        } else {
            System.out.println("Nome invalido!");
        }
    }
    public String getNome(){
        return nome;
    }
    public boolean setCurso(Cursos curso){
        if (curso.getClass().getSimpleName() == "Curso"){
            this.curso = curso;
            return true;
        }else{
            return false;
        }
    }
    public Cursos getCurso(){
        return this.curso;
    }
    public unidades_curriculares(String nome, Cursos curso){
        setNome(nome);
        setCurso(curso);
    }
}