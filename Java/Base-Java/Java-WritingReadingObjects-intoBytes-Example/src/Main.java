import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String file = "Output.txt";
        Punto p1 = new Punto(0,0,"Verde");
        Punto p2 = new Punto(0,0,"Negro");
        Punto p3 = new Punto(100,100,"Azúl");
        ArrayList <Punto> lista = new ArrayList<Punto>();

        Punto[] puntos = { p1, p2, p3 };

        for (int i = 0; i < 3; i++){
            lista.add(puntos[i]);
        }

        try {
            ObjectOutputStream oOut = new ObjectOutputStream(new FileOutputStream(file));
            oOut.writeObject(lista);
            oOut.close();
            System.out.println("Writing Done!");
        } catch (IOException e){
            System.err.println("Couldn't save the file");
        }

        try {
            ObjectInputStream oInp = new ObjectInputStream(new FileInputStream(file));
            ArrayList<Punto> inputListofPunto = (ArrayList<Punto>) oInp.readObject();
            oInp.close();
            System.out.println("Reading Done!");

            //debug
            int cont = 1;
            for(Punto p : inputListofPunto){
                System.out.println("Objeto -----> "+ cont + "\n" + p);
                cont++;
            }

        } catch (IOException | ClassNotFoundException e){
            System.err.println("Couldn't load the file, or Class wasn't found");
            e.printStackTrace();
        }

    }
}
