package co.edu.uniquindio.poo.sistemapeaje.model;

import java.util.ArrayList;
import java.util.List;

public class Peaje {
    private String nombre;
    private String departamento;
    private double totalRecaudado;
    private List<Vehiculo> vehiculosPasados = new ArrayList<>();

    public Peaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getTotalRecaudado() {
        return totalRecaudado;
    }

    public void setTotalRecaudado(double totalRecaudado) {
        this.totalRecaudado = totalRecaudado;
    }

    public List<Vehiculo> getVehiculosPasados() {
        return vehiculosPasados;
    }

    public void setVehiculosPasados(List<Vehiculo> vehiculosPasados) {
        this.vehiculosPasados = vehiculosPasados;
    }

    public double calcularYRegistrarPeaje(Vehiculo v) {
        double valor = v.calcularPeaje();
        totalRecaudado += valor;
        v.incrementarPeajes();
        vehiculosPasados.add(v);
        return valor;
    }

    public void imprimirListadoVehiculos() {
        System.out.println("--- Vehículos que pasaron por el peaje ---");
        for (Vehiculo v : vehiculosPasados) {
            System.out.println(v.getDescripcion() + " - Peaje pagado: $" + v.calcularPeaje());
        }
        System.out.println("Total recaudado: $" + totalRecaudado);
    }
    public double calcularPeaje(Vehiculo vehiculo) {
        double valor = vehiculo.calcularPeaje();
        totalRecaudado += valor;
        return valor;
    }
    public void registrarPasoVehiculo(Vehiculo vehiculo) {
        vehiculosPasados.add(vehiculo);
    }

}
