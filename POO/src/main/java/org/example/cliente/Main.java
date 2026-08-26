package org.example.cliente;

public class Main {
    public static void main(String[] args) {
        Pet cachorro1 = new Pet("Lola",5,"Pitbull");
        Clientes clientes1= new Clientes("Kayo", 18,cachorro1);

        System.out.println("\n==Pet==");
      //  System.out.println(cachorro1.toString());

        System.out.println("nome:"+ cachorro1.getNome());
        System.out.println("idade:" + cachorro1.getIdade());
        System.out.println("Raça:" + cachorro1.getRaça());

        System.out.println("\n==Cliente==");
     //   System.out.println(clientes1.toString());


        System.out.println("Nome:" + clientes1.getNome());
        System.out.println("idade:" + clientes1.getIdade());
        System.out.println("Pet:" + clientes1.getPet());
    }
}
