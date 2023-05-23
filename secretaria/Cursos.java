package secretaria;
public class Cursos {

    private String nome;

    public void setNome(String nome){
        if(nome.matches("[A-Za-z0-9]*") && nome.length() > 0){
            this.nome = nome;
        } else {
            System.out.println("nome invalido");
        }
    }
    public String getNome(){
        return nome;
    }
    public Cursos(String nome){
        setNome(nome);
    }
}