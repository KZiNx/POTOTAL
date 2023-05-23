package secretaria;
public class Avaliacoes {
    
    private String nome;
    private unidades_curriculares unidadeCurricular;

    public void setnome(String nome){
        if(nome.matches("[A-Za-z]*")){
            this.nome = nome;
        } else {
            System.out.println("nome invalido");
        }
    }
 
    public String getNome(){
        return nome;
    }
    
    public boolean setUnidadesCurriculares(unidades_curriculares unidadeCurricular){
        if (unidadeCurricular.getClass().getSimpleName() == "UnidadeCurricular"){
            this.unidadeCurricular = unidadeCurricular;
            return true;
        }else{
            System.out.println("unidade curricular invalidas");
            return false;
        }
    }
    public unidades_curriculares getUnidadeCurricular(){
        return this.unidadeCurricular;
    }    
    public Avaliacoes(String nome, unidades_curriculares unidadeCurricular){
        setnome(nome);
        setUnidadesCurriculares(unidadeCurricular);
    }
}