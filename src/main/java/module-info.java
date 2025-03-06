module com.example.runlatersample {
    requires javafx.controls;
    requires javafx.fxml;
    opens it.polimi.runlatersample to javafx.fxml;
    exports it.polimi.runlatersample;
}