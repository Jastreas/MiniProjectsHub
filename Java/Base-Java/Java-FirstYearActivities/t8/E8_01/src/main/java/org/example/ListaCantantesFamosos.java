package org.example;

import java.util.ArrayList;

public class ListaCantantesFamosos {
    private ArrayList<String> listanombres = new ArrayList<String>();


    public ListaCantantesFamosos(){
        listanombres.add("TuMami");
        listanombres.add("TuPapi");
        listanombres.add("Yo");
    }

    public void añadir(String n1){
        try {
            listanombres.add(n1);
        } catch (Exception e){
            System.out.println("El valor introducido es incorrecto, no se ha añadido el cantante.");
        }
    }

    @Override
    public String toString() {
        String texto = "" ;
        for (int i=0; i<listanombres.size(); i++){
            texto +=listanombres.get(i)+"\n";
        }

        return texto;
    }
}
