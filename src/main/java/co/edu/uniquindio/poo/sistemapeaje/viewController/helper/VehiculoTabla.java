package co.edu.uniquindio.poo.sistemapeaje.viewController.helper;

import javafx.beans.property.*;

public class VehiculoTabla {
    private final StringProperty placa;
    private final StringProperty tipo;
    private final IntegerProperty peajesPagados;
    private final StringProperty descripcion;
    private final DoubleProperty valorPagado;

    public VehiculoTabla(String placa, String tipo, int peajesPagados, String descripcion, double valorPagado) {
        this.placa = new SimpleStringProperty(placa);
        this.tipo = new SimpleStringProperty(tipo);
        this.peajesPagados = new SimpleIntegerProperty(peajesPagados);
        this.descripcion = new SimpleStringProperty(descripcion);
        this.valorPagado = new SimpleDoubleProperty(valorPagado);
    }

    public StringProperty placaProperty() { return placa; }
    public StringProperty tipoProperty() { return tipo; }
    public IntegerProperty peajesPagadosProperty() { return peajesPagados; }
    public StringProperty descripcionProperty() { return descripcion; }
    public DoubleProperty valorPagadoProperty() { return valorPagado; }
}
