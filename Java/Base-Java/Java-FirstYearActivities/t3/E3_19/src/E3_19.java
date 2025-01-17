import java.util.Scanner;

public class E3_19 {

    public static boolean esPar(int numero) {
        return (numero % 2 == 0);
    }

    public static void main(String[] args) throws Exception {
        int num = 0;
        while (num != -1) {

            System.out.println("Introduzca su numero: ");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            if (!esPar(num)) {
                System.out.println("Es impar");
            } else {
                System.out.println("Es par");
            }
            sc.close(); // Eliminar este close al abrir el programa, si no, crashea.

        }

        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
