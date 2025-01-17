package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        llenar(list);

        System.out.println("Ahora se moverá");
        sc.nextLine();
        mover(list);
        mostrar(list);

    }

    public static ArrayList<Integer> llenar(ArrayList<Integer> ar){
        int n = 0;
        while (n != -99){
            System.out.println("Introduzca un valor: ");
            n = sc.nextInt();
            ar.add(n);
        }
        return ar;
    }

    public static ArrayList<Integer> mover (ArrayList<Integer> lista){
        lista.add(lista.remove(lista.size() - 1));
        return lista;
    }

    public static void mostrar (ArrayList<Integer> lista){
        Iterator<Integer> iterator = lista.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()+"");
        }
    }


}