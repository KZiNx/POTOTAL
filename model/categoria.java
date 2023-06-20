package model;

public class categoria {

    private String tipo;
    private String nome;

    /**
     * 
     * @return (String)
     */
    public String getNome() {
        return nome;
    }

    /**
     * 
     * @param nome (String)
     */
    public void setNome(String nome) {
        if (nome.length() > 3 && nome.matches("[A-Za-z0-9]*")) {
            this.nome = nome;
        }
    }

    /**
     * 
     * @return (String)
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * 
     * @param tipo (String)
     */
    public void setTipo(String tipo) {
        if (tipo.matches("[A-Za-z]*")) {
            this.tipo = tipo;
        }
    }
}