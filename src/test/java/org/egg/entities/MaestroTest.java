package org.egg.entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaestroTest {

    @Test
    public void estadoMaestroTest(){
        Maestro maestro = new Maestro();
        maestro.enviarStatus();
        assertNotNull(maestro.getEstado());
    }
}
