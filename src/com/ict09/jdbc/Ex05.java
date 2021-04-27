package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex05 {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null; // select
		int result = 0; // insert, update, delete
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://203.236.220.95:3306/test02db?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "test02";
			String password = "1230";
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();

			String sql = "insert into student_tb(no, name, det, addr, tel) "
					+ "values"
					+ "(1,'������','��������','���ѹα� ����','000-0000-0001'),"
					+ "(2,'������','��������','���ѹα� ����','000-0000-0002'),"
					+ "(3,'�ٴٴ�','�ٴٴٴ�','���ѹα� �λ�','000-0000-0003'),"
					+ "(4,'����','�����','���ѹα� ����','000-0000-0004'),"
					+ "(5,'������','��������','���ѹα� ����','000-0000-0005')";
			result = stmt.executeUpdate(sql);

			if (result > 0) {
				System.out.println("insert ����");
				sql = "select * from student_tb";
				rs = stmt.executeQuery(sql);
				while (rs.next()) {
					System.out.print(rs.getInt("no") + "\t");
					System.out.print(rs.getString("name") + "\t");
					System.out.print(rs.getString("det") + "\t");
					System.out.print(rs.getString("addr") + "\t");
					System.out.println(rs.getString("tel"));
				}
			} else {
				System.out.println("insert ����-1 ");
			}
		} catch (Exception e) {
			System.out.println("insert ����-2 " + e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println("insert ���� " + e2);
			}
		}
	}

}