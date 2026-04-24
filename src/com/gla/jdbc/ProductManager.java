package com.gla.jdbc;
import java.sql.*;
public class ProductManager {
public static void main(String[] a)throws Exception{
Connection c=DBConnection.getConnection();

// Create Table
c.createStatement().executeUpdate("create table if not exists product(pid int,pname varchar(50),qty int)");

// Insert
PreparedStatement ps=c.prepareStatement("insert into product values(1,'Pen',5)");
{
ps.executeUpdate();
}

// Read
ResultSet rs=c.createStatement().executeQuery("select * from product where qty<10");
while(rs.next()) System.out.println(rs.getString(1)+" "+rs.getString(2));

// Update
c.createStatement().executeUpdate("update product set qty=qty+5");

// Delete
c.createStatement().executeUpdate("delete from product where qty=0");

c.close();
}
}