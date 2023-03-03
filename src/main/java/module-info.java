module com.example.runlatersample {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.runlatersample to javafx.fxml;
    exports com.example.runlatersample;
}