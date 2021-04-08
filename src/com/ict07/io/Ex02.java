package com.ict07.io;

import java.io.File;
import java.text.SimpleDateFormat;

public class Ex02 {

	public static void main(String[] args) {
//		File Ŭ������ ����ϱ� ���� Ư�� ��ġ�� ����
		String pathname_1 = "C:\\study\\util"; // OS�� Windows�� ��
		String pathname_2 = "C:/study/util"; // OS�� Linux, Unix�� ��

//		OS ������� ���� ��
		String pathname_3 = "C:" + File.separator + "study" + File.separator + "util";

//		������ ���� ��¥
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");

		File file = new File(pathname_3);
		String[] arr = file.list();
		for (String s : arr) {
//			System.out.println(s);
			File file2 = new File(pathname_3, s);
//			System.out.println(file2);

			if (file2.isDirectory()) {
				System.out.println("���丮 : " + file2);
			} else {
				System.out.println("���� : " + file2 + 
						" | ũ�� : " + (int) (file2.length() / 1024) + 
						"KB | ������ ��¥ : " + sdf.format(file2.lastModified()));
			}
		}
	}

}