package org.example;

public class Oficial extends Operario {       //constructor
    public Oficial(String nombre){
        super(nombre);
    }
    //to string


    @Override
    public String toString() {
        return ("Empleado " + getNombre() + " --> Operario --> Oficial.");
    }
}
