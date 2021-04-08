package com.ict07.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) {
//	속도 향상을 위해 BufferedOutStream을 사용	
//	혼자선 쓸 수 없고 반드시 OutputStream을 받아서 사용
//	생성자 : BufferedOutputStream(OutputStream out)
//	

		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "ict02.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
//			이미 파일이 있으면 덮어쓰기, 없으면 생성
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);

//			한 글자 쓰기
			bos.write(65);
			bos.write(97);

//			int라 char 넣을 수 있음
			bos.write('j');
			bos.write('a');
			bos.write('v');
			bos.write('a');

//			자바에서 줄바꿈 13(Carriage return = CR = \r)
//			다른 언어 중에는 (\r\n(Line feed = 10)를 같이 사용하는 경우도 있음
			bos.write(13);

//			배열을 이용해서 여러 글자 쓰기
			byte[] b = { 'H', 'i', 'J', 'A', 'V', 'A', 13 };
			bos.write(b);

//			String를 이용(영어 외의 문자도 가능)
			String str = "Hello\r안녕\r123\r大韓";
			byte[] b2 = str.getBytes();
			bos.write(b2);

			bos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}