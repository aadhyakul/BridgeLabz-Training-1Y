package com.gla.jdbc;
import java.sql.*;
public class CustomerManager {
public static void main(String[] a)throws Exception{
Connection c=DBConnection.getConnection();

// Create Table
c.createStatement().executeUpdate("create table if not exists customers(id int,name varchar(50),phone varchar(15))");

// Insert
PreparedStatement ps=c.prepareStatement("insert into customers values(1,'Ram','9999')");
{
ps.executeUpdate();
}

// Read
ResultSet rs=c.createStatement().executeQuery("select * from customers where name like '%a%'");
while(rs.next()) System.out.println(rs.getString(1)+" "+rs.getString(2));

// Update
c.createStatement().executeUpdate("update customers set phone='8888' where id=1");

// Delete
c.createStatement().executeUpdate("delete from customers where id=2");

c.close();
}
}