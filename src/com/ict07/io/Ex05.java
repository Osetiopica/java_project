package com.ict07.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05 {

	public static void main(String[] args) {
//	FileOutputStream : 파일을 대상으로 1byte씩 데이터 쓰기를 할 수 있는 스트림
//	생성자 : FileOutputStream(File file), FileOutputStream(File file, boolean append),
//	 ㄴFileOutputStream(String name), FileOutputStream(String name, boolean append)
//	 ㄴFile file, String name -> 특정 위치, 파일 이름
//	 ㄴboolean append : false나 생략하면 덮어쓰기, true는 이어쓰기
//	주요 메소드 : 
//	write(byte[] b) -> 여러 글자를 byte[]에 넣어서 쓰기 가능
//	flush() -> write 후 반드시 실행	
//	close() -> 열린 스트림 닫기(사용 후 닫기), 보통 finally로 처리

		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "ict01.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		try {
//			이미 파일이 있으면 덮어쓰기, 없으면 생성
			fos = new FileOutputStream(file);
//			이미 파일이 있으면 이어쓰기, 없으면 생성
//			fos = new FileOutputStream(file, true);

//			한 글자 쓰기
			fos.write(65);
			fos.write(97);

//			int라 char 넣을 수 있음
			fos.write('j');
			fos.write('a');
			fos.write('v');
			fos.write('a');

//			자바에서 줄바꿈 13(Carriage return = CR = \r)
//			다른 언어 중에는 (\r\n(Line feed = 10)를 같이 사용하는 경우도 있음
			fos.write(13);

//			배열을 이용해서 여러 글자 쓰기
			byte[] b = { 'b', 'o', 'y', 's', 13, 'g', 'i', 'r', 'l', 's', 13 };
			fos.write(b);

//			String를 이용(영어 외의 문자도 가능)
			String str = "Hello\r안녕\r123\r大韓";
			byte[] b2 = str.getBytes();
			fos.write(b2);

			fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}