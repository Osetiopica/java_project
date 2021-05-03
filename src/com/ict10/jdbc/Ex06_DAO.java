package com.ict10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex06_DAO {

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int result = 0;

//	싱글턴 패턴 : SW 디자인 패턴에 사용하는 패턴 중 하나
//	생성자가 여러 차례 호출되더라도 실제 생성되는 객체는 하나이고
//	최초 생성 이후에는 호출된 생성자는 최초의 생성자가 생성한 객체를 리턴함
//	대표적으로 Spring이 기본적으로 싱글턴 패턴을 사용함
	private static Ex06_DAO dao = new Ex06_DAO();
	public static Ex06_DAO getInstance() {
		return dao;
	}

	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/test01db?charactorEncoding=utf-8&serverTimezone=UTC";
			String user = "test01";
			String password = "1230";
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public void select(int id) {
		try {
			String sql = "select * from book where bookid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			System.out.println("도서번호\t도서명\t출판사\t가격");
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
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}

	}

	public void insert(int bookid, String bookname, String publisher, int price) {
		try {
			String sql = "insert into book values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bookid);
			pstmt.setString(2, bookname);
			pstmt.setString(3, publisher);
			pstmt.setInt(4, price);
			result = pstmt.executeUpdate();
			if (result != 0) {
				getList();
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

	public void update(int bookid, String bookname, String publisher, int price) {
		try {
			String sql = "update book set bookname=?, publisher=?, price=? where bookid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bookname);
			pstmt.setString(2, publisher);
			pstmt.setInt(3, price);
			pstmt.setInt(4, bookid);
			result = pstmt.executeUpdate();
			if (result != 0) {
				getList();
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

	public void delete(int bookid) {
		try {
			String sql = "delete from book where bookid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bookid);
			result = pstmt.executeUpdate();
			if (result != 0) {
				getList();
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

	public void getList() {
		try {
			String sql = "select * from book order by bookid";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("도서번호\t도서명\t출판사\t가격");
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
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
