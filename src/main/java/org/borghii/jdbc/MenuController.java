package org.borghii.jdbc;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuController {

    static HashMap<String, String > mapa = new HashMap<>();

    static public void closeCurrentStage(TextField textField) {
        Stage stage = (Stage) textField.getScene().getWindow();
        stage.close();
    }
    static public void closeCurrentStage(Button button) {
        Stage stage = (Stage) button.getScene().getWindow();
        stage.close();
    }


    static public void openNewStage(String fxmlFileName) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(MenuController.class.getResource(fxmlFileName));
            Scene scene = new Scene(fxmlLoader.load());

            Stage stage = new Stage();
            stage.setTitle("Admin");
            stage.setScene(scene);
            stage.show();

            if (!fxmlFileName.equals("MainView.fxml"))
                stage.setOnCloseRequest(e->{
                    openNewStage(getFxmlFather(fxmlFileName));
                });

        } catch (Exception e) {
            e.printStackTrace();
            // Manejar cualquier excepción que pueda ocurrir al cargar el nuevo FXML
        }
    }

    static private String getFxmlFather(String fxml){
        return mapa.get(fxml);
    }


}
