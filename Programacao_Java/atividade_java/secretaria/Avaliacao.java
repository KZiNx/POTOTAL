package secretaria;
public class Avaliacao {
    
    private String nome;
    private UnidadeCurricular unidadeCurricular;

    /** funcao para receber o nome da avaliaçao */
    public void setnome(String nome){
        if(nome.matches("[A-Za-z]*")){
            this.nome = nome;
        } else {
            System.out.println("Nome invalido!");
        }
    }
    /** funcao get nome da avaliaçoa */
    public String getNome(){
        return nome;
    }
    /** funcao para receber a unidade curricular */
    public boolean setUnidadesCurriculares(UnidadeCurricular unidadeCurricular){
        if (unidadeCurricular.getClass().getSimpleName() == "UnidadeCurricular"){
            this.unidadeCurricular = unidadeCurricular;
            return true;
        }else{
            System.out.println("unidades Curriculares inválidas!");
            return false;
        }
    }
    /** funcao get na Unidade curricular */
    public UnidadeCurricular getUnidadeCurricular(){
        return this.unidadeCurricular;
    }    
    /** construtor avaliacao */
    public Avaliacao(String nome, UnidadeCurricular unidadeCurricular){
        setnome(nome);
        setUnidadesCurriculares(unidadeCurricular);
    }
}