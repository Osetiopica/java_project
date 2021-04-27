package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex01 {

	public static void main(String[] args) {
//		JDBC(Java Database Connectivity)�� �ڹٿ��� �����ͺ��̽��� ������ �� �ֵ��� �ϴ� �ڹ� API�̴�.
//		JDBC�� DB���� �ڷḦ �����ϰų� ������Ʈ�ϴ� ����� ����
//		�� DB�鿡�� ������ �� �ִ� JDBC ����̹��� �ʿ�
//		MySQL�� �ʿ��� ����̹��� �ٿ� �޾Ƽ� �ش� ������Ʈ�� �����ؾ� ��
//		������Ʈ ��Ŭ�� - build path - add external jars - ���̺귯�� ����

//		DB ó���� �ʿ��� class 3�� ����
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null; // select ���� ����� ����
		int result = 0; // insert, update, delete�� ���
		try {
//			1. driver �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
//			2. ������ ���� ����
			String url = "jdbc:mysql://localhost:3306/test01db?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "test01";
			String password = "1230";
			conn = DriverManager.getConnection(url, user, password);
//			3. ������ �ۼ�
			String sql = "select * from customer";
//			4. DB ������ Statement Ŭ������ ����
			stmt = conn.createStatement();
//			5. Statement Ŭ������ ���� ���� �� 
//			DB�� ����� �޾ƿ� -> select ���� ���� �ƴ� ���� ����
//			select ���� ���� ResultSet Ŭ������ ����
			rs = stmt.executeQuery(sql);
//			select ���� �ƴ� ���� int�� ����
//			result = stmt.executeUpdate(sql);
//			6. ���� �ٿ� ������ ������ true
			while (rs.next()) {
				System.out.print(rs.getInt("custid") + "\t");
				System.out.print(rs.getString("name") + "\t");
				System.out.print(rs.getString("address") + "\t");
				System.out.println(rs.getString("phone"));
			}

			stmt.execute(sql);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}

}