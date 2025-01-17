package org.example;

public class Main {
    public static void main(String[] args) {

        EAsalariado ea1 = new EAsalariado(569587, 2008,"Javier","Gómez", 1225);
        EComision ec1 = new EComision(695235, 2010, "Eva","Nieto",179,8.1);
        EAsalariado ea2 = new EAsalariado();
        EComision ec2 = new EComision();
        ec2.setName("José");
        ec2.setSurN("Ruiz");
        ec2.setnDni(741258);
        ec2.setAñoIngreso(2012);
        ec2.setnClientes(81);
        ec2.setMontoCliente(7.9);

        ea2.setName("María");
        ea2.setSurN("Núñez");
        ea2.setnDni(896325);
        ea2.setAñoIngreso(1889);
        ea2.setSueldoBase(1155);

        Empleado[] empleados = {ea1,ec1,ec2,ea2};


        for (int i = 0; i<empleados.length; i++){
            System.out.println(empleados[i]);
        }

        //faltan sueldoMayor y mostrarTodos
    }
}