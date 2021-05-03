package com.ict10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex03 {

	public static void main(String[] args) {
//		JDBC: Java Database Connectivity
//		

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/test01db?charactorEncoding=UTF-8&serverTimezone=UTC";
			String user = "test01";
			String password = "1230";
			conn = DriverManager.getConnection(url, user, password);

			String sql = "insert into book values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 15);
			pstmt.setString(2, "농구 바이블");
			pstmt.setString(3, "대한미디어");
			pstmt.setInt(4, 13000);
			result = pstmt.executeUpdate();
			if (result != 0) {
				sql = "select * from book order by bookid asc";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					System.out.print(rs.getInt("bookid") + "\t");
					System.out.print(rs.getString("bookname") + "\t");
					System.out.print(rs.getString("publisher") + "\t");
					System.out.println(rs.getInt("price"));
				}
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}

	}
}