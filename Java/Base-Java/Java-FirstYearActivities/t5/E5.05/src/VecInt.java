import java.util.Random;
import java.util.Scanner;
public class VecInt {
    private int ar[];
    Scanner sc = new Scanner(System.in);

    //Constructor

    VecInt (int n){
        int ar[] = new int[n];
    }


    //metodos

    public void cargar(){
        for (int i = 0; i < ar.length; i++){
            System.out.println("Introduce el valor del array: (" + i + "/" + ar.length + ")");
            ar[i] = sc.nextInt();
        }
    }

    public void cargar(int a, int b){
            Random rd = new Random();
        int randomNumber;

        for (int i = 0; i < ar.length; i++){
            randomNumber = rd.nextInt(b - a + 1) + a;
            ar[i] = randomNumber;
        }
    }

    public double promedio(){
        int suma=0;
        double promedio=0;

        for (int i = 0; i < ar.length; i++){
            suma += ar[i];
        }
        return promedio = suma/ar.length;
    }

    public int moda(){
    int max = 0;
    int masRepetido = 0;

    for (int i = 0; i < ar.length; i++){
        contar(ar[i]);
    }
    return masRepetido;
    }

    private int contar(int n){
        int contador = 0;
        for (int i = 0; i < ar.length; i++){
            if (ar[i] == n){
                contador++;
            }
        }
        return contador;
    }

    

    
}
