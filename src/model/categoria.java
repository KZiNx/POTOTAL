package model;

public class categoria {

    private String tipo;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() > 3 && nome.matches("[A-Za-z0-9]*")) {
            this.nome = nome;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo.matches("[A-Za-z]*")) {
            this.tipo = tipo;
        }
    }
}
