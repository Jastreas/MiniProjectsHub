package org.example;
import java.util.Scanner;

public class Persona {
    private String nombre;
    private int edad;
    Scanner teclado;

    public Persona(){
    }

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void cargar(){
        teclado = new Scanner(System.in);
        System.out.println("Dime el nombre: ");
        nombre = teclado.next();
        System.out.println("Dime la edad: ");
        edad = teclado.nextInt();
    }

    public void imprimir(){
        System.out.println(nombre + " " + edad);
    }


}
