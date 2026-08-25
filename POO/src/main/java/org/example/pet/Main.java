package org.example.pet;

public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Lola", 3, "Pitbull","Médio", "Ração");
        Pet pet2 = new Pet("bocade09",4,"Pinscher", "Pequeno", "Lixo");


        System.out.println("\n==Pet 1==");
        System.out.println(pet1.toString());



        System.out.println("\n==Pet 2==");
        System.out.println(pet2.toString());
    }
}
