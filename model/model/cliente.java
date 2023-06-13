package model;

import java.util.ArrayList;

public class cliente {

    private String nome;
    private String cpf;
    private ArrayList<String> endereco = new ArrayList<>();
    private ArrayList<String> telefones = new ArrayList<>();
    private String email;
    private String nasc;
    private String login = "kevin";
    private String senha = "123";
    private Double saldo;
    private String pagamento;

    public void setNome(String nome) {
        if (nome.matches("[A-Za-z]+")) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome inválido");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
       
        if (email.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}")) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Email inválido");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setSenha(String senha) {
        if (senha.equals("123")) {
            this.senha = senha;
        } else {
            throw new IllegalArgumentException("Senha inválida");
        }
    }

    public String getSenha() {
        return senha;
    }

    public void setLogin(String login) {
        if (login.equals("kevin")) {
            this.login = login;
        } else {
            throw new IllegalArgumentException("Login inválido");
        }
    }

    public String getLogin() {
        return login;
    }

    public void setPagamento(String pagamento) {
        if (pagamento.equals("cartao") || pagamento.equals("dinheiro") || pagamento.equals("pix")) {
            this.pagamento = pagamento;
        } else {
            throw new IllegalArgumentException("Forma de pagamento inválida");
        }
    }

    public String getPagamento() {
        return pagamento;
    }

    public ArrayList<String> getTelefones() {
        return telefones;
    }

    public void setTelefones(ArrayList<String> telefones) {
        for (String telefone : telefones) {
            if (telefone.matches("^[0-9]{2}-([0-9]{8}|[0-9]{9})")) {
                this.telefones.add(telefone);
            } else {
                throw new IllegalArgumentException("Telefone inválido: " + telefone);
            }
        }
    }

    public void setNasc(String nasc) {
        if (nasc.matches("^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])$")) {
            this.nasc = nasc;
        } else {
            throw new IllegalArgumentException("Data de nascimento inválida");
        }
    }

    public String getNasc() {
        return nasc;
    }

    public void setCPF(String cpf) {
        if (cpf.matches("[0-9]{11}")) {
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("CPF inválido");
        }
    }

    public String getCPF() {
        return cpf;
    }

    public ArrayList<String> getEndereco() {
        return endereco;
    }

    public void setEndereco(ArrayList<String> endereco) {
        for (String enderecoItem : endereco) {
            if (enderecoItem.matches("[A-Za-z0-9]+")) {
                this.endereco.add(enderecoItem);
            } else {
                throw new IllegalArgumentException("Endereço inválido: " + enderecoItem);
            }
        }
    }

    public void setSaldo(Double saldo) {
        if (saldo >= 0.0) {
            this.saldo = saldo;
        } else {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
    }

    public Double getSaldo() {
        return saldo;
    }

    public cliente(String nome) {
        setNome(nome);
    }

    public void setTelefones(String string) {
    }

    public void setEndereco(String string) {
    }
}
