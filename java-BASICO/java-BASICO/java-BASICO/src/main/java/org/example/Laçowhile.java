package org.example;

import java.util.Scanner;

public class Laçowhile {
    static void main(){
        Scanner ler = new Scanner(System.in);
        System.out.println("digite sua idade");
        int idade = ler.nextInt();

        while (idade < 18){
            System.out.println("acesso negado");
            System.out.println("digite sua idade");
            idade = ler.nextInt();

        }
        System.out.println("acesso permitido");
        System.out.println("carregando...");
    }

}
