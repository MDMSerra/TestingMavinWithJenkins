package org.egg.entities;

import org.egg.enums.Condicion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstudianteTest {


    @Test
    public void EstudianteEntityTest(){
        Estudiante estudiante = new Estudiante();
        assertTrue(estudiante instanceof Persona);
    }
    @Test
    public void PesonaGetCondicionTest(){
        Condicion condicionEsperada = Condicion.EGRESADO;
        Estudiante estudiante = new Estudiante();
        estudiante.setCondicion(condicionEsperada);
        assertEquals(estudiante.getCondicion(),condicionEsperada);
    }

}