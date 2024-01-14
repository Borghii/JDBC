module org.borghii.jdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.borghii.jdbc to javafx.fxml;
    exports org.borghii.jdbc;
    exports org.borghii.jdbc.model;
    opens org.borghii.jdbc.model to javafx.fxml;
}