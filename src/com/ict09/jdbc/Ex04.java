package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex04 {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null; // select
		int result = 0; // insert, update, delete
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/test01db?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "test01";
			String password = "1230";
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();

			String sql = "delete from customer where name='손흥민'";
			result = stmt.executeUpdate(sql);

			if (result > 0) {
				System.out.println("delete 성공");
				sql = "select * from customer";
				rs = stmt.executeQuery(sql);
				while (rs.next()) {
					System.out.print(rs.getInt("custid") + "\t");
					System.out.print(rs.getString("name") + "\t");
					System.out.print(rs.getString("address") + "\t");
					System.out.println(rs.getString("phone"));
				}
			} else {
				System.out.println("delete 실패-1 ");
			}
		} catch (Exception e) {
			System.out.println("delete 실패-2 " + e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println("delete 실패 " + e2);
			}
		}
	}

}