import java.util.Scanner;

public class E3_20 {

    public static double elev(double bas1, int exp) {
        double result = 1, base = bas1;
        while (exp != 0) {
            result = result * base;
            exp--;
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Introduzca la base: ");
        Scanner sc = new Scanner(System.in);
        double base = sc.nextInt();
        System.out.println("Introduzca el exponente: ");
        int exponente = sc.nextInt();
        sc.close();
        E3_20.elev(base, exponente);

    }
}
