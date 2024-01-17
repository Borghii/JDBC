package org.borghii.jdbc;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    Button addButton;

    @FXML
    public void addEmployee(){
        MenuController.closeCurrentStage(addButton);
        MenuController.openNewStage("AddView.fxml");
    }
    @FXML
    public void modifyEmployee(){
        MenuController.openNewStage("ModifyView.fxml");
    }
    @FXML
    public void viewEmployees(){
        MenuController.openNewStage("EmployeesView.fxml");
    }

}
