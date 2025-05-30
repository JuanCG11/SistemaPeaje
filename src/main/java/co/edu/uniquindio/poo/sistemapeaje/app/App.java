package co.edu.uniquindio.poo.sistemapeaje.app;

import co.edu.uniquindio.poo.sistemapeaje.controller.GestorPeaje;
import co.edu.uniquindio.poo.sistemapeaje.model.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

import java.time.LocalDate;

public class App extends Application {
    public static final GestorPeaje gestorPeaje = new GestorPeaje();

    @Override
    public void start(Stage primaryStage) throws Exception {


        // Crear estaciones
        Peaje peajeNorte = new Peaje("Peaje Norte", "Antioquia");
        Peaje peajeSur = new Peaje("Peaje Sur", "Valle");
        gestorPeaje.registrarEstacion(peajeNorte);
        gestorPeaje.registrarEstacion(peajeSur);

        // Crear personas
        Conductor pedro = new Conductor("Pedro", "López","112233", LocalDate.of(1980, 5, 10));
        Conductor ana = new Conductor("Ana", "Torres","445566", LocalDate.of(1990, 3, 15));
        gestorPeaje.registrarPersona(pedro);
        gestorPeaje.registrarPersona(ana);

        // Crear vehículos
        Vehiculo carro1 = new Carro("ABC123", false, false);
        Vehiculo moto1 = new Moto("XYZ987", 250);
        Vehiculo camionPesado = new Camion("TRK999", 4, 12.5);
        Vehiculo camionLigero = new Camion("TRK888", 2, 8.0);

        pedro.asignarVehiculo(carro1);
        pedro.asignarVehiculo(camionPesado);
        ana.asignarVehiculo(moto1);
        ana.asignarVehiculo(camionLigero);

        // Crear recaudadores
        Recaudador juan = new Recaudador("Juan", "Pérez", "998877", LocalDate.of(1985, 7, 20), 2000000);
        gestorPeaje.registrarRecaudador(juan);

        // Simular algunos pagos de peaje
        double peaje1 = peajeNorte.calcularPeaje(carro1); // $10,000
        double peaje2 = peajeNorte.calcularPeaje(camionPesado); // $7,000 * 4 ejes + 10% sobre total
        double peaje3 = peajeSur.calcularPeaje(moto1); // $5,000 + $2,000 por cilindraje > 200

        carro1.incrementarPeajes();
        camionPesado.incrementarPeajes();
        moto1.incrementarPeajes();

        // Cargar vista principal
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/sistemapeaje/mainView.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("Sistema de Peaje");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
