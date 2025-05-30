package co.edu.uniquindio.poo.sistemapeaje.viewController;


import co.edu.uniquindio.poo.sistemapeaje.viewController.helper.VehiculoTabla;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ListadoVehiculosViewController {

    @FXML private TableView<VehiculoTabla> tablaVehiculos;
    @FXML private TableColumn<VehiculoTabla, String> colPlaca;
    @FXML private TableColumn<VehiculoTabla, String> colTipo;
    @FXML private TableColumn<VehiculoTabla, Integer> colPeajes;
    @FXML private TableColumn<VehiculoTabla, String> colDescripcion;
    @FXML private TableColumn<VehiculoTabla, Double> colValorPagado;

    private final ObservableList<VehiculoTabla> listaVehiculos = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        colPlaca.setCellValueFactory(data -> data.getValue().placaProperty());
        colTipo.setCellValueFactory(data -> data.getValue().tipoProperty());
        colPeajes.setCellValueFactory(data -> data.getValue().peajesPagadosProperty().asObject());
        colDescripcion.setCellValueFactory(data -> data.getValue().descripcionProperty());
        colValorPagado.setCellValueFactory(data -> data.getValue().valorPagadoProperty().asObject());

        // Ejemplo de prueba (temporal)
        listaVehiculos.add(new VehiculoTabla("ABC123", "Carro", 3, "Eléctrico, Servicio Público", 34500.0));
        listaVehiculos.add(new VehiculoTabla("XYZ987", "Camión", 2, "3 ejes, 12t", 15400.0));

        tablaVehiculos.setItems(listaVehiculos);
    }
}
