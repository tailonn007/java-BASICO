package org.example.informacoes;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("12134568", "Jose", 1652.33,Setor.RECURSOSHUMANOS, Sexo.MASCULINO,24);
        Funcionario funcionario2 = new Funcionario("78945612","Maria",2561.22,Setor.VENDAS,Sexo.FEMININO,29);


        System.out.println(funcionario1.toString());
        System.out.println(funcionario2.toString());
    }
}
