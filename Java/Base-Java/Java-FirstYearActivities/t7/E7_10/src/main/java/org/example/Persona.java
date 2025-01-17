package org.example;

public class Persona {
    protected Dni dni;
    protected String nombre, apellidos;
    protected Telefono []tel;
    protected int edad;
    

    public Persona(){}

    public Persona(int num, String nomb, String apell, Telefono[]tel, int ed){
        try{
        this.dni = new Dni(num);}
        catch(ExcepcionDni e){
            System.out.println(e.getMessage());
        }
        this.nombre = nomb;
        this.apellidos = apell;
        this.edad = ed;
    }

    @Override
    public String toString() {
        String telefonos = "";
        for(int i=0; i< tel.length; i++){
            telefonos = telefonos.toString() + "Telefono ["+ i + "]: " + tel[i]+"\n";
        }
        return "Dni: " + dni + "\nNombre: "+ nombre + "\nApellido: "+ apellidos + "\nEdad: " + edad+telefonos.toString();

    }
}
