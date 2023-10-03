package org.egg.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatoTest {

    @Test
    public void PobandoEntidad(){
        Pato pato = new Pato();
        assertInstanceOf(Pato.class, pato);
    }
}