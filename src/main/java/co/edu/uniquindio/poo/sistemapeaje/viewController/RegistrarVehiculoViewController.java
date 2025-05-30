package co.edu.uniquindio.poo.sistemapeaje.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class RegistrarVehiculoViewController {
    @FXML private ComboBox<String> comboTipoVehiculo;
    @FXML private TextField txtPlaca;
    @FXML private TextField txtEjes;
    @FXML private TextField txtCarga;
    @FXML private TextField txtCilindraje;
    @FXML private CheckBox checkElectrico;
    @FXML private CheckBox checkServicioPublico;
    @FXML private TextField txtDocumentoConductor;
    @FXML private Button btnRegistrarPaso;

    @FXML
    public void initialize() {
        btnRegistrarPaso.setOnAction(event -> registrarPaso());
    }

    private void registrarPaso() {
        String tipo = comboTipoVehiculo.getValue();
        String placa = txtPlaca.getText();
        String documento = txtDocumentoConductor.getText();

        // Validaciones básicas
        if (tipo == null || placa.isBlank() || documento.isBlank()) {
            mostrarAlerta("Error", "Debe llenar los campos obligatorios.");
            return;
        }

        System.out.println("Registrando paso de vehículo:");
        System.out.println("Tipo: " + tipo + ", Placa: " + placa + ", Doc: " + documento);
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.WARNING);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
}
