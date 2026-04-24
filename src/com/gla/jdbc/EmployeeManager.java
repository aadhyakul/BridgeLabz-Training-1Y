package com.gla.jdbc;
import java.sql.*;
public class EmployeeManager {
public static void main(String[] a)throws Exception{
Connection c=DBConnection.getConnection();

// Create Table
c.createStatement().executeUpdate("create table if not exists employee(id int,name varchar(50),salary double)");

// Insert
PreparedStatement ps=c.prepareStatement("insert into employee values(1,'A',40000)");
{
ps.executeUpdate();
}

// Read
ResultSet rs=c.createStatement().executeQuery("select * from employee where salary>30000");
while(rs.next()) System.out.println(rs.getString(1)+" "+rs.getString(2));

// Update
c.createStatement().executeUpdate("update employee set salary=salary*1.1");

// Delete
c.createStatement().executeUpdate("delete from employee where salary<15000");

c.close();
}
}