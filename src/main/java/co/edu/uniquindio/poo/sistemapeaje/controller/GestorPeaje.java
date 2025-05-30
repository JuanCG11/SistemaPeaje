package co.edu.uniquindio.poo.sistemapeaje.controller;

import co.edu.uniquindio.poo.sistemapeaje.model.Camion;
import co.edu.uniquindio.poo.sistemapeaje.model.Peaje;
import co.edu.uniquindio.poo.sistemapeaje.model.Persona;
import co.edu.uniquindio.poo.sistemapeaje.model.Recaudador;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GestorPeaje {

    private final List<Peaje> estaciones = new ArrayList<>();
    private final List<Persona> personas = new ArrayList<>();
    private final List<Recaudador> recaudadores = new ArrayList<>();

    public void registrarEstacion(Peaje peaje) {
        estaciones.add(peaje);
    }

    public void registrarPersona(Persona persona) {
        personas.add(persona);
    }

    public void registrarRecaudador(Recaudador recaudador) {
        recaudadores.add(recaudador);
    }

    public Optional<Recaudador> buscarRecaudadorPorNombre(String nombreCompleto) {
        String limpio = nombreCompleto.trim().replaceAll("\\s+", " ").toLowerCase();
        return recaudadores.stream()
                .filter(r -> (r.getNombre() + " " + r.getApellidos()).toLowerCase().equals(limpio))
                .findFirst();
    }

    public List<Persona> obtenerConductoresConCamionesPesados() {
        return personas.stream()
                .filter(p -> p.getVehiculos().stream().anyMatch(v -> v instanceof Camion c && c.getCapacidadCarga() > 10))
                .collect(Collectors.toList());
    }

    public Map<String, Double> calcularTotalRecaudadoPorEstacion() {
        return estaciones.stream().collect(Collectors.toMap(
                Peaje::getNombre,
                Peaje::getTotalRecaudado
        ));
    }

    public Map<String, Long> contarVehiculosPorTipo() {
        return personas.stream()
                .flatMap(p -> p.getVehiculos().stream())
                .collect(Collectors.groupingBy(v -> v.getClass().getSimpleName(), Collectors.counting()));
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public List<Peaje> getEstaciones() {
        return estaciones;
    }
}

