package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // declaração de variaveis
        String nome = "marta";
        int idade = 30;
        double peso= 65.2;

        // declaração de constantes
        final String cpf = "123.456.789-00";

        // exibindo resultado
        // concatenando o sinal de "+"
        System.out.println("O nome do usuario é " + nome);
        System.out.println("O cpf do usuario é " + cpf);
        System.out.println("A idade usuario é" + idade + "anos");
        System.out.println("O peso do usuario é" + peso + "quilos");

    }
}