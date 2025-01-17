import java.util.Scanner;

public class E3_14 {
    public static void main(String[] args) throws Exception {
        int exit = 0;

        while (exit != -1) {
            boolean esPrimo = true;
            System.out.println("Recuerde que para salir del programa ha de introducir 1. Gracias.");
            System.out.println("Introduzca el número que desee comprobar: ");
            Scanner sc = new Scanner(System.in);
            int numero = sc.nextInt();

            if (numero < 1) {
                esPrimo = false; // Los números menores o iguales a 1 no son primos.
            } else if (numero <= 3) {
                esPrimo = true; // 2 y 3 son primos.
            } else if (numero % 2 == 0 || numero % 3 == 0) {
                esPrimo = false; // Los múltiplos de 2 y 3 no son primos.
            } else {
                for (int i = 5; i * i <= numero; i += 6) {
                    if (numero % i == 0 || numero % (i + 2) == 0) {
                        esPrimo = false; // Si es divisible por algún número en el rango, no es primo.
                        break;
                    }
                }
            }

            if (esPrimo) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " no es un número primo.");
            }

            if (numero == -1) {
                exit = -1;
            }

        }
    }

}
