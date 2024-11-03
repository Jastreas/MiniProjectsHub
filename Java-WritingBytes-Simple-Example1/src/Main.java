import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Punto p1 = new Punto(0,0,"Verde");
        Punto p2 = new Punto(0,0,"Negro");
        Punto p3 = new Punto(100,100,"Azúl");

        ArrayList <Punto> lista = new ArrayList<Punto>();
        Punto[] puntos = { p1, p2, p3 };

        for (int i = 0; i < 3; i++){
            lista.add(puntos[i]);
        }

        try {
            ObjectOutputStream oOut = new ObjectOutputStream(new FileOutputStream("Output.txt"));
            oOut.writeObject(lista);
            oOut.close();
        } catch (IOException e){
            System.err.println("Couldn't save the file");
        }

    }
}
