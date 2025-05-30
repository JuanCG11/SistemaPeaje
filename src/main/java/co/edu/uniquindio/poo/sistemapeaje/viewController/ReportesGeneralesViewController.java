package co.edu.uniquindio.poo.sistemapeaje.viewController;

import co.edu.uniquindio.poo.sistemapeaje.app.App;
import co.edu.uniquindio.poo.sistemapeaje.controller.GestorPeaje;
import co.edu.uniquindio.poo.sistemapeaje.model.Persona;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.util.Map;

public class ReportesGeneralesViewController {

    @FXML private Button btnConductoresCamionesPesados;
    @FXML private Button btnTotalRecaudado;
    @FXML private Button btnVehiculosPorTipo;
    @FXML private TextArea txtReporte;
    private final GestorPeaje gestor = App.gestorPeaje;

    @FXML
    public void initialize() {
        btnConductoresCamionesPesados.setOnAction(e -> generarReporteCamionesPesados());
        btnTotalRecaudado.setOnAction(e -> generarReporteTotalRecaudado());
        btnVehiculosPorTipo.setOnAction(e -> generarReporteVehiculosPorTipo());
    }

    private void generarReporteCamionesPesados() {
        StringBuilder sb = new StringBuilder("Conductores con camiones de más de 10 toneladas:\n");

        for (Persona persona : gestor.obtenerConductoresConCamionesPesados()) {
            sb.append("- ").append(persona.getNombre()).append(" ").append(persona.getApellidos())
                    .append(" (Cédula: ").append(persona.getDocumento()).append(")\n");
        }

        txtReporte.setText(sb.toString());
    }

    private void generarReporteTotalRecaudado() {
        Map<String, Double> totales = gestor.calcularTotalRecaudadoPorEstacion();

        StringBuilder sb = new StringBuilder("Total recaudado por estación:\n");
        totales.forEach((nombre, total) ->
                sb.append("- ").append(nombre).append(": $").append(String.format("%,.0f", total)).append("\n")
        );

        txtReporte.setText(sb.toString());
    }

    private void generarReporteVehiculosPorTipo() {
        Map<String, Long> conteo = gestor.contarVehiculosPorTipo();

        StringBuilder sb = new StringBuilder("Vehículos por tipo:\n");
        conteo.forEach((tipo, cantidad) ->
                sb.append("- ").append(tipo).append(": ").append(cantidad).append("\n")
        );

        txtReporte.setText(sb.toString());
    }
}
