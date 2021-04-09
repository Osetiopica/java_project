package com.ict07.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

//	��ü ������ : ObjectInputStream : readObject()
public class Ex25_input {
	public static void main(String[] args) {
//		��ü ������ȭ : ����ȭ�� �����̳� ������ ���� ���·� ����

		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "ict09.ser";
		File file = new File(pathname);

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);

//			������
			ArrayList<Ex25_vo> list = (ArrayList<Ex25_vo>) ois.readObject();
			
//			����, ����
//			�÷��� -> �迭�� �����ؼ� ����
//			Ex25_vo[] arr = (Ex25_vo[]) list.toArray(); // ����
//			Ex25_vo t = new Ex25_vo();
//			for (int i = 0; i < arr.length - 1; i++) {
//				for (int j = i + 1; j < arr.length; j++) {
//					if (arr[i].getSum() < arr[j].getSum()) {
//						t = arr[i];
//						arr[i] = arr[j];
//						arr[j] = t;
//					}
//				}
//			}

//			for�� or Iterator ���
			System.out.println("�̸�\t����\t���\t����");
			for (Ex25_vo e : list) {
				System.out.print(e.getName() + "\t");
				System.out.print(e.getSum() + "\t");
				System.out.print(e.getAvg() + "\t");
				System.out.print(e.getHak() + "\t");
				System.out.println();
			}
//			System.out.println("�̸�\t����\t���\t����");
//			for (Ex25_vo e : arr) {
//				System.out.print(e.getName() + "\t");
//				System.out.print(e.getSum() + "\t");
//				System.out.print(e.getAvg() + "\t");
//				System.out.print(e.getHak() + "\t");
//				System.out.println();
//			}

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
