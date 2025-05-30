package co.edu.uniquindio.poo.sistemapeaje.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Persona {
    protected String nombre;
    protected String apellidos;
    protected String documento;
    protected LocalDate fechaNacimiento;
    private List<Vehiculo> vehiculos = new ArrayList<>();

    public Persona(String nombre, String apellidos, String documento, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.documento = documento;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    public void asignarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }
    public String getNombreCompleto() {
        return (nombre + " " + apellidos).trim().toLowerCase();
    }
}
