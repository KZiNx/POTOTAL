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
        if (senha.matches("/^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$/gm")) {
            this.senha = senha;
        } else {
            System.out.print("senha invalida");
        }
    }

    public String getSenha() {
        return senha;
    }

    public void setLogin(String login) {
        if (login.matches("/[a-zA-Z0-9_]/g")) {
            this.login = login;
        } else {
            System.out.print("login invalido");
        }
    }

    public String getLogin() {
        return login;
    }

    public void setPagamento(String pagamento) {
        if (pagamento.matches("cartao*") && pagamento.matches("dinheiro*") && pagamento.matches("pix*")) {
            this.pagamento = pagamento;
        } else {
            System.out.print("forma de pagamento invalida");
        }
    }

    public String getPagamento() {
        return pagamento;
    }

    public ArrayList<String> getTelefones() {
        for (int cont = 0; cont <= telefones.size(); cont++) {
            if (telefones.get(cont) != null) {
                return telefones;
            }
        }
        return null;
    }

    public void setTelefones(ArrayList<String> telefones) {
        for (int cont = 0; cont <= telefones.size(); cont++) {
            if (telefones.get(cont).matches("^[0-9]{2}-([0-9]{8}|[0-9]{9})")) {
                this.telefones = telefones;
            }
        }
    }

    public void setNasc(String nasc) {
        if (nasc.matches("/^(19[0-9]{2}|2[0-9]{3})-(0[1-9]|1[012])-([123]0|[012][1-9]|31)$/")) {
            this.nasc = nasc;
        } else {
            System.out.println("data invalida");
        }
    }

    public String getNasc() {
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
            System.out.println("endereco invalido");
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

    public void setTelefones(String string) {
    }

    public cliente(String nome) {
        setNome(nome);
    }
}
