package org.parkin.java;

import org.parkin.java.entities.Cliente;
import org.parkin.java.entities.TipoVehiculo;
import org.parkin.java.entities.Vehiculo;

public class Main {
    public static void main(String[] args) {
        System.out.println("hola, muchachos");
        //Sistema de gestion de E/S
        //De vehiculo en un parking
        //1. dos carritos:
        //Objeto (instancias)
        //1. Tipo de clase
        //2. Nombre del objeto
        //3. Asignacion y new
        //4. Constructor del objeto
        Vehiculo carrito1 = new Vehiculo("ASD 789",
                            TipoVehiculo.PARTICULAR);
        carrito1.placa = "ASD 789";
        carrito1.tipoVehiculo = TipoVehiculo.PARTICULAR;

        Vehiculo carrito2 = new Vehiculo("JHG 432",
                            TipoVehiculo.TAXI);
        carrito2.placa = "JHG 432";
        carrito2.tipoVehiculo = TipoVehiculo.TAXI;
        
        System.out.println(carrito1.tipoVehiculo);
    
        Cliente cliente1 = new Cliente("oscar" , 
        "peñuela" , 
    1014477735L); 

        cliente1.nombres= "oscar";
        cliente1.apellidos= "peñuela";
        cliente1.numeroIdentificacion= 1014477135L;
        //invocar el metodo addcar 
        cliente1.addVehicle(carrito1);
        cliente1.addVehicle(carrito2);
        cliente1.addVehicle( "WWW ERT", TipoVehiculo.MOTO);
        //recorrer la lista de vehiculos del cliente
        //del cliente
        for(Vehiculo v :cliente1.misVehiculos){
            System.out.println(v.placa);
            System.out.println(v.tipoVehiculo);
            System.out.println("--------");
        }
    } 

}