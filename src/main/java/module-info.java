module es.uah.proyecto.juegodelavidaluciaydaniel {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.uah.proyecto.juegodelavidaluciaydaniel to javafx.fxml;
    exports es.uah.proyecto.juegodelavidaluciaydaniel;
}