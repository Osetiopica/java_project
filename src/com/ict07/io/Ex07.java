package com.ict07.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) {

//		FileInputStream : ������ ������� 1byte�� �����͸� �д� ��Ʈ��
//		������ : FileInputStream(File file), FileInputStream(String name)
//		 ��File file, String name -> Ư����ġ + �����̸�
//		�ֿ� �޼ҵ� :
//		read() : int -> ����� ����(�ƽ�Ű�ڵ�)�� ����, char������ ��ȯ�ؾ� ���ڰ� ��
//		 ���� �̻� ���� �� ������ -1�� ����, �� ����� ���ڴ� ���� �� ����
//		read(byte[] b) : int -> �迭�� ����� ���ڿ� ������ �迭 ũ�⸸ŭ ���ڸ� ���� �� ����
//		 ��byte[] b�� ���� ���ڵ��� �迭 ũ�⸸ŭ �����
//		close() : ���� ��Ʈ�� �ݱ�(��� �� �ݱ�), ���� finally���� ó��

		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "ict01.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);

//			�� ���� �б� : read() -> ����(�ƽ�Ű�ڵ�) -> ����ȯ
//			int s = fis.read();
//			System.out.println(s + " : " + (char) s);

//			�� ���ھ� ��� �б� : �׸�, �Ҹ�, ����, ������ �� ��� ���, �� ����� ���ڴ� ���� �� ����
//			int s = 0;
//			while (true) {
//				s = fis.read();
//				if (s == -1) {
//					break;
//				}
//				System.out.println(s + " : " + (char) s);
//			}

//			�� ���� ����
//			int s = 0;
//			while ((s = fis.read()) != -1) {
//				System.out.println(s + " : " + (char) s);
//			}

//			�迭 �̿� -> �񿵾�� ��� �Ұ�
//			byte[] b = new byte[(int) file.length()];
//			fis.read(b);
//			for (byte c : b) {
//				System.out.println(c + " : " + (char) c);
//			}

//			String�� �̿��ϸ� ���� �ܿ��� ����
//			String �����ڿ� byte[]�� �޴� ���� ����
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