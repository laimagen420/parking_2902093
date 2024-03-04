package org.parkin.java;

import org.parkin.java.entities.Cliente;
import org.parkin.java.entities.Cupo;
import org.parkin.java.entities.Empleado;
import org.parkin.java.entities.Pago;
import org.parkin.java.entities.TipoVehiculo;
import org.parkin.java.entities.Vehiculo;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

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
        carrito1.setPlaca("ASD 789"); 
        carrito1.setTipoVehiculo(TipoVehiculo.PARTICULAR);

        Vehiculo carrito2 = new Vehiculo("JHG 432",
                            TipoVehiculo.TAXI);
        carrito2.setPlaca("JHG 432") ;
        carrito2.setTipoVehiculo(TipoVehiculo.TAXI);
        Vehiculo motico =new Vehiculo();
        motico.setPlaca("XS 453");
        
        System.out.println(carrito1.getPlaca("JHG 432"));
        System.out.println(carrito2.getPlaca("ASD 789"));
    
        Cliente cliente1 = new Cliente("oscar" , 
        "peñuela" , 
        1014477735L); 
         Cliente cliente2 = new Cliente("dairon" , 
         "moreno" , 
        1014477735L);

        cliente1.nombres= "oscar";
        cliente1.apellidos= "peñuela";
        cliente1.numeroIdentificacion= 1014477135L;
        //invocar el metodo addcar 
        cliente1.addVehicle(carrito1);
        cliente1.addVehicle(carrito2);
        cliente1.addVehicle( "WWW ERT", TipoVehiculo.MOTO);
        

        cliente2.nombres= "dairon";
        cliente2.apellidos= "moreno";
        cliente2.numeroIdentificacion= 1014477135L;
        //invocar el metodo addcar 
        cliente2.addVehicle(carrito1);
        cliente2.addVehicle(carrito2);
        cliente2.addVehicle( "WWW TER", TipoVehiculo.PARTICULAR);
        //instanciar cupos
        Cupo cupito1 = new Cupo('a');
        Cupo cupito2 = new Cupo('B');

        //hacer registro de pago
        Empleado empleado1 = new Empleado("Oscar", "Casallas", "1012");
        Pago pago1 =new Pago(LocalDateTime.of(2024,
                                              Month.FEBRUARY,
                                             1,
                                             15,
                                             33,
                                              0), 
                            LocalDateTime.of(2024,
                                            Month.FEBRUARY,
                                             10,
                                             6,
                                             15,
                                             5),
                             5000.0, 
                             cliente1.misVehiculos.get(0), 
                             cupito1, empleado1);

        Pago pago2 = new Pago(LocalDateTime.of(2024,
                                Month.FEBRUARY,
                                 1,
                                 15,
                                 33,
                                 0), 
                            LocalDateTime.of(2024,
                                Month.FEBRUARY,
                                10,
                                6,
                                15,
                                5),
                        5000.0, 
                        cliente2.misVehiculos.get(1), 
                        cupito2, empleado1);

        List<Pago> misPagos = new ArrayList<Pago>();
        misPagos.add(pago1);
        misPagos.add(pago2);
        

        //recorrer los pagos para mostar informacion
        for(Pago p: misPagos){
            //evidencia:
            //mostrar:
            // -- placa del vehiculo
            // --valor pagado
            //--fecha y hora de inicio
            // -- fecha y hora de fin
            // -- cupo
            System.out.println("Pago:|Placa:" + p.getVehiculo().getPlaca() + 
            "|valor:" + p.getValor() + "|"+
            "fecha y hora entrada:" + p.getFechaInicio().toString() +
            "fecha y hora salida:" + p.getFechaHoraFin().toString()+
            "|cupo:" + p.getValor().getNombre() + "|"+
            "empleado:" + p.getCupo().getNombre());
        }
        

    } 

}