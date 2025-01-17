//Hay que revisar la forma en la que se declaran las variables en la parte de los parametros al declarar la clase


package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su DNI: ");
        int dni = sc.nextInt();
        System.out.println("Introduzca su nombre: ");
        String nombre = sc.next();
        System.out.println("Introduzca su apellido: ");
        String apellido = sc.next();
        System.out.println("Introduzca la cantidad de numeros de telefono que desee almacenar: ");
        int cantNT = sc.nextInt();
        Telefono []vtel = new Telefono[cantNT];
        for (int i = 0; i< vtel.length; i++) {
            System.out.println("Introduzca el prefijo de su telefono: ");
            String prefijoTelefono = sc.next();
            System.out.println("Introduzca el numero de su telefono: ");
            String numeroTelefono = sc.next();
            try {
                vtel[i] = new Telefono(prefijoTelefono,numeroTelefono);
            } catch (ExcepcionTel e) {
                e.getMessage();
            }
        }
        System.out.println("Introduzca su edad: ");
        int edad = sc.nextInt();


        Persona P1 = new Persona(dni, nombre, apellido, vtel, edad);
        System.out.println(P1);


    }
}