package co.edu.uniquindio.poo.sistemapeaje.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Conductor extends Persona {
    private List<Vehiculo> vehiculos = new ArrayList<>();

    public Conductor(String nombre, String apellidos, String documento, LocalDate fechaNacimiento) {
        super(nombre, apellidos, documento, fechaNacimiento);
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void asignarVehiculo(Vehiculo v) {
        vehiculos.add(v);
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public double calcularTotalPeajes() {
        return vehiculos.stream().mapToDouble(Vehiculo::calcularPeaje).sum();
    }

    public List<Vehiculo> getVehiculosPorTipo(String tipo) {
        return vehiculos.stream()
                .filter(v -> v.getClass().getSimpleName().equalsIgnoreCase(tipo))
                .toList();
    }

    public boolean tieneCamionAltoTonelaje() {
        return vehiculos.stream().anyMatch(v -> v instanceof Camion && ((Camion) v).getCapacidadCarga() > 10);
    }
}
