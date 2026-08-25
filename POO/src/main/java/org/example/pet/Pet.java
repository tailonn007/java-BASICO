package org.example.pet;

public class Pet {
    private String nome;
    private int idade;
    private String Raca;
    private String Porte;
    private String Alimentacao;

    public Pet(String nome, int idade, String raca, String porte, String alimentacao) {
        this.nome = nome;
        this.idade = idade;
        Raca = raca;
        Porte = porte;
        Alimentacao = alimentacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return Raca;
    }

    public void setRaca(String raca) {
        Raca = raca;
    }

    public String getPorte() {
        return Porte;
    }

    public void setPorte(String porte) {
        Porte = porte;
    }

    public String getAlimentacao() {
        return Alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        Alimentacao = alimentacao;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", Raca='" + Raca + '\'' +
                ", Porte='" + Porte + '\'' +
                ", Alimentacao='" + Alimentacao + '\'' +
                '}';
    }
}
