public class produto {
    private String nome;
    private double preco;
    private String marca;
    private String modelo;
    private String categoria;
    private int estoque;

    /**
     * Metodo que retorna o nome do produto
     * 
     * @return (String)
     */
    public String getNome() {
        return nome;
    }

    /**
     * Metodo que recebe o nome do produto
     * 
     * @param nome (String)
     */
    public void setNome(String nome) {
        if (nome.length() >= 3) {
            this.nome = nome;
        }
    }

    /**
     * Metodo que retorna o preco do produto
     * 
     * @return (double)
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Metodo que recebe o preco do produto
     * 
     * @param preco (double)
     */
    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        }
    }

    /**
     * Metodo que retorna a categoria do produto
     * 
     * @return (String)
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Metodo que recebe a categoria do produto
     * 
     * @param categoria (String)
     */
    public void setCategoria(String categoria) {
        if (categoria.matches("[A-Za-z]*"))
            this.categoria = categoria;
    }

    /**
     * Metodo que retorna a avaliacao do produto
     * 
     * @return (double)
     */

    /**
     * Metodo que retorna o modelo do produto
     * 
     * @return (String)
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Metodo que recebe o modelo do produto
     * 
     * @param modelo (String)
     */
    public void setModelo(String modelo) {
        if (modelo.length() >= 1) {
            this.modelo = modelo;
        }
    }

    /**
     * Metodo que retorna a marca do produto
     * 
     * @return (String)
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Metodo que recebe a marca do produto
     * 
     * @param marca (String)
     */
    public void setMarca(String marca) {
        if (marca.length() >= 1) {
            this.marca = marca;
        }
        else{
            System.out.println("Marca invalida");
        }
    }

    /**
     * Metodo que retorna o estoque disponivel do produto
     * 
     * @return (int)
     */
    public int getEstoque() {
        return estoque;
    }

    /**
     * Metodo que recebe o estoque disponivel do produto
     * 
     * @param estoque (int)
     */
    public void setEstoque(int estoque) {
        if (estoque >= 1) {
            this.estoque = estoque;

        }
        else{
            System.out.println("Produto em falta");
        }
    }
}