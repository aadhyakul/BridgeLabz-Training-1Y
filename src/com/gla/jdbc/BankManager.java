package com.gla.jdbc;
import java.sql.*;
public class BankManager {
public static void main(String[] a)throws Exception{
Connection c=DBConnection.getConnection();

// Create Table
c.createStatement().executeUpdate("create table if not exists accounts(accNo int,name varchar(50),balance double)");

// Insert
PreparedStatement ps=c.prepareStatement("insert into accounts values(1,'Ram',20000)");
{
ps.executeUpdate();
}

// Read
ResultSet rs=c.createStatement().executeQuery("select * from accounts where balance>10000");
while(rs.next()) System.out.println(rs.getString(1)+" "+rs.getString(2));

// Update
c.createStatement().executeUpdate("update accounts set balance=balance+500");

// Delete
c.createStatement().executeUpdate("delete from accounts where accNo=2");

c.close();
}
}