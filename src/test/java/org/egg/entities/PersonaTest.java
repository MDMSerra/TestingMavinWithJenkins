package org.egg.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {
    @Test
    public void testInstancia(){
        Persona persona = new Persona();
        assertInstanceOf(Persona.class, persona);
    }



}