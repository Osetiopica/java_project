package com.ict07.io;

import java.io.File;
import java.io.FileWriter;

public class Ex15 {
	public static void main(String[] args) {
//		���� ��Ʈ��(��� �߽�) : 2byte�� ó��
//		��� : ������ ���� ������ ��� ����
//		�ֻ��� Ŭ���� : Reader, Writer

//		FileOutputStream(����Ʈ) : 1byte ó��, write(int b), write(byte[] b) : ����(�ƽ�Ű�ڵ�)
//		FileWriter(����) : 2byte ó��, write(int b), write(char[] b), write(String str)

		String pathname = "c:" + File.separator + "study" + File.separator + "util" + File.separator + "ict05.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);

//			�� ���� ����
			fw.write(97); // a
			fw.write(65); // A

//			int�̹Ƿ� char�� ��ü ����
			fw.write('J');
			fw.write('��'); // FileOutputStream�� �� ������
			fw.write('��'); // FileWriter�� �ѱ� ����
			fw.write('V');
			fw.write(13);

			char[] c = { 'h', 'a', 'n', 13, '��', 13 };
			fw.write(c);

			fw.write("�ѱ�ict���簳�߿�\n");
			fw.write("1���ǽ�\n");
			
			fw.flush();
		} catch (Exception e) {
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
			}
		}
	}
}
