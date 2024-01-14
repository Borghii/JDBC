module org.borghii.jdbc {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.borghii.jdbc to javafx.fxml;
    exports org.borghii.jdbc;
}