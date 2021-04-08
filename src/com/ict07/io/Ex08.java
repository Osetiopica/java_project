package com.ict07.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex08 {

	public static void main(String[] args) {
//		�ӵ� ����� ���� BufferedInputStream�� ���
//		Ȧ�� ����� �� ���� InputStream�� �޾� ���
//		������ : BufferedInputStream(InputStream in)

		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "ict01.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);

//			�� ���� �б� : read() -> ����(�ƽ�Ű�ڵ�) -> ����ȯ
//			int s = bis.read();
//			System.out.println(s + " : " + (char) s);

//			�� ���ھ� ��� �б� : �׸�, �Ҹ�, ����, ������ �� ��� ���, �� ����� ���ڴ� ���� �� ����
//			int s = 0;
//			while (true) {
//				s = bis.read();
//				if (s == -1) {
//					break;
//				}
//				System.out.println(s + " : " + (char) s);
//			}

//			�� ���� ����
//			int s = 0;
//			while ((s = bis.read()) != -1) {
//				System.out.println(s + " : " + (char) s);
//			}

//			�迭 �̿� -> �񿵾�� ��� �Ұ�
//			byte[] b = new byte[(int) file.length()];
//			bis.read(b);
//			for (byte c : b) {
//				System.out.println(c + " : " + (char) c);
//			}

//			String�� �̿��ϸ� ���� �ܿ��� ����
//			String �����ڿ� byte[]�� �޴� ���� ����
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