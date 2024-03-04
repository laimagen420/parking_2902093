package org.parkin.java.entities;

public class Empleado {
    //atributos intrinsecos
    private String nombre;
    private String apellido;
    //atributos de relacion
    private String codigo;
    
// constructores
    private Empleado() {
    }

    private Empleado(String nombre, String apellido, String codigo) {
        this.nombre = nombre ;
        this.apellido = apellido;
        this.codigo = codigo;
    }
    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    


}
