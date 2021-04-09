package com.ict07.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex25_output {
	public static void main(String[] args) {

		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "ict09.ser";
		File file = new File(pathname);

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;

		ArrayList<Ex25_vo> list = new ArrayList<Ex25_vo>();

		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			esc: while (true) {
				Scanner sc = new Scanner(System.in);
				System.out.print("�̸� : ");
				String name = sc.next();
				System.out.print("���� : ");
				int kor = sc.nextInt();
				System.out.print("���� : ");
				int eng = sc.nextInt();
				System.out.print("���� : ");
				int math = sc.nextInt();

//			��ü ����ȭ�� ���� ��ü ����
				Ex25_vo vo = new Ex25_vo(name, kor, eng, math);

//			��ü�� �迭�̳� �÷��ǿ� ���� �� ����
				list.add(vo);
				while (true) {
					System.out.print("���?(y/n) : ");
					String a = sc.next();
					if (a.equalsIgnoreCase("y")) {
						continue esc;
					} else if (a.equalsIgnoreCase("n")) {
						break esc;
					} else {
						System.out.println("�ٽ� �Է�");
					}
				}
			}
//			��ü ����ȭ
			oos.writeObject(list);
			oos.flush();

		} catch (Exception e) {
		} finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}
	}
}
