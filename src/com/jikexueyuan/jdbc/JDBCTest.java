package com.jikexueyuan.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCTest {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db","root","");
		} catch (Exception e) {
			// TODO: handle exception
		}
		return conn;
	}
	public static void main(String[] args) {
		String sql = "SELECT * FROM tbl_user";
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");//加载驱动程序
			//获取数据库的连接
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db","root","");
			//获取语句
			st = conn.createStatement();
			//获取结果
			rs = st.executeQuery(sql);
			
			while (rs.next()) {
				System.out.print(rs.getInt("id") +"\t" );
				System.out.print(rs.getString("name") +"\t");
				System.out.print(rs.getString("password")+"\t ");
				System.out.print(rs.getString("email"));
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			 try {
				rs.close();
				st.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			
		}
	}

}
