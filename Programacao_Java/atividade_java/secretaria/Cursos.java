package secretaria;
public class Cursos {

    private String nome;

    /** funcao para receber nome do curso */
    public void setNome(String nome){
        if(nome.matches("[A-Za-z0-9]*") && nome.length() > 0){
            this.nome = nome;
        } else {
            System.out.println("Nome invalido!");
        }
    }
    /** funcao get nome do curso */
    public String getNome(){
        return nome;
    }
    /** construtor curso */
    public Cursos(String nome){
        setNome(nome);
    }
}