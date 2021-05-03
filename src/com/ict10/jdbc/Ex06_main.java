package com.ict10.jdbc;

import java.util.Scanner;

public class Ex06_main {

	public static void main(String[] args) {

		esc: while (true) {
			Scanner sc = new Scanner(System.in);
			Ex05_DAO dao = new Ex05_DAO();
			System.out.print("�˻�(1), ����(2), ����(3), ����(4) >> ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("�˻��� IDX �Է� >> ");
				int idx_sel = sc.nextInt();
				dao.select(idx_sel);
				break;
			case 2:
				System.out.print("������ bookid �Է� >> ");
				int bookid_i = sc.nextInt();
				System.out.print("bookname �Է� >> ");
				String bookname_i = sc.next();
				System.out.print("publisher �Է� >> ");
				String publisher_i = sc.next();
				System.out.print("price �Է� >> ");
				int price_i = sc.nextInt();
				dao.insert(bookid_i, bookname_i, publisher_i, price_i);
				break;
			case 3:
				System.out.print("������ bookid �Է� >> ");
				int bookid_in = sc.nextInt();
				System.out.print("bookname �Է� >> ");
				String bookname_in = sc.next();
				System.out.print("publisher �Է� >> ");
				String publisher_in = sc.next();
				System.out.print("price �Է� >> ");
				int price_in = sc.nextInt();
				dao.update(bookid_in, bookname_in, publisher_in, price_in);
				break;
			case 4:
				System.out.print("������ IDX �Է� >> ");
				int idx_del = sc.nextInt();
				dao.delete(idx_del);
				break;

			default:
				System.out.println("�ٽ� �Է�");
				continue;
			}
			while (true) {
				System.out.print("���?(y/n) >> ");
				String msg = sc.next();
				if (msg.equalsIgnoreCase("y")) {
					continue esc;
				} else if (msg.equalsIgnoreCase("n")) {
					break esc;
				} else {
					System.out.println("�ٽ� �Է�");
					continue;
				}

			}
		}
		Ex05_DAO dao = new Ex05_DAO();
		dao.getList();

	}
}