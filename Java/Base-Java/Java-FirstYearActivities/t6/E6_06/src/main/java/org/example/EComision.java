package org.example;

public class EComision extends Empleado{
    private static final double minSalario = 750;
    private int nClientes;
    private double montoCliente;

    public EComision(){}

    public EComision(int Dni, int añoIng, String nombre, String apellido, int clientes, double monto){
        super(Dni, añoIng, nombre, apellido);
        this.nClientes = clientes;
        this.montoCliente = monto;
    }

    public int getnClientes(){
        return nClientes;
    }
    public double getMontoCliente(){
        return montoCliente;
    }

    public void setnClientes(int n){
        this.nClientes = n;
    }
    public void setMontoCliente(double montoCliente) {
        this.montoCliente = montoCliente;
    }

    @Override
    public double obtenerSalario() {
        double totalmonto = nClientes*montoCliente;
        if (totalmonto > minSalario){
            return totalmonto;
        } else {
            return minSalario;
        }
    }

    @Override
    public void imprimir() {
        System.out.println(name+" "+surN+", DNI: "+nDni+
                ", desde "+ añoIngreso +", "+nClientes+"clientes captados a "+montoCliente+
                "€ cada uno, Salario total: "+obtenerSalario()+"€");}
}
