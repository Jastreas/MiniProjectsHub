package org.example;

public class Telefono {

    private String prefijo= "+34", numero= "000 000 000";

    public Telefono(){}

    public Telefono(String pref) throws ExcepcionTel{
        setPrefijo(pref);
    }

    public Telefono(String pref,String num) throws ExcepcionTel{
        setPrefijo(pref);
        setNumero(num);
    }


    //set numero
    public void setNumero(String num) throws ExcepcionTel {
        if (compNum(num)==true){
            String aux = numero.replaceAll(" ","");
            String aux1 = aux.substring(0,2);
            String aux2 = aux.substring(3,6);
            String aux3 = aux.substring(6);
            this.numero = aux1 + " " + aux2 + " " + aux3;
        } else {
            throw new ExcepcionTel("Ha introducido algun valor incorrecto en el numero");
        }
    }

    //set prefijo

    public void setPrefijo(String pref) throws ExcepcionTel {
        if (compPref(pref) == true) {
            this.prefijo = pref;
        } else {
            throw new ExcepcionTel("Ha introducido algun valor incorrecto en el prefijo");
        }
    }

    //getters

    public String getNumero() {
        return numero;
    }

    public String getPrefijo() {
        return prefijo;
    }

    //comprobar numero

    private boolean compNum(String numero) throws ExcepcionTel{
        String num = numero.replaceAll(" ","");
        try {
            if (num.length() != 9 ){
             return false;
            } else {
                int n = Integer.parseInt(num);
                return true;
            }
        } catch (Exception e) {
            return false;
        }
    }

    //comprobar prefijo

    private boolean compPref(String pref) throws ExcepcionTel{

       try {
           if (pref.length() == 3) {
               if (pref.charAt(0) == '+') {     //si es +XX
                  Integer.parseInt(pref.substring(1));   //pilla caracteres desde la pos introducida hasta el final
                  return true;
               } else {return false;}
           } else if (pref.length() == 4) {  //si es 00
               if (pref.charAt(0) == '0' && pref.charAt(1) == '0') {
                   Integer.parseInt(pref);
                   return true;} else {return false;}
           } else { //si no cumple ninguna de las 2
                   return false;}

       } catch (Exception e){ //si alguna cosa falla el numero introducido es incorrecto
           return false;
       }

    }


    @Override
    public String toString() {
        return this.prefijo + "-" + this.numero;
    }
}
