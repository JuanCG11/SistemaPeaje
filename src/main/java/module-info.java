module co.edu.uniquindio.poo.sistemapeaje {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.poo.sistemapeaje.app to javafx.fxml;
    exports co.edu.uniquindio.poo.sistemapeaje.app;
    exports co.edu.uniquindio.poo.sistemapeaje.model;
    opens co.edu.uniquindio.poo.sistemapeaje.model to javafx.fxml;
}