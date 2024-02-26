package org.parkin.java.entities;

public class Empleado {
    //atributos intrinsecos
    public String nombre;
    public String apellido;
    //atributos de relacion
    public String codigo;
    
// constructores
    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String codigo) {
        this.nombre = nombre ;
        this.apellido = apellido;
        this.codigo = codigo;
    }
    

}
