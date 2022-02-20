//Exercise 3 : Write a JAVA program to update the records in BANK table using Statement.executeUpdate().
package com.exercises;

import java.sql.*; 
class Ex3{ 
public static void main(String args[])throws Exception{ 
	String JdbcURL = "jdbc:mysql://localhost:3306/test1";
    String Username = "root";
    String password = "root";
Class.forName("com.mysql.cj.jdbc.Driver"); 
Connection con=DriverManager.getConnection(JdbcURL, Username, password); 
Statement stmt=con.createStatement(); 
 
int result=stmt.executeUpdate("insert into BANK values(1,1000)"); 
//int result=stmt.executeUpdate("update BANK set AccountNumber=1, AccountBalance=10000"); 
//int result=stmt.executeUpdate("delete from BANK where AccountNumber=1"); 
System.out.println(result+" records affected"); 
con.close(); 
}} 