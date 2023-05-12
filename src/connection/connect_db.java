/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Fikri
 */
public class connect_db {
    private Connection connection;
    public  Connection connect() {
    // Trying to Connect into MySQL
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connected to MySQL");
        }
        catch(ClassNotFoundException error){
            System.out.println("Cant Connect to MySQL caused by " + error);
        }
    // Define to located Database
        String path_db = "jdbc:mysql://localhost/tulisnilai";
    // Trying to Connect into Database
        try{
            connection = DriverManager.getConnection(path_db,"root","");
            System.out.println("Connected to Database");
        }
        catch(SQLException error){
            System.out.println("Cant Connect to Database caused by "+error);
        }
        return connection;
    }

}
