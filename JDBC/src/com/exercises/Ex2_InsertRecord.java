//Exercise 2 : Write a JAVA program to insert 5 records in BANK table with column ("AccountNo","AccountBal")  using prepared statement.
package com.exercises;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;
public class Ex2_InsertRecord {
   static int accNum;
   static int accBal;
   public static void main(String[] args) {
      String JdbcURL = "jdbc:mysql://localhost:3306/test1";
      String Username = "root";
      String password = "root";
      Connection con = null;
      Scanner keyboardInput=new Scanner(System.in);
      PreparedStatement pstmt = null;
      String query = "INSERT INTO BANK(AccountNumber, AccountBalance)" + "VALUES (?, ?)";
      try {
    	   	  
    	 Class.forName("com.mysql.cj.jdbc.Driver");
         con = DriverManager.getConnection(JdbcURL, Username, password);
         input(keyboardInput);
         pstmt = con.prepareStatement(query);
         pstmt.setInt(1, accNum);
         pstmt.setInt(2, accBal);
         
         int status = pstmt.executeUpdate();
         if(status > 0) {
            System.out.println("Record is inserted successfully !!!");
         }
      } catch(Exception e){
         e.printStackTrace();
      }
   }
   public static void input(Scanner keyboardInput) {
      System.out.println("Enter Account Number: ");
      accNum = keyboardInput.nextInt();
      System.out.println("Enter Account Balance: ");
      accBal = keyboardInput.nextInt();
   }
}