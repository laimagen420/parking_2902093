package org.parkin.java.entities;
import java.util.List;
import java.util.ArrayList;
public class Cliente {
    public String nombres;
    public String apellidos;
    public long numeroIdentificacion;
    public List<Vehiculo> misVehiculos  = new ArrayList<Vehiculo>();
    //definir un metodo de clase
    //addCar vincular un carrito al cliente
    public void  addVehicle (Vehiculo vehiculo){
        //añadir el carrito a la lista
        //this:para acceder a la lista del objeto y metodos al interior de metodos
        //NOTA:usarla al interior de metodos
        this.misVehiculos.add(vehiculo);


        
    }
    public Cliente(String nombres, 
        String apellidos, 
        long numeroIdentificacion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroIdentificacion = numeroIdentificacion;
    }
    // otra sobre carga de el metodo addvehiculo
    public void addVehicle(String placa,
                            TipoVehiculo tv){
                Vehiculo v = new Vehiculo();
                v.placa = placa;
                v.tipoVehiculo = tv;
                this.misVehiculos.add(v);
                     
    }
}
