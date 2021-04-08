package com.ict07.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex17 {
	public static void main(String[] args) {
//		FileInputStream : read() - int(아스키) -> char형변환, 영어, 숫자만 가능
//		read(byte[] b), String 이용
//		FileReader : read() - int(유니코드) -> char형변환, 모든 문자 가능
//		read(byte[] b), String 이용

		String pathname = "c:" + File.separator + "study" + File.separator + "util" + File.separator + "ict06.txt";
		File file = new File(pathname);
		FileReader fr = null;
		try {
			fr = new FileReader(file);

//			한 글자 읽기
//			int c = fr.read();
//			System.out.println(c + " : " + (char) c);

//			전체 읽기
//			int s = 0;
//			while ((s = fr.read()) != -1) {
//				System.out.print((char) s);
//			}

//			char[] 이용
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
