package org.example.veiculo;

public class Veiculo {
    private String placa;
    private String cor;
    private int numeroDepassageiros;
    private double capacidadeDeTanque;
    private int velocidadeMáxima;
    private double consumoMédio;

    public Veiculo(String placa, String cor, int numeroDepassageiros, double capacidadeDeTanque, int velocidadeMáxima, double consumoMédio) {
        this.placa = placa;
        this.cor = cor;
        this.numeroDepassageiros = numeroDepassageiros;
        this.capacidadeDeTanque = capacidadeDeTanque;
        this.velocidadeMáxima = velocidadeMáxima;
        this.consumoMédio = consumoMédio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroDepassageiros() {
        return numeroDepassageiros;
    }

    public void setNumeroDepassageiros(int numeroDepassageiros) {
        this.numeroDepassageiros = numeroDepassageiros;
    }

    public double getCapacidadeDeTanque() {
        return capacidadeDeTanque;
    }

    public void setCapacidadeDeTanque(double capacidadeDeTanque) {
        this.capacidadeDeTanque = capacidadeDeTanque;
    }

    public int getVelocidadeMáxima() {
        return velocidadeMáxima;
    }

    public void setVelocidadeMáxima(int velocidadeMáxima) {
        this.velocidadeMáxima = velocidadeMáxima;
    }

    public double getConsumoMédio() {
        return consumoMédio;
    }

    public void setConsumoMédio(double consumoMédio) {
        this.consumoMédio = consumoMédio;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", numeroDepassageiros=" + numeroDepassageiros +
                ", capacidadeDeTanque=" + capacidadeDeTanque +
                ", velocidadeMáxima=" + velocidadeMáxima +
                ", consumoMédio=" + consumoMédio +
                '}';
    }
}
