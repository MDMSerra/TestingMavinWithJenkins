package org.egg.entities;

import java.util.ArrayList;
import java.util.Random;

public class Maestro extends Persona {
    private String materia, estado;
    private int matricula;
    private ArrayList<String> status = new ArrayList<>();

    public Maestro(String nombre, String apellido, int dni, String domicilio, String materia,
                   String estado, int matricula, ArrayList<String> status) {
        super(nombre, apellido, dni, domicilio);
        this.materia = materia;
        this.estado = estado;
        this.matricula = matricula;
        this.status = status;
    }

    public Maestro() {

    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public ArrayList<String> getStatus() {
        return status;
    }

    public void setStatus(ArrayList<String> status) {
        this.status = status;
    }

    public void enviarStatus(){
        Random random = new Random();
        status.add("Jubilado");
        status.add("fijo");
        status.add("Reemplazante");

      setEstado(status.get(random.nextInt(3)));

        System.out.println(getEstado());

    }



 }
