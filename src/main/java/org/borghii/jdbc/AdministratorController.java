package org.borghii.jdbc;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.HashMap;

public class AdministratorController {

    MenuController mc = new MenuController();

    @FXML
    Button buttonBack;

    @FXML
    public void onBack(){
        mc.closeCurrentStage(buttonBack);
        mc.openNewStage("viewLogin.fxml");
    }



}