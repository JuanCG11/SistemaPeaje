package co.edu.uniquindio.poo.sistemapeaje.model;

public class Camion extends Vehiculo {
    private int numeroEjes;
    private double capacidadCarga;

    public Camion(String placa, int numeroEjes, double capacidadCarga) {
        super(placa);
        this.numeroEjes = numeroEjes;
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double calcularPeaje() {
        double valor = 7000 * numeroEjes;
        if (capacidadCarga > 10) valor *= 1.10;
        return valor;
    }

    @Override
    public String getDescripcion() {
        return "Camion - Placa: " + placa + ", Ejes: " + numeroEjes + ", Carga: " + capacidadCarga + " toneladas";
    }

    @Override
    public TipoVehiculo getTipo() {
        return TipoVehiculo.CAMION;
    }


    public double getCapacidadCarga() {
        return capacidadCarga;
    }
}
