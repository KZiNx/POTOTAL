package model;

import java.util.ArrayList;

public class cliente {

    private String nome;
    private String cpf;
    private String endereco;
    private ArrayList<String> telefones = new ArrayList<String>();
    private String email;
    private String nasc;
    private String login;
    private String senha;
    private Double saldo;
    private String pagamento;

    public void setNome(String nome) {
        if (nome.matches("[A-Za-z]*")) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
        if (email.matches("[A-Za-z0-9]+@[A-Za-z]+\\.[A-Za-z]+")) {
            this.email = email;
        } else {
            System.out.println("Email inválido");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setSenha(String senha) {
        if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$")) {
            this.senha = senha;
        } else {
            System.out.println("Senha inválida");
        }
    }

    public String getSenha() {
        return senha;
    }

    public void setLogin(String login) {
        if (login.matches("[A-Za-z0-9]+")) {
            this.login = login;
        } else {
            System.out.println("Login inválido");
        }
    }

    public String getLogin() {
        return login;
    }

    public void setPagamento(String pagamento) {
        if (pagamento.equals("cartao") || pagamento.equals("dinheiro") || pagamento.equals("pix")) {
            this.pagamento = pagamento;
        } else {
            System.out.println("Forma de pagamento inválida");
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
            if (telefone.matches("[0-9]{11}")) {
                this.telefones.add(telefone);
            } else {
                System.out.println("Telefone inválido");
            }
        }
    }

    public void setTelefones(String telefone) {
        if (telefone.matches("[0-9]{11}")) {
            this.telefones.add(telefone);
        } else {
            System.out.println("Telefone inválido");
        }
    }

    public void setNasc(String nasc) {
        if (nasc.matches("\\d{2}/\\d{2}/\\d{4}")) {
            this.nasc = nasc;
        } else {
            System.out.println("Data inválida");
        }
    }

    public String getNasc() {
        return nasc;
    }

    public void setCPF(String cpf) {
        if (cpf.matches("\\d{11}")) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF inválido");
        }
    }

    public String getCPF() {
        return cpf;
    }

    public void setEndereco(String endereco) {
        if (endereco.matches("[A-Za-z0-9 ]+")) {
            this.endereco = endereco;
        } else {
            System.out.println("Endereço inválido");
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setSaldo(Double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public Double getSaldo() {
        return saldo;
    }

    public cliente(String nome) {
        setNome(nome);
    }
}
