package org.example;

public class Main {
    public static void main(String[] args) {

        try {
            throw new Miexcepcion("Texto de mi excepcion");
        } catch (Miexcepcion e){
            e.mostrar();
        }
    }
}