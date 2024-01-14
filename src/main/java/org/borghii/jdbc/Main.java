package org.borghii.jdbc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;

public class Main extends Application {



//    @Override
//    public void init() throws Exception {
//        super.init();
//        MenuController.mapa.put("viewAdministrator.fxml","viewLogin.fxml");
//    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("viewLogin.fxml"));

        Scene scene = new Scene(fxmlLoader.load());
        
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}