package model;

public class cliente {

    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;
    private int nasc;
    private String login;
    private String senha;
    private Double saldo;
    private String pagamento;
/**
 * 
 * @param nome
 */
    public void setNome(String nome) {
        if (nome.matches("[A-Za-z]*")) {
            this.nome = nome;
        } else {
            System.out.print("nome invalido");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
        if (email.matches("[@]*") && email.matches("[A-Za-z]*") && email.matches("[0-9]*")) {
            this.email = email;
        } else {
            System.out.print("email invalido");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setSenha(String senha) {
        if (senha.matches("aluno123*")) {
            this.senha = senha;
        } else {
            System.out.print("senha invalida");
        }
    }

    public String getSenha() {
        return senha;
    }

    public void setLogin(String login) {
        if (login.matches("login*") && senha.matches(senha)) {
            this.login = login;
        } else {
            System.out.print("login invalido");
        }
    }

    public String getLogin() {
        return login;
    }

    public void setPagamento(String pagamento) {
        if (pagamento.matches("cartão*") && pagamento.matches("dinheiro*") && pagamento.matches("pix*")) {
            this.pagamento = pagamento;
        } else {
            System.out.print("forma de pagamento invalida");
        }
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setNumTelefone(String telefone) {
        if (telefone.matches("[0-9]*") && telefone.length() == 9) {
            this.telefone = telefone;
        } else {
            System.out.print("numero invalido");
        }
    }

    public String getNumeroTelefone() {
        return telefone;

    }

    public void setNasc(int nasc) {
        if (nasc >= 18) {
            this.nasc = nasc;
        } else {
            System.out.print("menor de idade detectado");
        }
    }

    public int getNasc() {
        return nasc;

    }

    public void setNumCPF(String cpf) {
        if (cpf.toString().matches("[0-9]*") && cpf.length() == 11) {
            this.cpf = cpf;
        } else {
            System.out.print("cpf invalido");
        }
    }

    public String getCPF() {
        return cpf;
    }

    public void setEndereco(String endereco) {
        if (endereco.matches("[A-Za-z]*") && endereco.matches("[0-9]*")) {
            this.endereco = endereco;
        } else {
            System.out.println("endereço invalido");
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setSaldo(Double saldo) {
        if (saldo >= saldo) {
            this.saldo = saldo;
        } else {
            System.out.print("saldo insuficiente");
        }
    }

    public Double getSaldo() {
        return saldo;

    }

    public cliente(String nome) {
        setNome(nome);
    }

}