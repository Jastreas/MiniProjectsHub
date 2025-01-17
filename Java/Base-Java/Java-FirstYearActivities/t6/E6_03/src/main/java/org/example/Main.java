package org.example;

public class Main {
    public static void main(String[] args) {
        Empleado E1 = new Empleado("Rafa");
        Directivo D1 = new Directivo("Mario");
        Operario O1 = new Operario("Alfonso");
        Oficial OF1 = new Oficial("Luis");
        Tecnico TE1 = new Tecnico("Pablo");
        System.out.println(E1);
        System.out.println(D1);
        System.out.println(O1);
        System.out.println(OF1);
        System.out.println(TE1);
        
    }
}