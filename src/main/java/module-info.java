module com.example.stopperora_adamerikdominik {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.stopperora_adamerikdominik to javafx.fxml;
    exports com.example.stopperora_adamerikdominik;
}