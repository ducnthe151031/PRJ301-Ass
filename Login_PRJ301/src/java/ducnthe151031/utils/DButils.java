/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ducnthe151031.utils;

import java.sql.Connection;

/**
 *
 * @author ADMIN
 */
//connect to DB
public class DButils {
    public static Connection getConnection() throws ClassNotFoundException{
        Connection conn=null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url="jdbc:sqlserver://localhost:1433;databaseName=UserManagement";
        conn=DriverManager.getConnection() 
        return conn;
    }
}
