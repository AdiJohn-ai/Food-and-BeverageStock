/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package foodstockmanagement;

import static foodstockmanagement.ConnectionToDB.getConnection;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author john
 */
public class FoodStockManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Loginform login = new Loginform();
        login.setVisible(true);
        
          try {
            Connection conn = getConnection();
            // Use the connection here (e.g., execute queries)
            // ...

            // Important: Close the connection when you're done with it
            if (conn != null) {
                conn.close();
                System.out.println("Database connection closed.");
            }

        } catch (SQLException e) {
            System.err.println("Error in main: " + e.getMessage());
        }
        
        
    }
    
    
}
