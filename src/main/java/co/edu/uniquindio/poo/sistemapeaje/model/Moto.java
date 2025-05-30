package co.edu.uniquindio.poo.sistemapeaje.model;

public class Moto extends Vehiculo {
    private int cilindraje;

    public Moto(String placa, int cilindraje) {
        super(placa);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public double calcularPeaje() {
        double valor = 5000;
        if (cilindraje > 200) valor += 2000;
        return valor;
    }

    @Override
    public String getDescripcion() {
        return "Moto - Placa: " + placa + ", Cilindraje: " + cilindraje + "cc";
    }

    @Override
    public TipoVehiculo getTipo() {
        return TipoVehiculo.MOTO;
    }

}
