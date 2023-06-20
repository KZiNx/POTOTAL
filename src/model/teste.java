package model;

public class teste {

    public static void main(String[] args) {

        cliente cliente = new cliente("Kevin");
        endereco endereco = new endereco("Campo Alegre 80");
        pagamento pagamento = new pagamento();
        produto produto = new produto();
        
       
        cliente.setCPF("10902569902");
        cliente.setNasc("16/09/2005");
        cliente.setEmail("kevin@gmail.com");
        cliente.setSenha("123Aa");
        cliente.setLogin("kevin");
        cliente.setTelefones("991887371");
        cliente.setSaldo(1000000.0);
        produto.setNome("máquina de sorvete");
        produto.setPreco(17000);
        produto.setCategoria("Eletrônicos");
        produto.setAvaliacao(4.2);
        produto.setModelo("FastFreeze");
        produto.setMarca("panaMARIO");
        produto.setCor("cinza");
        produto.setEstoque(191);
        produto.setDescricao("fazedora de sorvete gelados deliciosos!");
        produto.setFoto("fotodaora.jpg");
        produto.setLimite(2);
        pagamento.setTotal(17000.0);
        pagamento.setFrete(50.0);
        pagamento.setVenda("Venda");
        pagamento.setParcela(12);
        pagamento.setDesconto(90);
        
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCPF());
        System.out.println("Nascimento: " + cliente.getNasc());
        System.out.println("Endereço: " + endereco.getEndereco());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Login: " + cliente.getLogin());
        System.out.println("Senha: " + cliente.getSenha());
        System.out.println("Telefone: " + cliente.getTelefones());
        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço do produto: " + produto.getPreco());
        System.out.println("Categoria do produto: " + produto.getCategoria());
        System.out.println("Avaliação do produto: " + produto.getAvaliacao());
        System.out.println("Modelo do produto: " + produto.getModelo());
        System.out.println("Marca do produto: " + produto.getMarca());
        System.out.println("Cor do produto: " + produto.getCor());
        System.out.println("Estoque do produto: " + produto.getEstoque());
        System.out.println("Descrição do produto: " + produto.getDescricao());
        System.out.println("Foto do produto: " + produto.getFoto());
        System.out.println("Limite de compra do produto: " + produto.getLimite());
        System.out.println("Total do pagamento: " + pagamento.getTotal());
        System.out.println("Valor do frete: " + pagamento.getFrete());
        System.out.println("Número da venda: " + pagamento.getVenda());
        System.out.println("Número de parcelas: " + pagamento.getParcela());
        System.out.println("Desconto: " + pagamento.getDesconto());
    }

}
