package org.example.veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo=new Veiculo("pkj-0000", "Prata", 5,50,220,15);
        Livro livro=new Livro("Papai noel","Ramon","7858554455454",54,156);

        System.out.println("\n==Veiculo==");
        System.out.println(veiculo.toString());

        System.out.println("\n==Livro==");
        System.out.println(livro.toString());

    }
}
