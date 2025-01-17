import java.util.Scanner;
public class E3_23 {

            public static int multiplica (int n){
                int multi =1;

                while(n>0){
                    multi *= n%10;
                    n /= 10;
                }
                return multi;
            }

            public static int persis(int n){
                int contador = 0;
                while (n>10){
                    contador++;
                    n=multiplica(n);
                }
                return contador;

            }
            

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        int num = sc.nextInt();
        System.out.println(persis(num));
        sc.close();

    }
}
