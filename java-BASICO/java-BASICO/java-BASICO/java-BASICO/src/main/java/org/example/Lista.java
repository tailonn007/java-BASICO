package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Double>notas=new ArrayList<>();

        notas.add(10.0);
        notas.add(8.0);
        notas.add(7.0);


        for(double nota: notas){
            System.out.println("nota:"+ nota);
        }
    }
}
