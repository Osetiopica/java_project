package com.ict07.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

//	��ü ������ : ObjectInputStream : readObject()
public class Ex26_input {
	public static void main(String[] args) {
//		��ü ������ȭ : ����ȭ�� �����̳� ������ ���� ���·� ����

		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "ict10.ser";
		File file = new File(pathname);

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);

//			������
			Ex26_vo vo = (Ex26_vo) ois.readObject();
 
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getAge() + "\t");
			System.out.print(vo.getWeight() + "\t");
			System.out.println(vo.isGender());

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				ois.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
