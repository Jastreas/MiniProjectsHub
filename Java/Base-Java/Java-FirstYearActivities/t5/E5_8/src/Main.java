import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el tamaño del vector");
        int T = sc.nextInt();
        int []vec = new int[T];

        for (int i=0; i<vec.length; i++){
            vec[i] = (int)(Math.random()*1);
        }
        System.out.println("Introduzca un número: ");
        int n = sc.nextInt();

        for (int i=0; i<vec.length; i++){
            if (vec[i] == n){
                System.out.println("Se encuentra por primera vez en la posicion: " + i);
                break;
            }else{
                System.out.println("No esta en ninguna parte del array");
                break;
            }
        }
        
    }
}