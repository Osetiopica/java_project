package com.ict07.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex11 {
	public static void main(String[] args) {
//		c:\\study\\util\\java_1.jpg ������ 
//		c:\\study\\util\\res\\ �ȿ� �����ϱ�

//		�д� ��ġ
		String pathname1 = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "java_1.jpg";
		File read_file = new File(pathname1);

//		���� ��ġ
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

//			����, ���� ���� ������ ó��(����, �̵�) �ÿ� 1byte��
			int f = 0;
			while ((f = bis.read()) != -1) { // 1byte �б�
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
