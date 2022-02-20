// Write a Java program  to insert a record with values taken from user into the table countries against each columns using prepared statement.
//We can use a string array to store our own values.
package com.exercises;

import java.sql.*;  
import java.io.*;  
class Ex7{  
public static void main(String args[])throws Exception{  
	String JdbcURL = "jdbc:mysql://localhost:3306/test1";
    String Username = "root";
    String password = "root";
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection(JdbcURL, Username, password);  
  
PreparedStatement ps=con.prepareStatement("insert into countries values(?,?,?)");  
  
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
do{  
System.out.println("enter cid:");  
int cid=Integer.parseInt(br.readLine());  
System.out.println("enter cname:");  
String cname=br.readLine();  
System.out.println("enter rid:");  
float rid=Integer.parseInt(br.readLine());  
  
ps.setInt(1,cid);  
ps.setString(2,cname);  
ps.setFloat(3,rid);  
int i=ps.executeUpdate();  
System.out.println(i+" records affected");  
  
System.out.println("Do you want to continue: y/n");  
String s=br.readLine();  
if(s.startsWith("n")){  
break;  
}  
}while(true);  
  
con.close();  
}}  