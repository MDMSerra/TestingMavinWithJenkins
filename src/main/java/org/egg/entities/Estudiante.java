package org.egg.entities;

import org.egg.enums.Condicion;

public class Estudiante extends Persona{


    private Condicion condicion;
    private int legajo;
    private String carrera;


    public Estudiante () {};
    public Estudiante(String nombre, String apellido, int dni,String direccion,  Condicion condicion, int legajo, String carrera) {
        super(nombre, apellido, dni, direccion);
        this.condicion = condicion;
        this.legajo = legajo;
        this.carrera = carrera;
    }

    public Condicion getCondicion() {
        return condicion;
    }

    public void setCondicion(Condicion condicion) {
        this.condicion = condicion;
    }

}
