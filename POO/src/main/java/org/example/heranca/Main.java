package org.example.heranca;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Julia","18","13.10.2009","Pix");
        Funcionario funcionario = new Funcionario("Renata", "48","002","Atendente",1600.23);


        System.out.println(cliente);
        System.out.println(funcionario);
    }

}
