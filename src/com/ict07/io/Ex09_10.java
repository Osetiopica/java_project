package com.ict07.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex09_10 {
	public static void main(String[] args) {
//		 c:\\study\\util\\test100.txt 파일 안에 
//		 이름 : 000
//		 나이 : 00 
//		 전화번호 : 000-0000-0000를
//		 작성하는 코딩을 하시오 

		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "test101.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);

			String s = "test 1";
			byte[] b = s.getBytes();
			

		} catch (Exception e) {
		} finally {
			try {
				bis.close();
				fis.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}

	}
}
