package org.parkin.java.entities;
import java.util.List;
import java.util.ArrayList;
public class Cliente {
    private String nombres;
    public String apellidos;
    public long numeroIdentificacion;
    public List<Vehiculo> misVehiculos  = new ArrayList<Vehiculo>();
    //definir un metodo de clase
    //addCar vincular un carrito al cliente
    private void  addVehicle (Vehiculo vehiculo){
        //añadir el carrito a la lista
        //this:para acceder a la lista del objeto y metodos al interior de metodos
        //NOTA:usarla al interior de metodos
        this.misVehiculos.add(vehiculo);


        
    }
    private Cliente(String nombres, 
        String apellidos, 
        long numeroIdentificacion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroIdentificacion = numeroIdentificacion;
    }
    // otra sobre carga de el metodo addvehiculo
    private void addVehicle(String placa,
                            TipoVehiculo tv){
                Vehiculo v = new Vehiculo();
                v.setPlaca(placa); 
                v.setTipoVehiculo(tv); 
                this.misVehiculos.add(v);
                     
    }
    //getters y setters
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public long getNumeroIdentificacion() {
        return numeroIdentificacion;
    }
    public void setNumeroIdentificacion(long numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }
    public List<Vehiculo> getMisVehiculos() {
        return misVehiculos;
    }
    public void setMisVehiculos(List<Vehiculo> misVehiculos) {
        this.misVehiculos = misVehiculos;
    }

    


}
