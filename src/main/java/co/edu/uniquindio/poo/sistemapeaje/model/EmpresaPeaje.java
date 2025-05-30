package co.edu.uniquindio.poo.sistemapeaje.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmpresaPeaje {
    private List<Recaudador> recaudadores = new ArrayList<>();
    private List<Conductor> conductores = new ArrayList<>();

    public List<Conductor> getConductores() {
        return conductores;
    }

    public void setConductores(List<Conductor> conductores) {
        this.conductores = conductores;
    }

    public List<Recaudador> getRecaudadores() {
        return recaudadores;
    }

    public void setRecaudadores(List<Recaudador> recaudadores) {
        this.recaudadores = recaudadores;
    }

    public void agregarRecaudador(Recaudador r) {
        recaudadores.add(r);
    }

    public void agregarConductor(Conductor c) {
        conductores.add(c);
    }

    public Recaudador buscarRecaudador(String nombreCompleto) {
        String normalizado = nombreCompleto.trim().toLowerCase().replaceAll("\\s+", " ");
        return recaudadores.stream()
                .filter(r -> r.getNombreCompleto().equals(normalizado))
                .findFirst()
                .orElse(null);
    }

    public List<Conductor> obtenerConductoresConCamionesDeAltoTonelaje() {
        return conductores.stream().filter(Conductor::tieneCamionAltoTonelaje).collect(Collectors.toList());
    }
}
