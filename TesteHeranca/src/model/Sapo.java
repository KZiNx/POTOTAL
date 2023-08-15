package model;

public class Sapo extends Animal{

	private String nome;
	private boolean venenoso;
	private String porte;
	private String especie;
	
	public String coachar() {
		return "Rubert";
	}
	public String reproduzir() {
		return"Fazendo girinos!";
	}
	public String venenoso() {
		
		if(!this.venenoso) {
			return"Perigo ,tem veneno!";	
		}
		return "Sapo gente boa!";
	}
	public String salto() {
		return "salta muito";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public Sapo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sapo(String nomeCientifico, float peso, String tamanho) {
		super(nomeCientifico, peso, tamanho);
		// TODO Auto-generated constructor stub
	}
	
	
}
