package org.example.computador;

public class Dispositivo_De_Armazenamento extends Componentes{
    private String tipoDeConecxao;

    public Dispositivo_De_Armazenamento(String marca, String modelo, String tipoDeConecxao) {
        super(marca, modelo);
        this.tipoDeConecxao = tipoDeConecxao;
    }

    public String getTipoDeConecxao() {
        return tipoDeConecxao;
    }

    public void setTipoDeConecxao(String tipoDeConecxao) {
        this.tipoDeConecxao = tipoDeConecxao;
    }

    @Override
    public String toString() {
        return "Dispositivo_De_Armazenamento{" +
                "tipoDeConecxao='" + tipoDeConecxao + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
