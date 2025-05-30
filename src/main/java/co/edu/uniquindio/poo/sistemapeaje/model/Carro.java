package co.edu.uniquindio.poo.sistemapeaje.model;

public class Carro extends Vehiculo {
    private boolean esElectrico;
    private boolean esServicioPublico;

    public Carro(String placa, boolean esElectrico, boolean esServicioPublico) {
        super(placa);
        this.esElectrico = esElectrico;
        this.esServicioPublico = esServicioPublico;
    }

    public boolean isEsServicioPublico() {
        return esServicioPublico;
    }

    public void setEsServicioPublico(boolean esServicioPublico) {
        this.esServicioPublico = esServicioPublico;
    }

    public boolean isEsElectrico() {
        return esElectrico;
    }

    public void setEsElectrico(boolean esElectrico) {
        this.esElectrico = esElectrico;
    }

    @Override
    public double calcularPeaje() {
        double valor = 10000;
        if (esElectrico) valor *= 0.8;
        if (esServicioPublico) valor *= 1.15;
        return valor;
    }

    @Override
    public String getDescripcion() {
        return "Carro - Placa: " + placa + ", Eléctrico: " + esElectrico + ", Servicio Público: " + esServicioPublico;
    }

    @Override
    public TipoVehiculo getTipo() {
        return TipoVehiculo.CARRO;
    }
}
