package com.ict11.ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex03_DAO {

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	int result = 0;

//	�̱��� ���� : SW ������ ���Ͽ� ����ϴ� ���� �� �ϳ�
//	�����ڰ� ���� ���� ȣ��Ǵ��� ���� �����Ǵ� ��ü�� �ϳ��̰�
//	���� ���� ���Ŀ��� ȣ��� �����ڴ� ������ �����ڰ� ������ ��ü�� ������
//	��ǥ������ Spring�� �⺻������ �̱��� ������ �����
	private static Ex03_DAO dao = new Ex03_DAO();
	public static Ex03_DAO getInstance() {
		return dao;
	}

	public Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@203.236.220.95:1521:xe";
			String user = "c##snow";
			String password = "1230";
			conn = DriverManager.getConnection(url, user, password);
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void getSelect(int id) {
		try {
			conn=getConnection();
			String sql = "select * from book where bookid=?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, id);
			rs = psmt.executeQuery();
			System.out.println("��ȣ\t������\t���ǻ�\t����");
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

	public void getInsert(int bookid, String bookname, String publisher, int price) {
		try {
			conn=getConnection();
			String sql = "insert into book values(?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, bookid);
			psmt.setString(2, bookname);
			psmt.setString(3, publisher);
			psmt.setInt(4, price);
			result = psmt.executeUpdate();
			if (result != 0) {
				getList();
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

	public void getUpdate(int bookid, String bookname, String publisher, int price) {
		try {
			conn=getConnection();
			String sql = "update book set bookname=?, publisher=?, price=? where bookid=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, bookname);
			psmt.setString(2, publisher);
			psmt.setInt(3, price);
			psmt.setInt(4, bookid);
			result = psmt.executeUpdate();
			if (result != 0) {
				getList();
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

	public void getDelete(int bookid) {
		try {
			conn=getConnection();
			String sql = "delete from book where bookid=?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, bookid);
			result = psmt.executeUpdate();
			if (result != 0) {
				getList();
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

	public void getList() {
		try {
			conn=getConnection();
			String sql = "select * from book order by bookid";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			System.out.println("��ȣ\t������\t\t\t���ǻ�\t\t����");
			while (rs.next()) {
				System.out.print(rs.getInt("bookid") + "\t");
				System.out.print(rs.getString("bookname") + "\t\t\t");
				System.out.print(rs.getString("publisher") + "\t\t");
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
