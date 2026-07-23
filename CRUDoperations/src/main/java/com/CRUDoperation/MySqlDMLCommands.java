package com.CRUDoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class MySqlDMLCommands {

    public static void main(String[] args) throws SQLException {

        // 1. Create Connection
        String databaseURL = "jdbc:mysql://localhost:3306/SeleniumAutomation";
        String user = "root";
        String password = "manju/1973";

        // Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(databaseURL, user, password);
        Statement stmt = con.createStatement();

        String query = "INSERT INTO book_detl VALUES ('AI003','SeleniumAI','Che','Raghavendra','ABC','S','2026',900)";

        stmt.execute(query);
        
        con.close();
        System.out.println("Statement Executed : Record Update Successfully");
    }
}