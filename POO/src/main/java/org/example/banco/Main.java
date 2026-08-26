package org.example.banco;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria= new ContaBancaria("Inter","0001-9","12345-6","Corrente",525.56,1.200);
        Funcionario funcionario= new Funcionario(001,"Alberto","4733315","71981234052","alberto00@gmail.com",contaBancaria);

        System.out.println("\n=====================================Conta Bancaria===========================================");
        System.out.println(contaBancaria.toString());

        System.out.println("\n======================================Funcionario============================================");
        System.out.println(funcionario.toString());
    }
}
