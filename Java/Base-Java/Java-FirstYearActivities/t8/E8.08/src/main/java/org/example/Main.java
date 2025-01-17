package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //introduccion de cantidad de clientes que se quiera almacenar
        int ncli = sc.nextInt();

        try{
            System.out.println("Indique la cantidad de clientes desea almacenar: ");
        System.out.println("Ha seleccionado: " + ncli + " como cantidad.");
        } catch (Exception e){
            System.out.println(e);
        }

        //creacion del array de clientes
        System.out.println("A continuacion introducirá los datos de los clientes que ha decidido tener (pulse enter)");
        sc.nextLine();
        System.out.println("---------------------------");
        ArrayList<Cliente> listaclientes = new ArrayList<Cliente>();
        String auxdni, auxnombre, auxapellido, auxdireccion;
        int auxtel;
        try {
            for (int i = 0; i < ncli; i++) {
                System.out.println("Introduzca el dni: ");
                auxdni = sc.nextLine();
                System.out.println("Introduzca el nombre: ");
                auxnombre = sc.nextLine();
                System.out.println("Introduzca el apellido: ");
                auxapellido = sc.nextLine();
                System.out.println("Introduzca el direccion: ");
                auxdireccion = sc.nextLine();
                System.out.println("Introduzca el numero de telefono: ");
                auxtel = sc.nextInt();
                Cliente cl = new Cliente();
            }
        } catch (Exception e){
            System.out.println(e);
        }
        
    }
}