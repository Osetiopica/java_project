package com.ict07.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex18 {
	public static void main(String[] args) {
//		BufferedReader : 속도 향상 위해 사용, 한 줄씩 읽는 메소드 있음

		String pathname = "c:" + File.separator + "study" + File.separator + "util" + File.separator + "ict06.txt";
		File file = new File(pathname);
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);

//			한 글자 읽기
//			int c = br.read();
//			System.out.println(c + " : " + (char) c);

//			전체 읽기
//			int s = 0;
//			while ((s = br.read()) != -1) {
//				System.out.print((char) s);
//			}

//			char[] 이용
//			char[] c = new char[(int) file.length()];
//			br.read(c);
//			for (char i : c) {
//				System.out.print(i);
//			}

//			String 이용
//			char[] c = new char[(int) file.length()];
//			br.read(c);
//			String s = new String(c);
//			System.out.println(s);

//			한 줄 읽기
//			String s = br.readLine();
//			System.out.println(s);

//			모두 읽기
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
