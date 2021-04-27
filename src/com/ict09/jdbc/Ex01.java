package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex01 {

	public static void main(String[] args) {
//		JDBC(Java Database Connectivity)는 자바에서 데이터베이스에 접속할 수 있도록 하는 자바 API이다.
//		JDBC는 DB에서 자료를 쿼리하거나 업데이트하는 방법을 제공
//		각 DB들에게 접속할 수 있는 JDBC 드라이버가 필요
//		MySQL에 필요한 드라이버를 다운 받아서 해당 프로젝트에 참조해야 함
//		프로젝트 우클릭 - build path - add external jars - 라이브러리 선택

//		DB 처리에 필요한 class 3개 선언
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null; // select 문의 결과를 받음
		int result = 0; // insert, update, delete의 결과
		try {
//			1. driver 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
//			2. 접속을 위한 정보
			String url = "jdbc:mysql://localhost:3306/test01db?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "test01";
			String password = "1230";
			conn = DriverManager.getConnection(url, user, password);
//			3. 쿼리문 작성
			String sql = "select * from customer";
//			4. DB 접속을 Statement 클래스에 저장
			stmt = conn.createStatement();
//			5. Statement 클래스에 쿼리 저장 후 
//			DB의 결과를 받아옴 -> select 문일 때와 아닐 때로 나뉨
//			select 문일 때는 ResultSet 클래스가 받음
			rs = stmt.executeQuery(sql);
//			select 문이 아닐 때는 int로 받음
//			result = stmt.executeUpdate(sql);
//			6. 다음 줄에 정보가 있으면 true
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