package com.ict07.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

//	객체 역직렬 : ObjectInputStream : readObject()
public class Ex24_input {
	public static void main(String[] args) {
//		객체 역직렬화 : 직렬화된 파일이나 정보를 원래 형태로 복원

		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "ict08.ser";
		File file = new File(pathname);

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);

//			역직렬
			ArrayList<Ex24_vo> list = (ArrayList<Ex24_vo>) ois.readObject();

//			for문 or Iterator 사용
			System.out.println("이름\t나이\t몸무게\t성별");
			for (Ex24_vo e : list) {
				System.out.print(e.getName() + "\t");
				System.out.print(e.getAge() + "\t");
				System.out.print(e.getWeight() + "\t");
				if (e.isGender()) {
					System.out.println("남");
				} else {
					System.out.println("여");
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
