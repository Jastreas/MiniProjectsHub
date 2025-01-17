import java.util.Scanner;

public class Altura {
    float [] ar = new float[5];
    Scanner sc = new Scanner(System.in);
    float numuser = 0;

    public Altura(){} //Si se deja vacío el valor inicial es 0

    public Altura(float a, float b, float c, float d, float e){
        ar[0] = a;
        ar[1] = b;
        ar[2] = c;
        ar[3] = d;
        ar[4] = e;
    }

    //metodos

    public void cargar(){
        for (int i = 0; i < ar.length; i++){
            System.out.println("Introduzca la altura: (" + i + "/" + ar.length + ")");
            numuser = sc.nextFloat();
            ar[i] = numuser;
        }
    }

    public float calcularPromedio(){
        float snum = 0, prom = 0;

        for (int i = 0; i < ar.length; i++){
            snum += ar[i];
        }
        return  prom = snum/ar.length;
    }

    public int mayoresPromedio(){
        int pers = 0;
        float prom = calcularPromedio();

        for (int i = 0; i < ar.length; i++){
            if (ar[i] > prom){
                pers += 1;
            }
        }

        return pers;
    }

    public int menoresPromedio(){
        int pers = 0;
        float prom = calcularPromedio();

        for (int i = 0; i < ar.length; i++){
            if (ar[i] > prom){
                pers += 1;
            }
        }

        return pers;
    }
    }


