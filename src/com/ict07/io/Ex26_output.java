package com.ict07.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ex26_output {
	public static void main(String[] args) {

		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "ict10.ser";
		File file = new File(pathname);

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);

//			��ü ����ȭ�� ���� ��ü ����
			Ex26_vo vo1 = new Ex26_vo("�浿", 44, 54.5, true);
			
//			��ü ����ȭ
			oos.writeObject(vo1);
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
