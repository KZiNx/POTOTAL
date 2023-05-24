package secretaria;
public class Cursos {

    private String nome;
/**
 * 
 * @param nome (String)
 */
    public void setNome(String nome){
        if(nome.matches("[A-Za-z0-9]*") && nome.length() > 0){
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
     * @param nome (Cursos)
     */
    public Cursos(String nome){
        setNome(nome);
    }
}