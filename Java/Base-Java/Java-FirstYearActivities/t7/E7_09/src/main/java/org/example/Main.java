package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            Fraccion f1 = new Fraccion(2, 4);
            Fraccion f2 = new Fraccion(4,8);
            System.out.println(f1.sumar(f2));
            System.out.println(f2.sumar(f1));
            System.out.println(f1.resta(f2));
            System.out.println(f2.resta(f1));
            System.out.println(f1.multiplicacion(f2));
            System.out.println(f2.multiplicacion(f1));
            System.out.println(f1.division(f2));
            System.out.println(f2.division(f1));
        } catch (Excepcion e){
            System.out.println(e);
        }


    }
}