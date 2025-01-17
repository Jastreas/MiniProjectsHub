package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Producto {
    protected String nombre;
    protected int cantidad;
    protected double precio;
    protected Scanner sc = new Scanner(System.in);

    //constructor

    public Producto(){
        nombre = "Producto" + Main.x;
        cantidad = (int) (Math.random()*10)+1;
        precio = (Math.random()*100)+1;
        Main.x += 1;
    }

    //metodos

    //generar lista
    public ArrayList<Producto> generarLista(){
        ArrayList<Producto> lista = new ArrayList<Producto>();
        int cantProds = (int) (Math.random()*8)+1;
        for (int i=0; i<cantProds; i++){
            System.out.println("Generando Productos...");
            Producto p = new Producto();
            lista.add(p);
        }
        return lista;
    }

    //no se muy bien como hacer esto...
    public void mostrarTicket(ArrayList<Producto> lista){
        for (int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }

        System.out.println("***********Cantidad****Precio*****Total" + "\n");
    }

}
