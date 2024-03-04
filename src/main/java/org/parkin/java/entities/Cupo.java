package org.parkin.java.entities;

public class Cupo {
    private char nombre;

    


//constructor por defecto
private Cupo() {
    }



// constructor parametrizado
private Cupo(char nombre) {
    this.nombre = nombre;
}
//getters y setters



public char getNombre() {
    return nombre;
}



public void setNombre(char nombre) {
    this.nombre = nombre;
}





}