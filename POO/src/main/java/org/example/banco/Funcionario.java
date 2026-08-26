package org.example.banco;

public class Funcionario {
    private int codigoDeFuncionario;
    private String Nome;
    private String endereco;
    private String telefone;
    private String email;
    private ContaBancaria contaBancaria;

    public Funcionario(int codigoDeFuncionario, String nome, String endereco, String telefone, String email, ContaBancaria contaBancaria) {
        this.codigoDeFuncionario = codigoDeFuncionario;
        Nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.contaBancaria = contaBancaria;
    }

    public int getCodigoDeFuncionario() {
        return codigoDeFuncionario;
    }

    public void setCodigoDeFuncionario(int codigoDeFuncionario) {
        this.codigoDeFuncionario = codigoDeFuncionario;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ContaBancaria getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(ContaBancaria contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "codigoDeFuncionario=" + codigoDeFuncionario +
                ", Nome='" + Nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", contaBancaria=" + contaBancaria +
                '}';
    }
}
