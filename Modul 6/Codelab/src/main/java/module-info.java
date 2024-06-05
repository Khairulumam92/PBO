module org.example.codelab {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.codelab to javafx.fxml;
    exports org.example.codelab;
}