package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Main {
    public static Scanner sc = new Scanner (System.in);

    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<Integer>();

        list = leerValores();
        int suma = calcularSuma(list);
        int media = suma/list.size();

        mostrarResultados(list, suma, media);

    }

    public static ArrayList<Integer> leerValores(){
        ArrayList <Integer> lista = new ArrayList<Integer>();
        int n = 0;
        while (n != -99){
            System.out.println("Introduzca el valor que desea almacenar: ");
            try {
                n = sc.nextInt();
            if (n != -99){
                lista.add(n);
            }
            } catch (Exception e){
                System.out.println("Alguno de los valores introducidos es incorrecto.");
                sc.nextLine();
            }
        }
        return lista;
    }


    public static int calcularSuma(ArrayList<Integer> lista){
        int suma=0;
        Iterator<Integer> it = lista.iterator();
        while(it.hasNext()){
            suma += it.next();
        } return suma;
    }

    
    public static void mostrarResultados(ArrayList<Integer> lista, int suma, int media){
        int m =calcularSuma(lista)/lista.size(), cont = 0;
        for (Integer elemento:lista){
            if(elemento>m){
                cont++;
            }
        }
        System.out.println(calcularSuma(lista) + "\n Media: " + m + "\n Numeros superiores a la media: " + cont);
    }





}