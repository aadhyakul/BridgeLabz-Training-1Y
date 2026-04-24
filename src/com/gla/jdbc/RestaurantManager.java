package com.gla.jdbc;
import java.sql.*;
public class RestaurantManager {
public static void main(String[] a)throws Exception{
Connection c=DBConnection.getConnection();

// Create Table
c.createStatement().executeUpdate("create table if not exists menu(id int,itemName varchar(50),price double)");

// Insert
PreparedStatement ps=c.prepareStatement("insert into menu values(1,'Burger',150)");
{
ps.executeUpdate();
}

// Read
ResultSet rs=c.createStatement().executeQuery("select * from menu where price<200");
while(rs.next()) System.out.println(rs.getString(1)+" "+rs.getString(2));

// Update
c.createStatement().executeUpdate("update menu set price=price+10");

// Delete
c.createStatement().executeUpdate("delete from menu where id=2");

c.close();
}
}