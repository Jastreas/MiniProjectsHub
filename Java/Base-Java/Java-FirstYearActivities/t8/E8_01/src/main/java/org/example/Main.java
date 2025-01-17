package org.example;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        ListaCantantesFamosos l1 = new ListaCantantesFamosos();

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer cantante: ");
        l1.añadir(sc.next());
        System.out.println("Introduzca el segundo cantante: ");
        l1.añadir(sc.next());

        System.out.println(l1);


        
    }
}