package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
//		데이터 받아서 VO에 넣기
		Scanner sc = new Scanner(System.in);
		ArrayList<VO> list = new ArrayList<VO>();

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

			esc: while (true) {
				System.out.print("학번: ");
				int no = sc.nextInt();
				System.out.print("이름: ");
				String name = sc.next();
				System.out.print("학과: ");
				String det = sc.next();
				System.out.print("주소: ");
				String addr = sc.next();
				System.out.print("전화: ");
				String tel = sc.next();
				
				list.add(new VO(no, name, det, addr, tel));
				while (true) {
					System.out.println("계속?");
					String msg = sc.next();
					if (msg.equalsIgnoreCase("y")) {
						continue esc;
					} else if (msg.equalsIgnoreCase("n")) {
						break esc;
					} else {
						continue;
					}
				}
			}
//			for (VO vo : list) {
//				String sql = "insert into student_tb(no, name, det, addr, tel) " 
//						+ "values" + "("
//						+vo.getNo()+",'"
//						+vo.getName()+"','"
//						+vo.getDet()+"','"
//						+vo.getAddr()+"','"
//						+vo.getTel()+"')";
//				result = stmt.executeUpdate(sql);
//				if (result <= 0) {
//					System.out.println("error");
//				}
//			}
			for (int i = 0; i < list.size(); i++) {
				String sql = "insert into student_tb(no, name, det, addr, tel) " 
						+ "values" + "("
						+list.get(i).getNo()+",'"
						+list.get(i).getName()+"','"
						+list.get(i).getDet()+"','"
						+list.get(i).getAddr()+"','"
						+list.get(i).getTel()+"')";
				result = stmt.executeUpdate(sql);
				if (result <= 0) {
					System.out.println("error");
				}
			}
			String sql = "select * from student_tb";
			rs = stmt.executeQuery(sql);
			System.out.println("번호\t이름\t학과\t주소\t전화");
			while (rs.next()) {
				System.out.print(rs.getInt("no") + "\t");
				System.out.print(rs.getString("name") + "\t");
				System.out.print(rs.getString("det") + "\t");
				System.out.print(rs.getString("addr") + "\t");
				System.out.println(rs.getString("tel"));
			}
		} catch (Exception e) {
			System.out.println("error " + e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println("error " + e2);
			}
		}
	}

}