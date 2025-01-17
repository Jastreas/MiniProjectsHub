package org.example;
public class Nodo <E>{
    E dato;
    private Nodo<E> siguiente;

    //constructor
    public Nodo(E dat, Nodo<E>sig){
        dato = dat;
        siguiente = sig;
    }

    //metodos
    public void setDato(E dato) {this.dato = dato;}
    public void setSiguiente(Nodo<E> siguiente) {this.siguiente = siguiente;}
    public E getDato() {return dato;}
    public Nodo<E> getSiguiente() {return siguiente;}

    @Override
    public String toString() {return dato.toString() + siguiente;}
}
