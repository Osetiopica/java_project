package com.ict07.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex27_output {
	public static void main(String[] args) {

		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "ict11.ser";
		File file = new File(pathname);

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);

			ArrayList<Ex27_vo> list = new ArrayList<Ex27_vo>();

			esc: while (true) {
				Scanner sc = new Scanner(System.in);
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("국어 : ");
				int kor = sc.nextInt();
				System.out.print("영어 : ");
				int eng = sc.nextInt();
				System.out.print("수학 : ");
				int math = sc.nextInt();

				Ex27_vo vo = new Ex27_vo(name, kor, eng, math);

				list.add(vo);
				while (true) {
					System.out.print("계속?(y/n) : ");
					String a = sc.next();
					if (a.equalsIgnoreCase("y")) {
						continue esc;
					} else if (a.equalsIgnoreCase("n")) {
						break esc;
					} else {
						System.out.println("다시 입력");
					}
				}
			}

			oos.writeObject(list);
			oos.flush();

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
