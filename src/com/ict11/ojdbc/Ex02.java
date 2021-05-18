package com.ict11.ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("���ǻ� �Է� >> ");
		String p = sc.next();
		int result = 0;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@203.236.220.95:1521:xe";
			String user = "c##snow";
			String password = "1230";
			conn = DriverManager.getConnection(url, user, password);
			String sql = "select * from book where publisher like ? order by bookid";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, "%"+p+"%");
			rs = psmt.executeQuery();
			System.out.println("������ȣ\t������\t���ǻ�\t����");
			while (rs.next()) {
				System.out.print(rs.getInt("bookid") + "\t");
				System.out.print(rs.getString("bookname") + "\t");
				System.out.print(rs.getString("publisher") + "\t");
				System.out.println(rs.getInt("price"));
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				psmt.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}

}
