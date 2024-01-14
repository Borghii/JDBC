package org.borghii.jdbc.model;
import java.sql.*;

public class DBConnection {
    public static void main(String[] args) {
        // Datos de conexión
        String url = "jdbc:mysql://localhost:3306/empleados";
        String user = "root";
        String password = "";

        try {
            // 1. CREAR CONEXION
            Connection connection = DriverManager.getConnection(url, user, password);
            // VERIFICAR CONEXION EXISTOSA
            if (connection != null) {
                System.out.println("Conexión exitosa a la base de datos.");
                // 2. CREAR OBJETO STATEMENT
                Statement statement = connection.createStatement();
                // 3. EJECUTAR SQL

                String instrucctionSql = "INSERT INTO datos_empleados (ID_EMPLOYEE, NAME, SURNAME, HIRE_DATE) VALUES (1,'Tomas','Borghi','2003-07-05')";

                statement.executeUpdate(instrucctionSql);

                // Cerrar la conexión cuando hayas terminado
                connection.close();
            }
        } catch (SQLException e) {
            System.err.println("Error de conexión a la base de datos: " + e.getMessage());
        }
    }

}
