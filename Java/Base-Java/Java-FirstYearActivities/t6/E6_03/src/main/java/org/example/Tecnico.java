package org.example;

public class Tecnico extends Operario{
    //constructor
    public Tecnico(String nombre){
        super(nombre);
    }
    //to string


    @Override
    public String toString() {
        return ("Empleado " + getNombre() + " --> Operario --> Técnico.");
    }
}
