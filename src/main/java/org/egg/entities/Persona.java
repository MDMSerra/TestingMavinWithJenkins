package org.egg.entities;

public class Persona {

    private String nombre;
    private String apellido;
    private int dni;
    private String Domicilio;

    public Persona(String nombre, String apellido, int dni, String domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        Domicilio = domicilio;
    }

    public Persona() {
    }

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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", Domicilio='" + Domicilio + '\'' +
                '}';
    }
}
