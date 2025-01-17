package org.example;

public class Dni{
    protected int n;
    protected char letra;

    public Dni(){
        this.letra = calcLetra();
    }

    public Dni(int ndni) throws ExcepcionDni{
        if (ndni<0 && ndni >= 99999999){
            throw new ExcepcionDni("EL NUMERO DE DNI INTRODUCIDO ES INCORRECTO");
        }

        this.n = n;
        this.letra = calcLetra();
    }

    private char calcLetra(){
        String posicion = "TRWAGMYFPDXBNJZSQVHLCKE";
        return posicion.charAt(this.n%23);
    }


    //setters y getters
    public void setN(int nd) throws ExcepcionDni {
        if (nd<0 && nd >= 99999999){
            throw new ExcepcionDni("EL NUMERO DE DNI INTRODUCIDO ES INCORRECTO");
        }
        this.n = n;
        this.letra = calcLetra();
    }
    public int getN() {
        return n;
    }
    public void setLetra(char letra) {
        this.letra = letra;
    }
    public char getLetra() {
        return letra;
    }
    //fin get set

    //toString


    @Override
    public String toString() {
        String nif = n+"-"+letra;

        while (nif.length()<10){
            nif = "0"+nif;
        }

        return nif;

    }
}
