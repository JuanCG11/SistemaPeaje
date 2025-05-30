package co.edu.uniquindio.poo.sistemapeaje.model;

public abstract class Vehiculo {
    protected String placa;
    protected int peajesPagados;

    public Vehiculo(String placa) {
        this.placa = placa;
        this.peajesPagados = 0;
    }

    public abstract double calcularPeaje();
    public abstract String getDescripcion();
    public abstract TipoVehiculo getTipo();

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPeajesPagados() {
        return peajesPagados;
    }

    public void setPeajesPagados(int peajesPagados) {
        this.peajesPagados = peajesPagados;
    }
    public void incrementarPeajes() {
        this.peajesPagados++;
    }

}
