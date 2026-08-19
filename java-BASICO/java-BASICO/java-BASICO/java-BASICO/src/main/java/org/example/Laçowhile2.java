package org.example;

import java.util.Scanner;

public class Laçowhile2 {
    static void main (){
        Scanner ler = new Scanner(System.in);

        int avaliacao;
            do {
                System.out.println("avalie nosso atendimento, de 1 a 5 estrelas: ");
                avaliacao= ler.nextInt();

            }while(avaliacao<1||avaliacao>5);
        System.out.println("obrigado!");
    }
}
