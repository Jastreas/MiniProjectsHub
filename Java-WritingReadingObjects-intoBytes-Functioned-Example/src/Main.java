import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static void guardarArrayListPuntos(ArrayList<Punto> list, String file){
        try {
            ObjectOutputStream oOS = new ObjectOutputStream(new FileOutputStream(file));
            oOS.writeObject(list);
            oOS.close();
            System.out.println("Writing Completed!! :)");
        } catch (IOException e){
            System.err.println("Couldn't save the file :(");
        }
    }


    public static ArrayList<Punto> leerArrayListPuntos(String file){
        ArrayList <Punto> list = null;
        try {
            ObjectInputStream oIS = new ObjectInputStream(new FileInputStream(file));
            list = (ArrayList<Punto>) oIS.readObject();
            oIS.close();
            System.out.println("Reading Completed!!! :)");
        } catch (Exception e){
            System.err.println("Couldn't load the file D:");
        }
        return list;
    }


    public static void main(String[] args) {
        String file = "Output.txt";
        Punto p1 = new Punto(0,0,"Verde");
        Punto p2 = new Punto(0,0,"Negro");
        Punto p3 = new Punto(100,100,"Azúl");

        Punto[] puntos = { p1, p2, p3 };

        ArrayList<Punto> lista = new ArrayList<>(Arrays.asList(puntos).subList(0, 3));

        /*try {
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
        }*/

        guardarArrayListPuntos(lista, "example.txt");
        System.out.println(leerArrayListPuntos("example.txt"));


    }
}
