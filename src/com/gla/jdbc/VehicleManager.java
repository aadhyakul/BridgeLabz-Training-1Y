package com.gla.jdbc;
import java.sql.*;
public class VehicleManager {
public static void main(String[] a)throws Exception{
Connection c=DBConnection.getConnection();

// Create Table
c.createStatement().executeUpdate("create table if not exists vehicles(regNo varchar(20),owner varchar(50),status varchar(20))");

// Insert
PreparedStatement ps=c.prepareStatement("insert into vehicles values('UP21','A','Pending')");
{
ps.executeUpdate();
}

// Read
ResultSet rs=c.createStatement().executeQuery("select * from vehicles where status='Pending'");
while(rs.next()) System.out.println(rs.getString(1)+" "+rs.getString(2));

// Update
c.createStatement().executeUpdate("update vehicles set status='Completed' where regNo='UP21'");

// Delete
c.createStatement().executeUpdate("delete from vehicles where regNo='X'");

c.close();
}
}