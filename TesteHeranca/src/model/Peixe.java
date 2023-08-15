package model;

	public class Peixe extends Animal{
	
		private String nome;
		private boolean venenoso;
		private String porte;
		private String especie;
		
		public String bolhas() {
			return "glub glub...";
		}
		public String reproduzir() {
			return"Reproduzindo Pepeixinhos!";
		}
		public String venenoso() {
			
			if(!this.venenoso) {
				return"Perigo!";	
			}
			return "Xeipe tranquilo!";
		}
		public String morder() { 
		return "nhac nhac";
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
		public Peixe() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Peixe(String nomeCientifico, float peso, String tamanho) {
			super(nomeCientifico, peso, tamanho);
			// TODO Auto-generated constructor stub
		}
		
}
