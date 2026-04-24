package com.gla.jdbc;
import java.sql.*;
public class SalesManager {
public static void main(String[] a)throws Exception{
Connection c=DBConnection.getConnection();

// Create Table
c.createStatement().executeUpdate("create table if not exists sales(id int,bookName varchar(100),quantity int,price double)");

// Insert
PreparedStatement ps=c.prepareStatement("insert into sales values(1,'Book',2,100)");
{
ps.executeUpdate();
}

// Read
ResultSet rs=c.createStatement().executeQuery("select * from sales where quantity>1");
while(rs.next()) System.out.println(rs.getString(1)+" "+rs.getString(2));

// Update
c.createStatement().executeUpdate("update sales set quantity=3 where id=1");

// Delete
c.createStatement().executeUpdate("delete from sales where id=2");

c.close();
}
}