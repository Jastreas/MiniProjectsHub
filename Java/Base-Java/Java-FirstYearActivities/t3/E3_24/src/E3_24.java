import java.util.Scanner;
public class E3_24 {
    public static int maximo (int pr, int seg, int ter){
        int max = 0;
        if (pr>seg && pr > ter){
            max = pr;
        }
        if (seg>pr && seg>ter){
            max=seg;
        }
        if (ter>seg && ter>pr){
            max=pr;
        }
        return max;

    }


    public static void main(String[] args) throws Exception {

            Scanner sc = new Scanner(System.in);
            
            int max;
            
            int a, b, c;
            
            System.out.print("Introduzca un numero: ");
            
            a=sc.nextInt();
            
            System.out.print("Introduzca otro numero: ");
            
            b=sc.nextInt();
            
            System.out.print("Introduzca el último: ");
            
            c=sc.nextInt();
            
            System.out.println("");
            
            max =maximo (a, b, c);
            
            System.out.println("El número mayor es: " +max);

            sc.close();
            
            }
}

