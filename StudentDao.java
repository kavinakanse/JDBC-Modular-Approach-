package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDao {
	public void insertData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		PreparedStatement ps = c.prepareStatement("insert into students(id, name, city) values (?,?,?)");
		ps.setInt(1, 4);
		ps.setString(2, "sangram");
		ps.setString(3, "goa");
		ps.executeUpdate();
		System.out.println("data inserted");
		c.close();
	}

	public void updateData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		PreparedStatement ps = c.prepareStatement("update students set name=? where id = ?");
		ps.setInt(2, 2);
		ps.setString(1, "savi");
		ps.executeUpdate();
		System.out.println("Data is updated...");
		c.close();
	}

	public void deleteData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		PreparedStatement ps = c.prepareStatement("delete from students where id = ?");
		ps.setInt(1, 3);
		ps.executeUpdate();
		System.out.println("Data is deleted...");
		c.close();
		
	}

	public void getAllData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		PreparedStatement ps = c.prepareStatement("select * from students");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3));
		}
		c.close();
	}
}
