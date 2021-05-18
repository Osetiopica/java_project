package com.ict11.ojdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAO {

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	int result = 0;

	private static DAO dao = new DAO();

	public static DAO getInstance() {
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

	public ArrayList<VO> getSelect(int bookid) {
		ArrayList<VO> list = new ArrayList<VO>();
		try {
			conn = getConnection();
			String sql = "select * from book where bookid=?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, bookid);
			rs = psmt.executeQuery();
			while (rs.next()) {
				VO vo = new VO();
				vo.setBookid(rs.getInt("bookid"));
				vo.setBookname(rs.getString("bookname"));
				vo.setPublisher(rs.getString("publisher"));
				vo.setPrice(rs.getInt("price"));
				list.add(vo);
			}
			return list;
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
		return null;
	}

	public int getInsert(int bookid, String bookname, String publisher, int price) {
		try {
			conn = getConnection();
			String sql = "insert into book values(?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, bookid);
			psmt.setString(2, bookname);
			psmt.setString(3, publisher);
			psmt.setInt(4, price);
			result = psmt.executeUpdate();
			return result;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				psmt.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		return 0;
	}

	public int getUpdate(int bookid, String bookname, String publisher, int price) {
		try {
			conn = getConnection();
			String sql = "update book set bookname=?, publisher=?, price=? where bookid=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, bookname);
			psmt.setString(2, publisher);
			psmt.setInt(3, price);
			psmt.setInt(4, bookid);
			result = psmt.executeUpdate();
			return result;
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
		return 0;
	}

	public int getDelete(int bookid) {
		try {
			conn = getConnection();
			String sql = "delete from book where bookid=?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, bookid);
			result = psmt.executeUpdate();
			return result;
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
		return 0;
	}

	public ArrayList<VO> getList() {
		ArrayList<VO> list = new ArrayList<VO>();
		try {
			conn = getConnection();
			String sql = "select * from book order by bookid";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				VO vo = new VO();
				vo.setBookid(rs.getInt("bookid"));
				vo.setBookname(rs.getString("bookname"));
				vo.setPublisher(rs.getString("publisher"));
				vo.setPrice(rs.getInt("price"));
				list.add(vo);
			}
			return list;
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
		return null;
	}
}
