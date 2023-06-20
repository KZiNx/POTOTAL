package model;

public class produto {

	private String nome;
	private double preco;
	private String categoria;
	private double avaliacao;
	private String modelo;
	private String marca;
	private String cor;
	private int estoque;
	private String descricao;
	private String foto;
	private int limite;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() >= 3) {
			this.nome = nome;
		}
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco >= 0) {
			this.preco = preco;
		}
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		if (categoria.matches("[A-Za-z]*")) {
			this.categoria = categoria;
		}
		else {
			 System.out.println("Categoria inválida");
		}
	}

	public double getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(double avaliacao) {
		if (avaliacao <= 5) {
			this.avaliacao = avaliacao;
		}
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		if (modelo.length() >= 1) {
			this.modelo = modelo;
		}
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if (marca.length() >= 1) {
			this.marca = marca;
		}
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		if (cor.length() >= 1) {
			this.cor = cor;
		}
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		if (estoque >= 1) {
			this.estoque = estoque;
		}
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if (descricao.length() >= 1) {
			this.descricao = descricao;
		}
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		if (foto.length() >= 2) {
			this.foto = foto;
		}
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		if (limite <= 10) {
			this.limite = limite;
		}
	}
}
