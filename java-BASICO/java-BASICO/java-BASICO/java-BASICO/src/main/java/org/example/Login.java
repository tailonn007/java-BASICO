package org.example;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String loginCorreto = "alberth";
        String senhaCorreta = "0000";

        System.out.print("Digite seu nome de login: ");
        String login = scanner.nextLine();

        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        if (login.equals(loginCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Bem-vindo, Seu otario!");
        } else {
            System.out.println("Nome do usuario ou senha inválidos abestalhado");
        }

        scanner.close();
    }
}