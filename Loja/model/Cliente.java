package model;

import java.util.ArrayList;

public class Cliente {

    private String nome;
    private String cpf;
    private ArrayList<Endereco> enderecos = new ArrayList<>();
    private ArrayList<String> telefones = new ArrayList<>();
    private String email;
    private String dataNascimento;
    private String login;
    private String senha;
    private Double saldo;
    private Carrinho carrinho;
    private Boolean cadastrado = false;
    private String aviso;

    public Cliente(String nome, String cpf, String dataNascimento, String email, String login, String senha) {
        setNome(nome);
        setCPF(cpf);
        setNascimento(dataNascimento);
        setEmail(email);
        setLogin(login);
        setSenha(senha);
    }

    public void adicionarEndereco(Endereco endereco) {
        enderecos.add(endereco);
    }

    public void adicionarTelefone(String telefone) {
        telefones.add(telefone);
    }

    public void criarCarrinho() {
        carrinho = new Carrinho(this);
    }

    public Carrinho getCarrinho() {
        return carrinho;
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

    public boolean verificarLogin(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }

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

    public void setLogin(String login) {
        if (login.equals("kevin")) {
            this.login = login;
        } else {
            throw new IllegalArgumentException("Login inválido");
        }
    }

    public void setNascimento(String nascimento) {
        if (nascimento.matches("^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])$")) {
            this.dataNascimento = nascimento;
        } else {
            throw new IllegalArgumentException("Data de nascimento inválida");
        }
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

    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    public ArrayList<String> getTelefones() {
        return telefones;
    }

    public String getNascimento() {
        return dataNascimento;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public Boolean getCadastrado() {
        return cadastrado;
    }

    public void setCadastrado(Boolean cadastrado) {
        this.cadastrado = cadastrado;
    }

    public String getAviso() {
        return aviso;
    }

    public void setAviso(String aviso) {
        this.aviso = aviso;
    }
}
