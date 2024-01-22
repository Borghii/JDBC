package org.borghii.jdbc.model;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import org.borghii.jdbc.MenuController;

import java.sql.*;

public class DBConnection  {



    private static Connection connection() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/employees";
        String user = "root";
        String password = "1234";
        return DriverManager.getConnection(url,user,password);
    }

    public static boolean addEmployee(Employee employee) {
        String query = "INSERT INTO employee_data (NAME , SURNAME, HIRE_DATE) VALUES (?, ?, ?)";

        try (Connection conn = connection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, employee.getName());
            pstmt.setString(2, employee.getSurname());
            pstmt.setDate(3, Date.valueOf(employee.getHireDate().plusMonths(2)));
            pstmt.executeUpdate();

            MenuController.setAlert(Alert.AlertType.CONFIRMATION,"Employee added");
            return true;

        } catch (SQLException e) {
            System.err.println("Error adding employee: " + e.getMessage());
            MenuController.setAlert(Alert.AlertType.ERROR,"Employee not added");
            return false;
        }
    }



}
