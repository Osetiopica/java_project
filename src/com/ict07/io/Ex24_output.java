package com.ict07.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//	��ü ����ȭ : ObjectOutputStream : writeObject()
public class Ex24_output {
	public static void main(String[] args) {
//		����ȭ : Ư�� Ŭ������ ��ü�� ���� Ư�� ��ġ�� .ser�� ����
//		��ü���� ���� ������ ����ȭ �Ǿ� ����(����� ���� �� ����)

		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "ict08.ser";
		File file = new File(pathname);

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);

//			��ü ����ȭ�� ���� ��ü ����
			Ex24_vo vo1 = new Ex24_vo("�浿", 44, 54.5, true);
			Ex24_vo vo2 = new Ex24_vo("����", 33, 46.1, true);
			Ex24_vo vo3 = new Ex24_vo("��", 3, 5.6, false);
			Ex24_vo vo4 = new Ex24_vo("����", 22, 28.2, true);
			Ex24_vo vo5 = new Ex24_vo("��ġ", 11, 15.8, false);
			
//			��ü�� �迭�̳� �÷��ǿ� ���� �� ����
			ArrayList<Ex24_vo> list= new ArrayList<Ex24_vo>();
			list.add(vo1);
			list.add(vo2);
			list.add(vo3);
			list.add(vo4);
			list.add(vo5);
			
//			��ü ����ȭ
			oos.writeObject(list);
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
