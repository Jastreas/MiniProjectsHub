import java.util.Scanner;

public class E3_22 {

    public static int Aleatorio(int max_num, int min_num) {
        int rand = (int) (Math.random() * ((max_num - min_num + 1) + min_num));
        return rand;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Introduzca el número mínimo: ");
        Scanner sc = new Scanner(System.in);
        int num_min = sc.nextInt();
        System.out.println("Introduzca el número máximo: ");
        int num_max = sc.nextInt();

        System.out.println(E3_22.Aleatorio(num_min, num_max));
        sc.close();

    }
}

