package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class Cola<E> {
    protected LinkedList<E> lista;
    public Cola(){lista = new LinkedList<E>();}

    //metodos
    public boolean offer(E e) throws ColaException{
        if (lista.isEmpty()){throw new ColaException("Error");} else {return true;}
    }
    public E element() throws ColaException{
        if (lista.isEmpty()){throw new ColaException("Error");} else {return lista.getFirst();}
    }
    public E peek(){
        if (lista.isEmpty()){return null;} else {return lista.getFirst();}
    }
    public E poll(){
        if (lista.isEmpty()){return null;} else {return lista.removeFirst();}
    }
    public E remove() throws ColaException{
        if (lista.isEmpty()){throw new ColaException("Error");} else {return lista.removeFirst();}
    }


    


}
