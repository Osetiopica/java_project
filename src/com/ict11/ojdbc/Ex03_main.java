package com.ict11.ojdbc;

import java.util.Scanner;

public class Ex03_main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Ex03_DAO dao = Ex03_DAO.getInstance();
		esc: while (true) {
			dao.getList();
			System.out.print("검색(1), 삽입(2), 수정(3), 삭제(4) >> ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("검색할 IDX 입력 >> ");
				int idx_sel = sc.nextInt();
				dao.getSelect(idx_sel);
				break;
			case 2:
				System.out.print("삽입할 bookid 입력 >> ");
				int bookid_i = sc.nextInt();
				System.out.print("bookname 입력 >> ");
				String bookname_i = sc.next();
				System.out.print("publisher 입력 >> ");
				String publisher_i = sc.next();
				System.out.print("price 입력 >> ");
				int price_i = sc.nextInt();
				dao.getInsert(bookid_i, bookname_i, publisher_i, price_i);
				break;
			case 3:
				System.out.print("수정할 bookid 입력 >> ");
				int bookid_in = sc.nextInt();
				System.out.print("bookname 입력 >> ");
				String bookname_in = sc.next();
				System.out.print("publisher 입력 >> ");
				String publisher_in = sc.next();
				System.out.print("price 입력 >> ");
				int price_in = sc.nextInt();
				dao.getUpdate(bookid_in, bookname_in, publisher_in, price_in);
				break;
			case 4:
				System.out.print("삭제할 IDX 입력 >> ");
				int idx_del = sc.nextInt();
				dao.getDelete(idx_del);
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
		dao.getList();
		sc.close();
	}
}