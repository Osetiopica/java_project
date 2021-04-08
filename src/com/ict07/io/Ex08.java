package com.ict07.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex08 {

	public static void main(String[] args) {
//		속도 향상을 위해 BufferedInputStream을 사용
//		홀로 사용할 수 없고 InputStream을 받아 사용
//		생성자 : BufferedInputStream(InputStream in)

		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "ict01.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);

//			한 글자 읽기 : read() -> 숫자(아스키코드) -> 형변환
//			int s = bis.read();
//			System.out.println(s + " : " + (char) s);

//			한 글자씩 계속 읽기 : 그림, 소리, 영상, 파일을 이 방식 사용, 비 영어권 문자는 읽을 수 없음
//			int s = 0;
//			while (true) {
//				s = bis.read();
//				if (s == -1) {
//					break;
//				}
//				System.out.println(s + " : " + (char) s);
//			}

//			↓ 실전 압축
//			int s = 0;
//			while ((s = bis.read()) != -1) {
//				System.out.println(s + " : " + (char) s);
//			}

//			배열 이용 -> 비영어권 사용 불가
//			byte[] b = new byte[(int) file.length()];
//			bis.read(b);
//			for (byte c : b) {
//				System.out.println(c + " : " + (char) c);
//			}

//			String을 이용하면 영어 외에도 가능
//			String 생성자에 byte[]를 받는 것이 있음
			byte[] b = new byte[(int) file.length()];
			bis.read(b);
			String s = new String(b);
			System.out.println(s);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}