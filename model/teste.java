package model;
public class teste {

	public static void main(String[] args) {
	
	cliente cliente = new cliente("kevin");
	cliente.setNumCPF("109.025.699.02");
	cliente.setNasc("16092005");
	cliente.setEndereco("campo alegre 80");
	cliente.setEmail("kevin@gmail.com");
	cliente.setSenha("123");
	cliente.setLogin("kevin");
	cliente.setTelefones("991887371");
	cliente.setSaldo((double) 1); 
	
	System.out.println("Nome: " + cliente.getNome());
	System.out.println("Cpf: " + cliente.getCPF());
	System.out.println("Nascimento: " + cliente.getNasc());
	System.out.println("Endereço: " + cliente.getEndereco());
	System.out.println("Email: " + cliente.getEmail());
	System.out.println("Login: " + cliente.getLogin());
	System.out.println("Senha: " + cliente.getSenha());
	System.out.println("Telefone: " + cliente.getTelefones());;

    }

}

