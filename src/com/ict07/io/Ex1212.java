package com.ict07.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex1212 {
	public static void main(String[] args) {
//		c:\\study\\util\\java_1.jpg 파일을 
//		c:\\study\\util\\res\\ 안에 이동하기

		String path1 = "c:" + File.separator + "study" + File.separator + "util" + File.separator + "java_2.jpg";
		File file1 = new File(path1);
		String path2 = "c:" + File.separator + "study" + File.separator + "util" + File.separator + "res"
				+ File.separator + "java_2_3.jpg";
		File file2 = new File(path2);

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {
			fis = new FileInputStream(file1);
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream(file2);
			bos = new BufferedOutputStream(fos);

			int f = 0;
			while ((f = bis.read()) != -1) {
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
