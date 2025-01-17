package org.example;

public class Directivo extends Empleado {
    //constructor
    public Directivo(String nombre){
        super(nombre);
    }
    //to string


    @Override
    public String toString() {
        return ("Empleado " + getNombre() + " --> Directivo");
    }
}
