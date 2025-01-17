/*
- La clase debe guardar el título del libro, autor, número de ejemplares del libro y 
- número de ejemplares prestados. La clase contendrá los siguientes métodos:
- Constructor por defecto.
- Constructor con parámetros.
- Métodos set/get
 */
public class Libro {
    private String nombre, autor;
    private int nED, nEP;
    
    public Libro() {
        this.nombre = null;
        this.autor = null;
        this.nED = 1;
        this.nEP = 1;
    }

    public Libro(String name, String auth, int ned, int nep){
        this.nombre = name;
        this.autor = auth;
        this.nED = ned;
        this.nEP = nep;
    }

    //---------sets--------- 

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setTitulo(String nombre) {
        this.nombre = nombre;
    }
    public void setEjemplares(int nED) {
        this.nED = nED;
    }
    public void setPrestados(int nEP) {
        this.nEP = nEP;
    }
//-----------fin sets-----------
//-------------gets--------------------
public String getAutor() {
    return autor;
}
public int getEjemplares() {
    return nED;
}
public String getTitulo() {
    return nombre;
}
public int getPrestados() {
    return nEP;
}
    
//----fin gets------------

/*Metodo préstamo que incremente el atributo correspondiente cada vez que se realice un préstamo 
del libro. No se podrán prestar libros de los que no queden ejemplares disponibles para prestar. 
Devuelve true si se ha podido realizar la operación y false en caso contrario.*/

public boolean prestamo(){
    if (nED<nEP){
    this.nEP=this.nEP-1;
    return true;
    } else {
        return false;
    }
}



/*Método devolución que decremente el atributo correspondiente cuando se produzca la devolución de un 
libro. No se podrán devolver libros que no se hayan prestado. Devuelve true si se ha podido realizar 
la operación y false en caso contrario. */

public boolean devolucion(){
    if (this.nED != 0 && this.nED>this.nEP){
        this.nED=this.nED-1;
        return true;
    } else {
        return false;
    }

    }

    //Método mostrarLibro para mostrar los datos de los libros por pantalla.
    public void mostrarLibro (){
        System.out.println("Del libro: " + this.nombre + " cuyo autor es: " + this.autor + " quedan: " + this.nED + " disponibles, y se han prestado: " + this.nEP );
    }
}

