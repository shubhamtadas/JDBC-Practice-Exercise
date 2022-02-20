//Exercise 1 : Write a JAVA program to update the Bank table with column ("AccountNo","AccountBal") using resultset object.
package com.exercises;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex1 {
   public static void main(String[] args) {
      String jdbcUrl = "jdbc:mysql://localhost:3306/test1";
      String username = "root";
      String password = "root";
      String sql = "select AccountNumber, AccountBalance from BANK";

      try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
            PreparedStatement stmt = conn.prepareStatement(sql,
                  ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery()) {
         
         // Update 2nd row
         // Move cursor to 2nd row
         rs.absolute(2);
         rs.updateInt(2,3443);
         rs.updateRow();
         
         System.out.println("ID : " + rs.getInt("AccountNumber") + " \tNAME : " + rs.getInt("AccountBalance"));
         
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
}