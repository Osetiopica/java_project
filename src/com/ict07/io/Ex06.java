package com.ict07.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) {
//	�ӵ� ����� ���� BufferedOutStream�� ���	
//	ȥ�ڼ� �� �� ���� �ݵ�� OutputStream�� �޾Ƽ� ���
//	������ : BufferedOutputStream(OutputStream out)
//	

		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "ict02.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
//			�̹� ������ ������ �����, ������ ����
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);

//			�� ���� ����
			bos.write(65);
			bos.write(97);

//			int�� char ���� �� ����
			bos.write('j');
			bos.write('a');
			bos.write('v');
			bos.write('a');

//			�ڹٿ��� �ٹٲ� 13(Carriage return = CR = \r)
//			�ٸ� ��� �߿��� (\r\n(Line feed = 10)�� ���� ����ϴ� ��쵵 ����
			bos.write(13);

//			�迭�� �̿��ؼ� ���� ���� ����
			byte[] b = { 'H', 'i', 'J', 'A', 'V', 'A', 13 };
			bos.write(b);

//			String�� �̿�(���� ���� ���ڵ� ����)
			String str = "Hello\r�ȳ�\r123\r����";
			byte[] b2 = str.getBytes();
			bos.write(b2);

			bos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}