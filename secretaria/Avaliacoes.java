package secretaria;
public class Avaliacoes {
    
    private String nome;
    private UnidadesCurriculares unidadeCurricular;
/**
 * 
 * @param nome (String)
 */
    public void setnome(String nome){
        if(nome.matches("[A-Za-z]*")){
            this.nome = nome;
        } else {
            System.out.println("nome invalido");
        }
    }
 /**
  * 
  * @return (String)
  */
    public String getNome(){
        return nome;
    }
    /**
     * 
     * @param unidadesCurriculares ()
     * @return (boolean)
     */
    public boolean setUnidadesCurriculares(UnidadesCurriculares unidadesCurriculares){
        if (unidadesCurriculares.getClass().getSimpleName() == "UnidadeCurricular"){
            this.unidadeCurricular = unidadesCurriculares;
            return true;
        }else{
            System.out.println("unidade curricular invalidas");
            return false;
        }
    }
    public UnidadesCurriculares getUnidadeCurricular(){
        return this.unidadeCurricular;
    }    
    public Avaliacoes(String nome, UnidadesCurriculares unidadesCurriculares){
        setnome(nome);
        setUnidadesCurriculares(unidadesCurriculares);
    }
}