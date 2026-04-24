package com.gla.jdbc;
import java.sql.*;
public class LibraryManager {
public static void main(String[] a)throws Exception{
Connection c=DBConnection.getConnection();

// Create Table
c.createStatement().executeUpdate("create table if not exists books(id int,title varchar(100),author varchar(50),status varchar(10))");

// Insert
PreparedStatement ps=c.prepareStatement("insert into books values(1,'Java','XYZ','Available')");
{
ps.executeUpdate();
}

// Read
ResultSet rs=c.createStatement().executeQuery("select * from books where status='Available'");
while(rs.next()) System.out.println(rs.getString(1)+" "+rs.getString(2));

// Update
c.createStatement().executeUpdate("update books set status='Issued' where id=1");

// Delete
c.createStatement().executeUpdate("delete from books where status='Lost'");

c.close();
}
}