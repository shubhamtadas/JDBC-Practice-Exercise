//Exercise 5: Write a Java program to create  a table  countries including columns country_id,country_name and region_id .
package com.exercises;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex5 {
  
  private static final String CREATE_TABLE_SQL="CREATE TABLE countries ("
                    + "country_id INT NOT NULL,"
                    + "country_name VARCHAR(45) NOT NULL,"
                    + "region_id INT NOT NULL)";
  
  public static void main(String[] args) {
    String jdbcUrl = "jdbc:mysql://localhost:3306/test1";
    String username = "root";
    String password = "root";

    Connection conn = null;
    Statement stmt = null;

    try {

      conn = DriverManager.getConnection(jdbcUrl, username, password);
      stmt = conn.createStatement();

      stmt.executeUpdate(CREATE_TABLE_SQL);

      System.out.println("Table created");

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}