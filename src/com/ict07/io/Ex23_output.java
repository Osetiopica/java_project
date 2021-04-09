package com.ict07.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

//	��ü ����ȭ : ObjectOutputStream : writeObject()
public class Ex23_output {
	public static void main(String[] args) {
//		����ȭ : Ư�� Ŭ������ ��ü�� ���� Ư�� ��ġ�� .ser�� ����
//		��ü���� ���� ������ ����ȭ �Ǿ� ����(����� ���� �� ����)

		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "ict07.ser";
		File file = new File(pathname);

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);

//			��ü ����ȭ�� ���� ��ü ����
			Ex23_vo vo = new Ex23_vo("�Ѹ�", 28, 34.5, true);
			
//			��ü ����ȭ
			oos.writeObject(vo);
			oos.flush();
			
		} catch (Exception e) {
		} finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}
	}
}
