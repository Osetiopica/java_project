package com.ict07.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Ex16 {
	public static void main(String[] args) {
//		BufferedWrite : 속도 향상과 개행 메소드가 존재

		String pathname = "c:" + File.separator + "study" + File.separator + "util" + File.separator + "ict06.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

//			한 글자 쓰기
			bw.write(97); // a
			bw.write(65); // A
			bw.newLine();

//			int이므로 char로 대체 가능
			bw.write('J');
			bw.write('대'); // FileOutputStream은 안 되지만
			bw.write('한'); // FileWriter는 한글 가능
			bw.write('V');
			bw.newLine();

			char[] c = { 'h', 'a', 'n', 13, '국' };
			bw.write(c);
			bw.newLine();

			bw.write("한국ict인재개발원");
			bw.newLine();
			bw.write("1강의실");
			bw.newLine();

			bw.flush();
		} catch (Exception e) {
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (Exception e2) {
			}
		}
	}
}
