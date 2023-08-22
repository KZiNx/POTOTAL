package model;

public class TesteAnimal {
	public static void main(String[]args) {
		
		Animal animal = new Animal ("Homo sapiens",60,"grande");
		
		Cachorro doguinho = new Cachorro ("canis lupus familiaris",20,"medio");
		System.out.println(doguinho.latir());
		System.out.println(doguinho.alimentar("racao"));
		System.out.println(doguinho.repousar(5, "min"));
		
		Animal bicho = new Animal();
		
		//para transformar de bicho para cachorro
		//(new) cria um novo objeto
		
		 bicho = new Cachorro("canis lupus familiaris",20,"medio");
		
		//carrega os dados (bicho) e coloca no (dog2)
		
//		Cachorro dog2 = (Cachorro)bicho;
		
		System.out.println(bicho.reproduzir());
		System.out.println(doguinho.reproduzir());
		
		
		Peixe pepeixinho = new Peixe ("Pepeixinho",1,"pequeno");

	System.out.println(pepeixinho.bolhas());
	System.out.println(pepeixinho.reproduzir());
	System.out.println(pepeixinho.venenoso());
	System.out.println();
	Sapo Zeca = new Sapo ("ToadZilla",1,"pequeno");
	System.out.println(Zeca.coachar());
	System.out.println(Zeca.reproduzir());
	System.out.println(Zeca.venenoso());
	System.out.println(Zeca.salto());
	System.out.println();
	PeixeAguaDoce Xeipe = new PeixeAguaDoce ("PEIXE",1,"grandao");
	System.out.println(Xeipe.mar());
	System.out.println(Xeipe.bolhas());
	System.out.println(Xeipe.reproduzir());
	System.out.println(Xeipe.venenoso());
	}
}

