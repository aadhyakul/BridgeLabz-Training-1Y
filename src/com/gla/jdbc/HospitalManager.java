package com.gla.jdbc;
import java.sql.*;
public class HospitalManager {
public static void main(String[] a)throws Exception{
Connection c=DBConnection.getConnection();

// Create Table
c.createStatement().executeUpdate("create table if not exists patients(id int,name varchar(50),disease varchar(50))");

// Insert
PreparedStatement ps=c.prepareStatement("insert into patients values(1,'A','Flu')");
{
ps.executeUpdate();
}

// Read
ResultSet rs=c.createStatement().executeQuery("select * from patients where disease='Flu'");
while(rs.next()) System.out.println(rs.getString(1)+" "+rs.getString(2));

// Update
c.createStatement().executeUpdate("update patients set disease='Cold' where id=1");

// Delete
c.createStatement().executeUpdate("delete from patients where id=2");

c.close();
}
}