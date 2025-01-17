package org.example;

public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Armando Sillas", "Cedula", 25, false, 1430.15);
        Programador p1 = new Programador("Federico García Lorzas", "Cedula", 45, true, 2435.99, 645, "Java");

        e1.Mostrar();
        p1.Mostrar();
        System.out.println(e1 + "\n-------------");
        System.out.println(p1);
    }
}