package org.borghii.jdbc.model;
import java.sql.*;

public class DBConnection {

    private static Connection connection() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/employees";
        String user = "root";
        String password = "1234";
        return DriverManager.getConnection(url,user,password);
    }

    public static void addEmployee(Employee employee) {
        String query = "INSERT INTO employee_data (NAME , SURNAME, HIRE_DATE) VALUES (?, ?, ?)";

        try (Connection conn = connection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, employee.getName());
            pstmt.setString(2, employee.getSurname());
            pstmt.setDate(3, Date.valueOf(employee.getHireDate().plusMonths(2)));

            pstmt.executeUpdate();
            System.out.println("Employee added correctly");

        } catch (SQLException e) {
            System.err.println("Error adding employee: " + e.getMessage());
        }
    }

}
