package testando;

public class Produto {

    


	    
	    private String nome;
	    private String preco;
	    private String categoria;
	    

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        if (nome != null && !nome.isEmpty()) {
	            this.nome = nome;
	        } else {
	            throw new IllegalArgumentException("Nome inv�lido.");
	        }
	    }

	    public String getPreco() {
	        return preco;
	    }

	    public void setPreco(String preco) {
	        if (preco != null) {
	            this.preco = preco;
	        } else {
	            throw new IllegalArgumentException("Preço invalido.");
	        }
	    }

	    public String getCategoria() {
	        return categoria;
	    }

	    public void setCategoria(String categoria) {
	        if (categoria != null && !categoria.isEmpty()) {
	            this.categoria = categoria;
	        } else {
	            throw new IllegalArgumentException("Categoria inv�lida.");
	        }
	    }
	}

    