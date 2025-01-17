package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [][]m = new int[5][];
        m[0] = new int[1];
        m[1] = new int[2];
        m[2] = new int[3];
        m[3] = new int[4];
        m[4] = new int[5];

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                System.out.println("Introduzca el valor para la fila: " + i + " columna: " + j);
                m[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }


    }
}