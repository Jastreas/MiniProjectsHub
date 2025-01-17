package org.example;
import javax.sound.midi.Soundbank;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = null;

        System.out.println("Introduzca la cantidad de espacios que quiere almacenar");
        int nuser = sc.nextInt();
        if (nuser <= 0){
            throw new RuntimeException("El valor introducido es 0 o negativo");
        }

        while (nuser <= 0){
            try{
                a = new int[nuser];
            } catch (RuntimeException e) {
                System.out.println("El valor introducido es incorrecto");
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Introduzca un valor:");
            nuser = sc.nextInt();
        }

       //Si el valor es correcto crea esto
        a = new int[nuser];

        //parte 2

        //ESTE FOR ES MUCHO MEJOR HACERLO CON UN WHILE PARA PODER HACER QUE TE VUELVA A PEDIR LA INTRODUCCION DEL DATO
        //INCORRECTO,LA PROFE LO TIENE HECHO ASI

       for (int i=0; i<a.length; i++){
           System.out.println("Inroduzca el valor que desee almacenar en la posicion: " + i + "/" + a.length);
           try{
           nuser = sc.nextInt();
           a[i] = nuser;
           } catch (Exception e){
               System.out.println("Ha introducido un valor incorrecto con el error: " + e);
               sc.nextLine();
           }
       }

       //parte 3

        boolean es0 = false;

       boolean menu = false;
        while (menu == false) {
            System.out.println("Si desea comprobar las posiciones introducidas escriba 1, de lo contrario, escriba 0.");
            int menuser = sc.nextInt();
            if (menuser == 1) {
                es0 = false;
                menu = true;
            } else if (menuser == 0) {
                es0 = true;
                menu = true;
            } else {
                System.out.println("El valor introducido es incorrecto");
            }
        }

       while (es0 == false){
           try{
               System.out.println("Seleccione la posicion que quiera comprobar: ");
               int i = sc.nextInt();
               if (i == 0){ es0 = true;}
               System.out.println(a[i]);
           }catch (ArrayIndexOutOfBoundsException e){
               System.out.println("El valor introducido esta fuera de rango: "+e );
               sc.nextLine();
           }catch (InputMismatchException e){
               System.out.println("El valor introducido no es valido: " + e);
               sc.nextLine();
           }catch (Exception e){
               System.out.println("El valor introducido no es valido: " + e);
               sc.nextLine();
           }
       } 




    }
}