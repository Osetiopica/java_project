package com.ict07.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex17 {
	public static void main(String[] args) {
//		FileInputStream : read() - int(�ƽ�Ű) -> char����ȯ, ����, ���ڸ� ����
//		read(byte[] b), String �̿�
//		FileReader : read() - int(�����ڵ�) -> char����ȯ, ��� ���� ����
//		read(byte[] b), String �̿�

		String pathname = "c:" + File.separator + "study" + File.separator + "util" + File.separator + "ict06.txt";
		File file = new File(pathname);
		FileReader fr = null;
		try {
			fr = new FileReader(file);

//			�� ���� �б�
//			int c = fr.read();
//			System.out.println(c + " : " + (char) c);

//			��ü �б�
//			int s = 0;
//			while ((s = fr.read()) != -1) {
//				System.out.print((char) s);
//			}

//			char[] �̿�
//			char[] c = new char[(int) file.length()];
//			fr.read(c);
//			for (char i : c) {
//				System.out.print(i);
//			}

			char[] c = new char[(int) file.length()];
			fr.read(c);
			String s = new String(c);
			System.out.println(s);

		} catch (Exception e) {
		} finally {
			try {
				fr.close();
			} catch (Exception e2) {
			}
		}
	}
}
