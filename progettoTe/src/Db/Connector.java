package Db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
	static String ip = "localhost";
	static String port = "3306";
	static String db = "tirocinioeasy";
	static String username = "root";
	static String password = "root";

    public static Connection getConnection() {
    	Connection  con=null;
    	try {
        	Class.forName("com.mysql.jdbc.Driver");
            try {
            	 con = DriverManager.getConnection("jdbc:mysql://"+ ip+":"+ port+"/"+db, username, password);
            	   return con;
            } catch (SQLException ex) {
                // log an exception. fro example:
                System.out.println("Failed to create the database connection."); 
            }
        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            System.out.println("Driver not found."); 
        }
		return con;
     
    }

    
	
}