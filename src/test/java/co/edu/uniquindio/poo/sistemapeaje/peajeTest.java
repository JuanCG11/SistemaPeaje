package co.edu.uniquindio.poo.sistemapeaje;

import co.edu.uniquindio.poo.sistemapeaje.model.Carro;
import co.edu.uniquindio.poo.sistemapeaje.model.Peaje;
import co.edu.uniquindio.poo.sistemapeaje.model.Vehiculo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PeajeTest {

    @Test
    public void testRegistrarVehiculo() {
        Peaje peaje = new Peaje("Peaje Norte","Quindio");

        Vehiculo carro = new Carro("ABC123", false, true);
        peaje.registrarPasoVehiculo(carro);

        assertTrue(peaje.getVehiculosPasados().contains(carro));
        assertEquals(1, peaje.getVehiculosPasados().size());
    }

    @Test
    public void testNombrePeaje() {
        Peaje peaje = new Peaje("Peaje Central","Quindio");

        assertEquals("Peaje Central", peaje.getNombre());
        assertEquals("Quindio", peaje.getDepartamento());
    }
}
