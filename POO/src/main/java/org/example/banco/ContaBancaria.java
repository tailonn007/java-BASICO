package org.example.banco;

public class ContaBancaria {
    private String banco;
    private String agencia;
    private String numeroDaConta;
    private String tipoDaConta;
    private double saldoAtual;
    private double limeiteDisponivel;

    public ContaBancaria(String banco, String agencia, String numeroDaConta, String tipoDaConta, double saldoAtual, double limeiteDisponivel) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroDaConta = numeroDaConta;
        this.tipoDaConta = tipoDaConta;
        this.saldoAtual = saldoAtual;
        this.limeiteDisponivel = limeiteDisponivel;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTipoDaConta() {
        return tipoDaConta;
    }

    public void setTipoDaConta(String tipoDaConta) {
        this.tipoDaConta = tipoDaConta;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public double getLimeiteDisponivel() {
        return limeiteDisponivel;
    }

    public void setLimeiteDisponivel(double limeiteDisponivel) {
        this.limeiteDisponivel = limeiteDisponivel;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "banco='" + banco + '\'' +
                ", agencia='" + agencia + '\'' +
                ", numeroDaConta='" + numeroDaConta + '\'' +
                ", tipoDaConta='" + tipoDaConta + '\'' +
                ", saldoAtual=" + saldoAtual +
                ", limeiteDisponivel=" + limeiteDisponivel +
                '}';
    }
}
