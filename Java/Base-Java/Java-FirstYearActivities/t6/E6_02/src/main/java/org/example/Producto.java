package org.example;

public class Producto {
    String fecha_Caducidad, fecha_Envasado, pais_Origen;
    int nLote;

    //Constructor

    public Producto(){
        this.fecha_Caducidad = "null/null/null";
        this.fecha_Envasado = "null/null/null";
        this.pais_Origen = "null";
        this.nLote = 0;
    }

    //sets y gets


    public void setFecha_Caducidad(String fecha_Caducidad) {
        this.fecha_Caducidad = fecha_Caducidad;
    }

    public void setFecha_Envasado(String fecha_Envasado) {
        this.fecha_Envasado = fecha_Envasado;
    }

    public void setnLote(int nLote) {
        this.nLote = nLote;
    }

    public void setPais_Origen(String pais_Origen) {
        this.pais_Origen = pais_Origen;
    }

    //--------


    public int getnLote() {
        return nLote;
    }

    public String getFecha_Caducidad() {
        return fecha_Caducidad;
    }

    public String getFecha_Envasado() {
        return fecha_Envasado;
    }

    public String getPais_Origen() {
        return pais_Origen;
    }
}
