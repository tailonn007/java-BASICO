package org.example;

import java.util.Scanner;

public class Vetores3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] notas = new double[2];
        double soma = 0;

        for (int i = 0; i < 2; i++) {
            do {
                System.out.println("Digite a " + (i + 1) + "ª nota:");
                notas[i] = ler.nextDouble();

                if (notas[i] < 0 || notas[i] > 10) {
                    System.out.println("Nota inválida! Por favor, digite um valor entre 0 e 10.");
                }
            } while (notas[i] < 0 || notas[i] > 10);


            soma += notas[i];
        }

        System.out.println("\nExibindo as notas:");
        for (double nota : notas) {
            System.out.println("Nota: " + nota);
        }

        double media = soma / notas.length;

        System.out.println("\nMédia aritmética: " + media);

        ler.close();
    }
}