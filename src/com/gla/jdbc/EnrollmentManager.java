package com.gla.jdbc;
import java.sql.*;
public class EnrollmentManager {
public static void main(String[] a)throws Exception{
Connection c=DBConnection.getConnection();

// Create Table
c.createStatement().executeUpdate("create table if not exists enrollments(id int,student varchar(50),course varchar(50))");

// Insert
PreparedStatement ps=c.prepareStatement("insert into enrollments values(1,'A','Java')");
{
ps.executeUpdate();
}

// Read
ResultSet rs=c.createStatement().executeQuery("select * from enrollments where course='Java'");
while(rs.next()) System.out.println(rs.getString(1)+" "+rs.getString(2));

// Update
c.createStatement().executeUpdate("update enrollments set course='Python' where id=1");

// Delete
c.createStatement().executeUpdate("delete from enrollments where id=2");

c.close();
}
}