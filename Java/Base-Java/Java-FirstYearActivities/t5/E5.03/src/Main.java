import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //declaramos numero de valores y creamos un array con ese numero de valores (buenas practicas)
        final int nval = 10;
        int[] array = new int[nval];
        //creamos el scanner
        Scanner sc = new Scanner(System.in);

        //Asignamos valores a los arrays
        for (int i = 0; i < array.length; i++){
            System.out.println("valor "+ i + ": "); //dices "Para valor" i y ya el usuario pone el n que quiera
            array[i] = sc.nextInt();  //se le pone al array el valor de lo proximo que introduzca el usr
        }
        //Calculo de la media de positivos y de negativos

        int sumaPos = 0;   //se declara la suma de todos los positivos
        int sumaNeg = 0;   //se decalra la suma de todos los negativos
        int nPos = 0;      //se declara los n positivos
        int nNeg = 0;      //se declara los n negativos

        for (int i = 0; i<array.length; i++)
        {
            if (array[i]>=0)  //Si array [contador] > 0 sumaPositivos = suma + array n [i]
            {
                sumaPos+=array[i];
                nPos++;
            }
            else              //Si < 0 lo mismo con negativo
            {
                sumaNeg+=array[i];
                nNeg++;
            }
        }
        System.out.println("La media de los positivos es "+(sumaPos/nPos));
        System.out.println("La media de los negativos es "+(sumaNeg/nNeg));

        
    }
}