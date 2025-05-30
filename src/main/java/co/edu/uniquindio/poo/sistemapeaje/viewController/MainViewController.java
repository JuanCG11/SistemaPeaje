package co.edu.uniquindio.poo.sistemapeaje.viewController;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainViewController {
    @FXML private Button btnRegistrarVehiculo;
    @FXML private Button btnListadoVehiculos;
    @FXML private Button btnConsultarRecaudador;
    @FXML private Button btnReportesGenerales;

    @FXML
    public void initialize() {
        btnRegistrarVehiculo.setOnAction(event -> abrirVentanaRegistrarVehiculo());
        btnListadoVehiculos.setOnAction(event -> System.out.println("Listado vehículos"));
        btnConsultarRecaudador.setOnAction(event -> System.out.println("Consultar recaudador"));
        btnReportesGenerales.setOnAction(event -> System.out.println("Reportes generales"));
        btnListadoVehiculos.setOnAction(event -> abrirVentanaListadoVehiculos());
        btnConsultarRecaudador.setOnAction(event -> abrirVentanaConsultarRecaudador());
        btnReportesGenerales.setOnAction(event -> abrirVentanaReportesGenerales());
    }

    private void abrirVentanaRegistrarVehiculo() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/sistemapeaje/registrarVehiculoView.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Registrar Paso de Vehículo");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void abrirVentanaListadoVehiculos() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/sistemapeaje/listadoVehiculosView.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Listado de Vehículos");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void abrirVentanaConsultarRecaudador() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/sistemapeaje/consultarRecaudadorView.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Consultar Recaudador");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void abrirVentanaReportesGenerales() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/sistemapeaje/reportesGeneralesView.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Reportes Generales");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
