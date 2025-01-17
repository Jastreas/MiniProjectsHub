import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Introduzca la cantidad de alumnos que hay en la clase: ");
        Scanner sc = new Scanner(System.in);
        final int numNotas = sc.nextInt();
        double[] ar1 = new double[numNotas];
        double S = 0;
        int nSaM = 0;

        for (int i = 0; i < ar1.length; i++){
            System.out.println("Introduzca una nota."+ "("+ (i + 1) + "/" + numNotas + ")");
            ar1[i] = sc.nextDouble();
            S = S + ar1[i];
        }

        double m = S/numNotas;

        for(int i = 0; i < ar1.length; i++){
            if (ar1[i] > m){
                nSaM += 1;
            }
        }

        System.out.println("Los alumnos superiores a la media son: " + nSaM);
        
        
    }
}