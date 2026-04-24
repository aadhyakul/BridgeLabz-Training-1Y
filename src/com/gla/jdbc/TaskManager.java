package com.gla.jdbc;
import java.sql.*;
public class TaskManager {
public static void main(String[] a)throws Exception{
Connection c=DBConnection.getConnection();

// Create Table
c.createStatement().executeUpdate("create table if not exists tasks(id int,title varchar(100),status varchar(20))");

// Insert
PreparedStatement ps=c.prepareStatement("insert into tasks values(1,'Task1','Pending')");
{
ps.executeUpdate();
}

// Read
ResultSet rs=c.createStatement().executeQuery("select * from tasks where status='Pending'");
while(rs.next()) System.out.println(rs.getString(1)+" "+rs.getString(2));

// Update
c.createStatement().executeUpdate("update tasks set status='Completed' where id=1");

// Delete
c.createStatement().executeUpdate("delete from tasks where status='Completed'");

c.close();
}
}