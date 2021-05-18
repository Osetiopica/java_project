package com.ict11.ojdbc2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Ex02 ex02 = new Ex02();
		DAO dao = DAO.getInstance();
		esc: while (true) {
			ArrayList<VO> list = dao.getList();
			ex02.prn(list);
			System.out.print("검색(1), 삽입(2), 수정(3), 삭제(4) >> ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("검색할 IDX 입력 >> ");
				int s_bookid = sc.nextInt();
				ArrayList<VO> list1 = dao.getSelect(s_bookid);
				ex02.prn(list1);
				break;
			case 2:
				System.out.print("삽입할 bookid 입력 >> ");
				int i_bookid = sc.nextInt();
				System.out.print("bookname 입력 >> ");
				String i_bookname = sc.next();
				System.out.print("publisher 입력 >> ");
				String i_publisher = sc.next();
				System.out.print("price 입력 >> ");
				int i_price = sc.nextInt();
				int res2 = dao.getInsert(i_bookid, i_bookname, i_publisher, i_price);
				if (res2 > 0) {
					System.out.println("삽입 성공");
				}
				break;
			case 3:
				System.out.print("수정할 bookid 입력 >> ");
				int u_bookid = sc.nextInt();
				System.out.print("bookname 입력 >> ");
				String u_bookname = sc.next();
				System.out.print("publisher 입력 >> ");
				String u_publisher = sc.next();
				System.out.print("price 입력 >> ");
				int u_price = sc.nextInt();
				int res3 = dao.getUpdate(u_bookid, u_bookname, u_publisher, u_price);
				if (res3 > 0) {
					System.out.println("갱신 성공");
				}
				break;
			case 4:
				System.out.print("삭제할 IDX 입력 >> ");
				int del_bookid = sc.nextInt();
				int res4 = dao.getDelete(del_bookid);
				if (res4 > 0) {
					System.out.println("삭제 성공");
				}
				break;

			default:
				System.out.println("다시 입력");
				continue;
			}
			while (true) {
				System.out.print("계속?(y/n) >> ");
				String msg = sc.next();
				if (msg.equalsIgnoreCase("y")) {
					continue esc;
				} else if (msg.equalsIgnoreCase("n")) {
					break esc;
				} else {
					System.out.println("다시 입력");
					continue;
				}

			}
		}
		ArrayList<VO> list = dao.getList();
		ex02.prn(list);
		dao.getList();
		sc.close();
	}
}