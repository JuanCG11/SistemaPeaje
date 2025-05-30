package co.edu.uniquindio.poo.sistemapeaje.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ConsultarRecaudadorViewController {

    @FXML private TextField txtNombreCompleto;
    @FXML private Button btnBuscar;
    @FXML private TextArea txtResultado;

    @FXML
    public void initialize() {
        btnBuscar.setOnAction(event -> buscarRecaudador());
    }

    private void buscarRecaudador() {
        String nombre = txtNombreCompleto.getText().trim().replaceAll("\\s+", " ").toLowerCase();

        if (nombre.isBlank()) {
            mostrarMensaje("Ingrese un nombre completo.");
            return;
        }


        if (nombre.equals("juan perez")) {
            txtResultado.setText("Nombre: Juan Pérez\nCédula: 12345678\nFecha Nacimiento: 1980-01-01\nSueldo: $1.500.000");
        } else {
            txtResultado.setText("No se encontró ningún recaudador con ese nombre.");
        }
    }

    private void mostrarMensaje(String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Información");
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
}
