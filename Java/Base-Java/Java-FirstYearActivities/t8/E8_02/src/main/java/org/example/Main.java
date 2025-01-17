package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Double> alturas = new ArrayList<Double>();

    public static void main(String[] args) {
      int nalumnos = numeroAlumnos();
      leerAlturas(alturas, nalumnos);
      double media = calcularMedias(alturas);
      mostrarResultados(alturas,media);
    }

    public static int numeroAlumnos(){       //se repite hasta que se introduzca un valor correcto
        while (true) {
            try {
                System.out.println("Por favor, introduzca la cantidad de alumnos que quiera gestionar: ");
                int n = sc.nextInt();
                return n;
            } catch (Exception e) {
                System.out.println("No se ha podido añadir el numero que ha introducido.");
            }
        }
    }
    
    public static void leerAlturas(ArrayList<Double> alt, int nalumnos){
        for (int i=0; i<nalumnos; i++){
            try {
                System.out.println("Introduzca la altura del alumno: " + i);
                alt.add(sc.nextDouble());
            } catch (Exception e){
                System.out.println("Ha introducido un valor erroneo, por favor introduzca un double: " + e);
            }
        }
    }

    public static double calcularMedias(ArrayList<Double> alt){
        double sum = 0;
        for(int i=0; i<alt.size(); i++){
            sum += alt.get(i);
        }
        double res = sum/alt.size();
        return res;
    }

    public static void mostrarResultados(ArrayList<Double> al, double media){
        String mayormedia = "", menormedia = "", igualmedia = "";
        for (int i=0; i<al.size(); i++){
            if(al.get(i) > media){
                mayormedia += al.get(i);
            } else if(al.get(i) < media){
                menormedia += al.get(i);
            } else {
                igualmedia += al.get(i);
            }
        }

        System.out.println("Mayores a la media: "+mayormedia+" "+"\nMenores a la media: "+menormedia+" "+"\nIguales a la media: "
                +" "+igualmedia);
    }


    

}