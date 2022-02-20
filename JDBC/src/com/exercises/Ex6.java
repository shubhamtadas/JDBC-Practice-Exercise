//Exercise 6 : Write a Java program to  alter table countries including columns country_id,country_name and region_id  to add a column region_id .
package com.exercises;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Ex6 {
   public static void main(String args[]) throws Exception {
	   String JdbcURL = "jdbc:mysql://localhost:3306/test1";
	    String Username = "root";
	    String password = "root"; 
	Class.forName("com.mysql.cj.jdbc.Driver");
     
      Connection con = DriverManager.getConnection(JdbcURL, Username, password);
      System.out.println("Connection established......");
     
      Statement stmt = con.createStatement();
     
      String query = "ALTER TABLE countries ADD rname varchar(20)";
     
      stmt.executeUpdate(query);
      System.out.println("Column added......");
      
      
   }
}