package com.gla.jdbc;
import java.sql.*;
public class MovieManager {
public static void main(String[] a)throws Exception{
Connection c=DBConnection.getConnection();

// Create Table
c.createStatement().executeUpdate("create table if not exists movies(id int,name varchar(50),seats int)");

// Insert
PreparedStatement ps=c.prepareStatement("insert into movies values(1,'MovieA',10)");
{
ps.executeUpdate();
}

// Read
ResultSet rs=c.createStatement().executeQuery("select * from movies where seats>0");
while(rs.next()) System.out.println(rs.getString(1)+" "+rs.getString(2));

// Update
c.createStatement().executeUpdate("update movies set seats=seats-1");

// Delete
c.createStatement().executeUpdate("delete from movies where seats=0");

c.close();
}
}