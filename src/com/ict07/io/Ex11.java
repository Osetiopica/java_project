package com.ict07.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex11 {
	public static void main(String[] args) {
//		c:\\study\\util\\java_1.jpg 파일을 
//		c:\\study\\util\\res\\ 안에 복사하기

//		읽는 위치
		String pathname1 = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "java_1.jpg";
		File read_file = new File(pathname1);

//		쓰는 위치
		String pathname2 = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "res"
				+ File.separator + "java_1.jpg";
		File write_file = new File(pathname2);

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream(read_file);
			bis = new BufferedInputStream(fis);

			fos = new FileOutputStream(write_file);
			bos = new BufferedOutputStream(fos);

			bos.write(bis.read());

//			음악, 영상 등의 파일을 처리(복사, 이동) 시엔 1byte씩
			int f = 0;
			while ((f = bis.read()) != -1) { // 1byte 읽기
				bos.write(f);
			}
			bos.flush();
		} catch (Exception e) {
		} finally {
			try {
				bos.close();
				fos.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
			}
		}

	}
}
