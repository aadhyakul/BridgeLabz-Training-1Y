package com.gla.jdbc;
import java.sql.*;
public class GymManager {
public static void main(String[] a)throws Exception{
Connection c=DBConnection.getConnection();

// Create Table
c.createStatement().executeUpdate("create table if not exists members(id int,name varchar(50),type varchar(20),months int)");

// Insert
PreparedStatement ps=c.prepareStatement("insert into members values(1,'A','Premium',6)");
{
ps.executeUpdate();
}

// Read
ResultSet rs=c.createStatement().executeQuery("select * from members where type='Premium'");
while(rs.next()) System.out.println(rs.getString(1)+" "+rs.getString(2));

// Update
c.createStatement().executeUpdate("update members set months=months+1");

// Delete
c.createStatement().executeUpdate("delete from members where months=0");

c.close();
}
}