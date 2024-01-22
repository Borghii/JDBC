package org.borghii.jdbc;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainController extends MenuController {


    @FXML
    Button addButton;

    @FXML
    public void addEmployee(){
        closeCurrentStage(addButton);
        openNewStage("AddView.fxml");
    }
    @FXML
    public void modifyEmployee(){
        closeCurrentStage(addButton);
        openNewStage("ModifyView.fxml");
    }
    @FXML
    public void viewEmployees(){
        closeCurrentStage(addButton);
        openNewStage("EmployeesView.fxml");
    }

}
