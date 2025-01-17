import java.util.Scanner;

public class E3_28 {

    public static int f (int n){
        if (n == 0){
            return n;
        }
            return n+f(n-1);

    }
    public static void main(String[] args) throws Exception {
        System.out.println("Introduza un numero: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println(f(num));
    }
}
