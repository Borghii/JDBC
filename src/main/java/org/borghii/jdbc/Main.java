package org.borghii.jdbc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;

public class Main extends Application {
    @Override
    public void init() throws Exception {
        super.init();
        MenuController.mapa.put("AddView.fxml","MainView.fxml");
        MenuController.mapa.put("ModifyView.fxml","MainView.fxml");
        MenuController.mapa.put("EmployeesView.fxml","MainView.fxml");
    }

    @Override
    public void start(Stage stage) throws IOException {
        MenuController.openNewStage("MainView.fxml");
    }

    public static void main(String[] args) {
        launch();
    }
}