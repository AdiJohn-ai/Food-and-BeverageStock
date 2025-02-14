/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodstockmanagement;

/**
 *
 * @author john
 */

    import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionToDB {
    
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/StockManagement"; // Replace with your database URL
        String user = "Admin"; // Replace with your database username
        String password = "AdminPassword"; // Replace with your database password

        try {
            // Register the JDBC driver (only needed for older JDBC versions)
            Class.forName("com.mysql.cj.jdbc.Driver"); // For MySQL 8+
            // Or for older MySQL versions:
            // Class.forName("com.mysql.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database successfully!");
            return connection;

        } catch (ClassNotFoundException e) {
            System.err.println("JDBC driver not found: " + e.getMessage());
            throw new SQLException("JDBC driver not found", e); // Re-throw as SQLException
        } catch (SQLException e) {
            System.err.println("Database connection failed: " + e.getMessage());
            throw e; // Re-throw the SQLException
        }
    }

    public static void main(String[] args) {
      
    }
}
    

