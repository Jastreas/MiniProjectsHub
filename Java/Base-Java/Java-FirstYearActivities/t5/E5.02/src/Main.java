import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //declaracion de array con nval 10
        final int nval = 10;
        int[] ar = new int[nval];
        //declaracion de scanner para asignarle valores al array
        Scanner sc = new Scanner(System.in);

        //bucle para añadir valores al array
        for (int i = 0; i < ar.length;i++){
            System.out.println("Introduzca el valor que se guardará en la posición: " + (i));
            ar[i] = sc.nextInt();
        }

        int contP = 0, contN = 0, cont0 = 0;

        for (int i = 0; i < ar.length; i++){
            if (ar[i] > 0){
                contP += 1;
            } else if (ar[i] < 0){
                contN += 1;
            } else {
                cont0 += 1;
            }
        }

        System.out.println("NP: " + contP + ", NN: " + contN + ", N0s: " + cont0);






    }
}