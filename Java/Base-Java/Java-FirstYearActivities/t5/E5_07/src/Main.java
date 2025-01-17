import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de veces que quiere simular: ");
        int nSim = sc.nextInt();
        int []vec = new int[nSim];
        int res=0;
        for (int i = 0; i < nSim; i++){
            res = (int)(Math.random()*6);
            vec[res]++;
        }
        for(int i = 0; i<6; i++){
            System.out.println("Cantidad de " + (i+1) + ": " + vec[i]);
        }
    }
}