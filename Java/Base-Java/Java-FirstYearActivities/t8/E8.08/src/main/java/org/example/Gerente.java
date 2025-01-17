package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Gerente {
    ArrayList<Cliente> lista;

    public Gerente(){
        lista = new ArrayList<Cliente>();
    }

    public Gerente(ArrayList<Cliente> list){
        lista = list;
    }

    //metodo para añadir

    public void add(Cliente c){
       lista.add(c);
    }

    public boolean borrar(String Dni){
        Iterator<Cliente> it = lista.iterator();

        while(it.hasNext()) {
            if (it.next().getDni().equals(Dni)) {
                it.remove();
                return true;
            }}return false;
    }

    //metodo mostrar cliente
    public void mostrarClienteTodos(){
        Iterator<Cliente> aux = lista.iterator();
        while(aux.hasNext()){
            System.out.println(aux.next());
        }
    }


    //mostrar por dni
    public void mostrarClienteDni(String dni){
        Iterator<Cliente> aux = lista.iterator();
        while(aux.hasNext()){

            Cliente c = aux.next();
            if(c.getDni().equals(equals(dni))){
                System.out.println(c);
            }}
    }
}
