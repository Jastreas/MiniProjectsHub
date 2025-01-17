package org.example;
import java.util.Scanner;
import org.example.Rectangulo;
public class Menu {
    int t, x, y, l1, l2;
    Scanner sc = new Scanner(System.in);
    //const
    public Menu(){
        t = 0;
        x = 0;
        y = 0;
    }

    //metodo seleccionar

    public FiguraGeometrica seleccionar(){
        System.out.println("Selecciona la figura que quieras crear: ");
        t = sc.nextInt();

        switch(t) {
            case 1:
                return new Rectangulo(l1,l2);
            default:
                return new Cuadrado(0,0);
        }
    }

}
