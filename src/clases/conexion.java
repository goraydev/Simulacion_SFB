package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {
    
    private static String DRIVER = "com.mysql.jdbc.Driver";
    private static String USUARIO = "root";
    private static String PASSWORD = "GB11SR4LM10";
    private static String URL = "jdbc:mysql://localhost:3306/dbsfb"+"?useTimezone=true&serverTimezone=UTC";
    
    public Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USUARIO, PASSWORD);
           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
        }
        return con;
    }
}
