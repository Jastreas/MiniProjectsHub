package org.example;

public class Cliente {
    String dni, nombre, apellido, direccion;
    int telefono;

    //constructor vacio
    Cliente(){}
    //constructor con parametros
    Cliente(String DNI, String NOMBRE, String APELLIDO, String DIRECCION, int TELEFONO){
        dni = DNI;
        nombre = NOMBRE;
        apellido = APELLIDO;
        direccion = DIRECCION;
        telefono = TELEFONO;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "DNI: " + dni +
                "\nNombre: "+ nombre +
                "\nApellido: "+ apellido +
                "\nDireccion: " + direccion +
                "\nTelefono: "+telefono;
    }
}
