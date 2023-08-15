package model;

import java.util.Calendar;

public class Animal {
	private String nomeComum;
	private String nomeCientifico;
	private String raca;
	private String classe; //Mamífero , Anfíbio ...
	private String Tamanho; 
	private float peso;
	private String cor;
	private String habitat;
	private String genero;
	private Calendar dataNascimento;
	
	public String alimentar(String energia) {
		return "Se alimentando de "+energia;
	}
	public String reproduzir() {
		return "reproduzindo...";
	}
	public String locomover (String  sentido, float velocidade) {
		return "locomovendo-se no sentido "+sentido+" com a velocidade de "+velocidade;
	}
	public String repousar (float tempo, String unidade) {
		return "Repousando por "+tempo+unidade; //5h
	}
	
	//---------------------------------------------------------------//
	
	public String getNomeComum() {
		return nomeComum;
	}
	public void setNomeComum(String nomeComum) {
		this.nomeComum = nomeComum;
	}
	public String getNomeCientifico() {
		return nomeCientifico;
	}
	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public String getTamanho() {
		return Tamanho;
	}
	public void setTamanho(String tamanho) {
		Tamanho = tamanho;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Animal(String nomeCientifico, float peso, String tamanho) {
		setNomeCientifico(nomeCientifico);
		setPeso(peso);
		setTamanho(tamanho);
	}
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	}
