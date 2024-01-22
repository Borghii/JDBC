package org.borghii.jdbc;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.borghii.jdbc.model.DBConnection;
import org.borghii.jdbc.model.Employee;

public class AddController extends MenuController {
    @FXML
    TextField name;
    @FXML
    TextField surname;

    @FXML
    public void onAddEmployee(){
        Employee employee = new Employee(name.getText(),surname.getText());
        if (DBConnection.addEmployee(employee))
            cleanCells(name,surname);
    }


}
