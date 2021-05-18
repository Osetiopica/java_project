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
			System.out.print("�˻�(1), ����(2), ����(3), ����(4) >> ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("�˻��� IDX �Է� >> ");
				int s_bookid = sc.nextInt();
				ArrayList<VO> list1 = dao.getSelect(s_bookid);
				ex02.prn(list1);
				break;
			case 2:
				System.out.print("������ bookid �Է� >> ");
				int i_bookid = sc.nextInt();
				System.out.print("bookname �Է� >> ");
				String i_bookname = sc.next();
				System.out.print("publisher �Է� >> ");
				String i_publisher = sc.next();
				System.out.print("price �Է� >> ");
				int i_price = sc.nextInt();
				int res2 = dao.getInsert(i_bookid, i_bookname, i_publisher, i_price);
				if (res2 > 0) {
					System.out.println("���� ����");
				}
				break;
			case 3:
				System.out.print("������ bookid �Է� >> ");
				int u_bookid = sc.nextInt();
				System.out.print("bookname �Է� >> ");
				String u_bookname = sc.next();
				System.out.print("publisher �Է� >> ");
				String u_publisher = sc.next();
				System.out.print("price �Է� >> ");
				int u_price = sc.nextInt();
				int res3 = dao.getUpdate(u_bookid, u_bookname, u_publisher, u_price);
				if (res3 > 0) {
					System.out.println("���� ����");
				}
				break;
			case 4:
				System.out.print("������ IDX �Է� >> ");
				int del_bookid = sc.nextInt();
				int res4 = dao.getDelete(del_bookid);
				if (res4 > 0) {
					System.out.println("���� ����");
				}
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
		ArrayList<VO> list = dao.getList();
		ex02.prn(list);
		dao.getList();
		sc.close();
	}
}