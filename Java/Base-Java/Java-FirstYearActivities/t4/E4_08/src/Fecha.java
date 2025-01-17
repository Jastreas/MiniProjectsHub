/*
Constructor con tres parámetros para crear objetos con valores iniciales
(sólo modificará los valores iniciales si la fecha es correcta)

Métodos set y get para asignar y obtener los valores de los atributos de la clase. (sólo modificará los valores si generan una fecha correcta)

Método fechaCorrecta(int dia, int mes, int anio) que comprueba si la fecha es correcta.
Devuelve un valor de tipo boolean indicando si la fecha es correcta o no. Este método a su vez utilizará un
método privado de la clase llamado esBisiesto(int anio) que calcula si el año es o no bisiesto.
El método esBisiesto devuelve true si el año es bisiesto y false si no lo es.

Método diaSiguiente() que cambia la fecha actual por la del día siguiente. El objeto de la clase Fecha al que se le aplique este método deberá quedar siempre en un estado consistente, es decir, la nueva fecha deberá ser correcta.

Modificar el método toString() heredado de Object para mostrar las fechas de la forma dd-mm-aaaa. El día y el mes se deben mostrar con dos cifras. Si el dia o el mes tienen solo una cifra se escribirá un cero delante. Por ejemplo si la fecha es dia=1, mes=6, año= 2015 la fecha que se mostrará será: 01-06-2015*/

public class Fecha {

    //---- Atributos ----
    int dia, mes, año;

    //---- Constructores ----

    public Fecha(){
        this.dia = 0;
        this.mes = 0;
        this.año = 0;
    }

    public Fecha(int dia, int mes, int año){
        if (fechaCorrecta(this.dia, this.mes, this.año)){
            this.dia = dia;
            this.mes = mes;
            this.año = año;
        } else {
            System.out.println("Introduzca valores correctos por favor.");
        }
    }

    //---- Metodos ----------------------------------------------------------------------

    // ---- SETS ----

    public void setDia(int dia) {
        if (fechaCorrecta(this.dia, this.mes, this.año)) {
            this.dia = dia;
        } else {
            System.out.println("Introduzca una fecha correcta por favor");
        }
    }

    public void setAño(int año) {
        if (fechaCorrecta(this.dia, this.mes, this.año)) {
            this.año = año;
        } else {
            System.out.println("Introduzca una fecha correcta por favor");
        }
    }

    public void setMes(int mes) {
        if (fechaCorrecta(this.dia, this.mes, this.año)) {
            this.mes = mes;
        } else {
            System.out.println("Introduzca una fecha correcta por favor");
        }
    }

    //---- gets ----

    public int getAño() {
        return año;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    //---- fecha correcta ----

    public boolean fechaCorrecta(int dia, int mes, int año){ /*mejor un switch*/
        boolean correcto;
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 9 || mes == 11) {
            if (dia >= 0 && dia <= 31) {
                return correcto = true;
            } else {
                return correcto = false;
            }
        } else if (mes == 4 || mes == 6 || mes == 8 || mes == 10 || mes == 12){
            if (dia >= 0 && dia <= 30){
                return correcto = true;
            } else {
                correcto = false;
            }
        } else if (mes == 2){


            if (esBisiesto(this.año)) {
                if (dia >= 0 && dia <= 29) {
                    return correcto = true;
                } else {
                    return correcto = false;
                }
            }

            if (dia >= 0 && dia <= 28){
                return correcto = true;
            } else {
                return correcto = false;
            }
            
        } else {
            correcto = false;
        }
    return correcto = false;
    }

    //---- metodo para comprobar si es bisiesto ----

    private static boolean esBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }


    //---- metodo dia siguiente ----

    public void diaSiguente (){   //falta hacer que pase al proximo mes, año etc pero zzz
        if (fechaCorrecta(this.dia + 1, this.mes, this.año)){
            this.dia += 1;
        }  else {
            System.out.println("Introduzca un valor correcto de la fecha");
        }
    }

    //---- tostring ----


    @Override
    public String toString() {
        String sdia = String.valueOf(this.dia), smes = String.valueOf(this.mes), saño = String.valueOf(this.año);

        if (fechaCorrecta(this.dia, this.mes, this.año)){
            if (sdia.length() < 2){
                sdia = "0" + sdia;
            }
            if (smes.length() < 2){
                smes = "0" + smes;
            }
            return sdia + "-" + smes + "-" + saño;
        } else {
            return "Introduzca una fecha correcta";
        }
    }
}
