import java.util.Scanner;

public class E3_21 {

    public static void escribir(String str) {
        System.out.println(str);
    }

    public static int leerNumero() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        return num;
    }

    public static void main(String[] args) throws Exception {
        escribir("introduce un valor");
        int valor = leerNumero();
        escribir("el número es " + valor);

    }
}
