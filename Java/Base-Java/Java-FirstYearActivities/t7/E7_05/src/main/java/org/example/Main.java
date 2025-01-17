package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la palabra que desee almacenar: ");
        String palabra = sc.next();
        try{
        System.out.println(caracterEn(palabra,7));
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public static char caracterEn(String palabraUsuario, int n) throws Exception{

        /*
        if (p > 0 && p < palabraUsuario.length()){
            return palabraUsuario.charAt(p-1);
        } else {
            throw new Exception("La longitud es incorrecta");
        }*/



        if (palabraUsuario.length() >= 7){
            return palabraUsuario.charAt(n-1);
        } else {
            throw new Exception("La longitud es incorrecta");
        }
    }

}