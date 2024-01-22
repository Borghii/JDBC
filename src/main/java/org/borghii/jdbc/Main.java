package org.borghii.jdbc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;

public class Main extends Application {
    MenuController mc = new MenuController();
    @Override
    public void init() throws Exception {
        super.init();
        MenuController.map.put("AddView.fxml","MainView.fxml");
        MenuController.map.put("ModifyView.fxml","MainView.fxml");
        MenuController.map.put("EmployeesView.fxml","MainView.fxml");

    }

    @Override
    public void start(Stage stage) throws IOException {
        mc.openNewStage("MainView.fxml");
    }

    public static void main(String[] args) {
        launch();
    }
}