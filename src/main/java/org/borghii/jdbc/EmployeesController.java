package org.borghii.jdbc;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.borghii.jdbc.model.Employee;

import java.net.URL;
import java.util.Properties;
import java.util.ResourceBundle;

import static org.borghii.jdbc.model.DBConnection.setTable;

public class EmployeesController implements Initializable {
    @FXML
    TableView<Employee> tableEmployees;
    @FXML
    TableColumn colId;
    @FXML
    TableColumn colName;
    @FXML
    TableColumn colSurname;
    @FXML
    TableColumn colHire;
    @FXML
    TableColumn colUnhire;
    @FXML
    TableColumn colState;

    private ObservableList<Employee> employees;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        employees = FXCollections.observableArrayList();
//        this.colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colSurname.setCellValueFactory(new PropertyValueFactory<>("surname"));
        colHire.setCellValueFactory(new PropertyValueFactory<>("hireDate"));
        colUnhire.setCellValueFactory(new PropertyValueFactory<>("unHireDate"));
        colState.setCellValueFactory(new PropertyValueFactory<>("state"));
        setTable(employees);
        tableEmployees.setItems(employees);

    }



}
