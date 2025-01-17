package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero de empleados: ");
        int n = sc.nextInt();


        String []v = new String[n];
        int [][]m = new int[n][];

        for(int i=0; i<m.length; i++){
            System.out.println("Introduzca el nombre del empleado");
            v[i] = sc.next();
            System.out.println("Introduzca la cantidad de dias que ha faltado");
            m[i] = new int [sc.nextInt()];
            for(int j=0; j<m[i].length; j++){
                System.out.println("Introduzca los dias que ha faltado " + v[i] + ". " + j + "/" + m.length);
                m[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                System.out.println("Trabajador: " + v[i] + " ha faltado el dia: " + m[i][j]);
            }
        }
    }
}