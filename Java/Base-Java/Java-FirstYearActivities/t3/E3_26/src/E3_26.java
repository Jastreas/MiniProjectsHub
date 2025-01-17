import java.util.Scanner;
public class E3_26 {
    public static long factorial (long numero){
        if (numero == 1){
    return 1;    
}
else {return numero*factorial(numero-1);}
}
    public static void main(String[] args) throws Exception {
        System.out.println("Introduce un numero: ");
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        sc.close();
        System.out.println(factorial(n));

    }
}
