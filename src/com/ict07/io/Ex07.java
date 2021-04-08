package com.ict07.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) {

//		FileInputStream : 파일을 대상으로 1byte씩 데이터를 읽는 스트림
//		생성자 : FileInputStream(File file), FileInputStream(String name)
//		 ㄴFile file, String name -> 특정위치 + 파일이름
//		주요 메소드 :
//		read() : int -> 결과가 숫자(아스키코드)로 나옴, char형으로 변환해야 문자가 됨
//		 ㄴ더 이상 읽을 수 없으면 -1이 나옴, 비 영어권 문자는 읽을 수 없음
//		read(byte[] b) : int -> 배열을 만들어 인자에 넣으면 배열 크기만큼 문자를 읽을 수 있음
//		 ㄴbyte[] b에 읽을 문자들이 배열 크기만큼 저장됨
//		close() : 열린 스트림 닫기(사용 후 닫기), 보통 finally에서 처리

		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "ict01.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);

//			한 글자 읽기 : read() -> 숫자(아스키코드) -> 형변환
//			int s = fis.read();
//			System.out.println(s + " : " + (char) s);

//			한 글자씩 계속 읽기 : 그림, 소리, 영상, 파일을 이 방식 사용, 비 영어권 문자는 읽을 수 없음
//			int s = 0;
//			while (true) {
//				s = fis.read();
//				if (s == -1) {
//					break;
//				}
//				System.out.println(s + " : " + (char) s);
//			}

//			↓ 실전 압축
//			int s = 0;
//			while ((s = fis.read()) != -1) {
//				System.out.println(s + " : " + (char) s);
//			}

//			배열 이용 -> 비영어권 사용 불가
//			byte[] b = new byte[(int) file.length()];
//			fis.read(b);
//			for (byte c : b) {
//				System.out.println(c + " : " + (char) c);
//			}

//			String을 이용하면 영어 외에도 가능
//			String 생성자에 byte[]를 받는 것이 있음
			byte[] b = new byte[(int) file.length()];
			fis.read(b);
			String s = new String(b);
			System.out.println(s);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}