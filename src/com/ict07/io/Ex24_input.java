package com.ict07.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

//	��ü ������ : ObjectInputStream : readObject()
public class Ex24_input {
	public static void main(String[] args) {
//		��ü ������ȭ : ����ȭ�� �����̳� ������ ���� ���·� ����

		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "ict08.ser";
		File file = new File(pathname);

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);

//			������
			ArrayList<Ex24_vo> list = (ArrayList<Ex24_vo>) ois.readObject();

//			for�� or Iterator ���
			System.out.println("�̸�\t����\t������\t����");
			for (Ex24_vo e : list) {
				System.out.print(e.getName() + "\t");
				System.out.print(e.getAge() + "\t");
				System.out.print(e.getWeight() + "\t");
				if (e.isGender()) {
					System.out.println("��");
				} else {
					System.out.println("��");
				}
			}

		} catch (Exception e) {
		} finally {
			try {
				ois.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
			}
		}
	}
}
