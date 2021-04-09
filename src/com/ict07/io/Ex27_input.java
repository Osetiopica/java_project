package com.ict07.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ex27_input {
	public static void main(String[] args) {

		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "ict11.ser";
		File file = new File(pathname);

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);

			ArrayList<Ex27_vo> list = (ArrayList<Ex27_vo>) ois.readObject();

			for (Ex27_vo e : list) {
				e.setSum(e.getKor() + e.getEng() + e.getMath());
				e.setAvg((int) (e.getSum() / 3.0 * 10) / 10);
				if (e.getAvg() >= 90) {
					e.setHak("A");
				} else if (e.getAvg() >= 80) {
					e.setHak("B");
				} else if (e.getAvg() >= 70) {
					e.setHak("C");
				} else {
					e.setHak("D");
				}
			}

			System.out.println("¿Ã∏ß\t√—¡°\t∆Ú±’\t«–¡°");
			for (Ex27_vo e : list) {
				System.out.print(e.getName() + "\t");
				System.out.print(e.getSum() + "\t");
				System.out.print(e.getAvg() + "\t");
				System.out.print(e.getHak() + "\t");
				System.out.println();
			}

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
