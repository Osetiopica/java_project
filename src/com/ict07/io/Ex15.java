package com.ict07.io;

import java.io.File;
import java.io.FileWriter;

public class Ex15 {
	public static void main(String[] args) {
//		문자 스트림(사람 중심) : 2byte씩 처리
//		대상 : 전세계 언어로 구성된 모든 파일
//		최상위 클래스 : Reader, Writer

//		FileOutputStream(바이트) : 1byte 처리, write(int b), write(byte[] b) : 숫자(아스키코드)
//		FileWriter(문자) : 2byte 처리, write(int b), write(char[] b), write(String str)

		String pathname = "c:" + File.separator + "study" + File.separator + "util" + File.separator + "ict05.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);

//			한 글자 쓰기
			fw.write(97); // a
			fw.write(65); // A

//			int이므로 char로 대체 가능
			fw.write('J');
			fw.write('대'); // FileOutputStream은 안 되지만
			fw.write('한'); // FileWriter는 한글 가능
			fw.write('V');
			fw.write(13);

			char[] c = { 'h', 'a', 'n', 13, '국', 13 };
			fw.write(c);

			fw.write("한국ict인재개발원\n");
			fw.write("1강의실\n");
			
			fw.flush();
		} catch (Exception e) {
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
			}
		}
	}
}
