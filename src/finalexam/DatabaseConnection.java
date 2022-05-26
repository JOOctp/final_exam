package finalexam;

import java.sql.*;
import javax.swing.JOptionPane;

public class DatabaseConnection {
    private static Connection MySQLConnection;
    
    public static Connection connectionDB() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost/ComicZoneDB";
            String user= "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            MySQLConnection = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Connection Error " + e.getMessage());
        }
        
        return MySQLConnection;
    } 
}
