import java.util.Scanner;

public class E3_30 {

    public static void p (int n){
        if (n == 1){
            System.out.println(n);
        }
        else {
            p(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Introduzca un número: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        p(num);
    }
}
