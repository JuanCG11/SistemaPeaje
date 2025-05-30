package co.edu.uniquindio.poo.sistemapeaje.model;

import java.time.LocalDate;

public class Recaudador extends Persona {
    private double sueldo;
    public Recaudador(String nombre, String apellidos, String documento, LocalDate fechaNacimiento, double sueldo) {
        super(nombre, apellidos, documento, fechaNacimiento);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombreCompleto() {
        return (nombre + " " + apellidos).trim().toLowerCase().replaceAll("\\s+", " ");
    }
}
