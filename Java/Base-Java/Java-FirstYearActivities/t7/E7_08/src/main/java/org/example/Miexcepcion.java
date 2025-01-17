package org.example;

public class Miexcepcion extends Exception{
    String ref;

    public Miexcepcion(String ref){
        super(ref);
        this.ref = ref;
    }

    public void mostrar(){
        System.out.println(ref);
    }
}
