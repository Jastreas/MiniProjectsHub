package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        lista = leerArray(lista);
        String cadmaslarga = cadenaMasLarga(lista);

        System.out.println("La cadena mas larga es: " + cadmaslarga );
    }

    public static ArrayList<String> leerArray(ArrayList<String> lis){
        String cadena = "";
        while(cadena != "FIN"){
            System.out.println("Introduzca una cadena de caracteres: ");
            cadena = sc.next();
            lis.add(cadena);
            if(cadena.equals("fin") || cadena.equals("Fin") || cadena.equals("FIn") || cadena.equals("FIN") || cadena.equals("fIN") || cadena.equals("fiN") || cadena.equals("fIn")){
                cadena="FIN";
            }
        }
        return lis;
    }

        public static String cadenaMasLarga(ArrayList<String> ls){
        for(int i=0; i<ls.size(); i++){
            String cadena="";
            if(cadena.length() < ls.get(i).length()){
            } else {cadena = ls.get(i);
            return cadena;}
        }
        return "";
        }


}