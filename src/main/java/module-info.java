module co.edu.uniquindio.poo.sistemapeaje {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.poo.sistemapeaje.app to javafx.fxml;
    exports co.edu.uniquindio.poo.sistemapeaje.app;

    opens co.edu.uniquindio.poo.sistemapeaje.controller to javafx.fxml;
    exports co.edu.uniquindio.poo.sistemapeaje.controller;

    opens co.edu.uniquindio.poo.sistemapeaje.model to javafx.fxml;
    exports co.edu.uniquindio.poo.sistemapeaje.model;

    opens co.edu.uniquindio.poo.sistemapeaje.viewController to javafx.fxml;
    exports co.edu.uniquindio.poo.sistemapeaje.viewController;
}