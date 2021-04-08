package com.ict07.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Ex16 {
	public static void main(String[] args) {
//		BufferedWrite : �ӵ� ���� ���� �޼ҵ尡 ����

		String pathname = "c:" + File.separator + "study" + File.separator + "util" + File.separator + "ict06.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

//			�� ���� ����
			bw.write(97); // a
			bw.write(65); // A
			bw.newLine();

//			int�̹Ƿ� char�� ��ü ����
			bw.write('J');
			bw.write('��'); // FileOutputStream�� �� ������
			bw.write('��'); // FileWriter�� �ѱ� ����
			bw.write('V');
			bw.newLine();

			char[] c = { 'h', 'a', 'n', 13, '��' };
			bw.write(c);
			bw.newLine();

			bw.write("�ѱ�ict���簳�߿�");
			bw.newLine();
			bw.write("1���ǽ�");
			bw.newLine();

			bw.flush();
		} catch (Exception e) {
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (Exception e2) {
			}
		}
	}
}
