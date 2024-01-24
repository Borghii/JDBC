package org.borghii.jdbc;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.borghii.jdbc.model.DBConnection;

import static org.borghii.jdbc.model.DBConnection.*;

public class ModifyController extends MenuController {

    @FXML
    TextField modifyname;
    @FXML
    TextField modifysurname;
    @FXML
    TextField id;
    @FXML
    TextField modifyhiredate;


    @FXML
    void onSearchEmployee(){
        searchEmployee(modifyname,modifysurname,modifyhiredate,Integer.parseInt(id.getText()));
    }
    @FXML
    void onModifyEmployee(){
        if (modifyEmployee(modifyname,modifysurname,modifyhiredate,Integer.parseInt(id.getText())))
            cleanCells(modifyname,modifysurname,modifyhiredate,id);
    }
    @FXML
    void onDeleteEmployee(){
        if (deleteEmployee(Integer.parseInt(id.getText())))
            cleanCells(modifyname,modifysurname,modifyhiredate,id);

    }

}
