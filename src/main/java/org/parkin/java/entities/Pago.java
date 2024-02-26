package org.parkin.java.entities;
import java.time.LocalDateTime;

public class Pago {
    //atributos intrinsecos
    public LocalDateTime fechaInicio;
    public LocalDateTime fechaHoraFin;
    public double valor;
    //atributos de relacion
    public Vehiculo vehiculo;
    public Cupo cupo;
    
    
    
    // constructor por defecto
    public Pago() {

    }

    // constructor parametrizado

    public Pago(LocalDateTime fechaInicio, 
                LocalDateTime fechaHoraFin,
                double valor, 
                Vehiculo vehiculo, 
                Cupo cupo) {
        this.fechaInicio = fechaInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.valor = valor;
        this.vehiculo = vehiculo;
        this.cupo = cupo;
    }
    

}
