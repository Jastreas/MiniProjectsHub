public class Cuenta {
    String nombre_cliente, numero_cuenta;
    double tipo_interes, saldo;


    //---- Constructores ----
    public Cuenta (){
        this.nombre_cliente = "";
        this.numero_cuenta = "";
        this.saldo = 0;
        this.tipo_interes = 0;
    }

    public Cuenta(String nombre_cliente, String numero_cuenta, double saldo, double tipo_interes){
        this.tipo_interes = tipo_interes;
        this.numero_cuenta = numero_cuenta;
        this.saldo = saldo;
        this.nombre_cliente = nombre_cliente;

    }
    //---- Metodo Copia ----
    public Cuenta(Cuenta otraCuenta){
        this.nombre_cliente = otraCuenta.nombre_cliente;
        this.saldo = otraCuenta.saldo;
        this.numero_cuenta = otraCuenta.numero_cuenta;
        this.tipo_interes = otraCuenta.tipo_interes;

    }
    //---- Setters ----
    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public void setNumero_cuenta(String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTipo_interes(double tipo_interes) {
        this.tipo_interes = tipo_interes;
    }

    //---- Getters ----


    public double getSaldo() {
        return this.saldo;
    }

    public double getTipo_interes() {
        return this.tipo_interes;
    }

    public String getNombre_cliente() {
        return this.nombre_cliente;
    }

    public String getNumero_cuenta() {
        return this.numero_cuenta;
    }

    //---- Metodos De Ingreso ----

    public boolean ingreso (double cantidad){
        boolean se_puede = false;
        if (cantidad >= 0){
        this.saldo = this.saldo + cantidad;
        return se_puede = true;
        } else {
            System.out.println("Por favor introduzca una cantidad superior a 0");
            return se_puede = false;
        }
    }

    //---- Metodos De Reintegro ----

    public boolean reintegro (double cantidad){
        boolean se_puede = false;
        if (this.saldo <= cantidad){
            this.saldo = this.saldo - cantidad;
            return se_puede = true;
        } else {
            System.out.println("Por favor introduzca una cantidad igual o menor a su saldo");
            return se_puede = false;
        }
    }

    // Método transferencia
    public void transferencia(Cuenta otraCuenta, double importe) {
        if (this.saldo >= importe) {
            this.saldo -= importe;
            otraCuenta.saldo += importe;
        } else {
            System.out.println("No se puede realizar la transferencia. No hay suficiente dinero en la cuenta de origen.");
        }
    }
}
