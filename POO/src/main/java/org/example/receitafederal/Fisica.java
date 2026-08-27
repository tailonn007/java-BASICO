package org.example.receitafederal;

public class Fisica extends Pessoa {
    private String cpf;
    private String rg;
    private String DataDeNascimento;

    public Fisica(String nome, String telefone, String cpf, String rg, String dataDeNascimento) {
        super(nome, telefone);
        this.cpf = cpf;
        this.rg = rg;
        DataDeNascimento = dataDeNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataDeNascimento() {
        return DataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        DataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "Fisica{" +
                "cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", DataDeNascimento='" + DataDeNascimento + '\'' +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
