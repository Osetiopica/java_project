package com.ict07.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex18 {
	public static void main(String[] args) {
//		BufferedReader : �ӵ� ��� ���� ���, �� �پ� �д� �޼ҵ� ����

		String pathname = "c:" + File.separator + "study" + File.separator + "util" + File.separator + "ict06.txt";
		File file = new File(pathname);
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);

//			�� ���� �б�
//			int c = br.read();
//			System.out.println(c + " : " + (char) c);

//			��ü �б�
//			int s = 0;
//			while ((s = br.read()) != -1) {
//				System.out.print((char) s);
//			}

//			char[] �̿�
//			char[] c = new char[(int) file.length()];
//			br.read(c);
//			for (char i : c) {
//				System.out.print(i);
//			}

//			String �̿�
//			char[] c = new char[(int) file.length()];
//			br.read(c);
//			String s = new String(c);
//			System.out.println(s);

//			�� �� �б�
//			String s = br.readLine();
//			System.out.println(s);

//			��� �б�
			String s = null;
			StringBuffer sb = new StringBuffer();
			while ((s = br.readLine()) != null) {
				sb.append(s + "\n");
			}
			System.out.println(sb.toString());

		} catch (Exception e) {
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
			}
		}
	}
}
