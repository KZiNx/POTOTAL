package secretaria;
public class unidades_curriculares {
    
    private String nome;
    private Cursos cursosCursos;

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
    /** funcao que recebe o nome do cursosCursos */
    public boolean setCursos(Cursos cursosCursos){
        if (cursosCursos.getClass().getSimpleName() == "Cursos"){
            this.cursosCursos = cursosCursos;
            return true;
        }else{
            return false;
        }
    }
    /** funcao get cursosCursos */
    public Cursos getCursos(){
        return this.cursosCursos;
    }
    public unidades_curriculares(String nome, Cursos cursosCursos){
        setNome(nome);
        setCursos(cursosCursos);
    }
}