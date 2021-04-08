package com.ict07.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
//		c:\\study\\util\\java_1.jpg ������ 
//		c:\\study\\util\\res\\ �ȿ� �̵��ϱ�

//		���� ��ҿ� ���ϸ��� �ް� ���� ��ҿ� ���ϸ��� �޾Ƽ� �ٿ��ֱ�

		Scanner sc = new Scanner(System.in);
		System.out.print("������ ��� : ");
		String path1 = sc.next();
		System.out.print("�ٿ����� ��� : ");
		String path2 = sc.next();

		File read = new File(path1);
		File write = new File(path2);

		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fr = new FileReader(read);
			br = new BufferedReader(fr);

			String s = null;
			StringBuffer sb = new StringBuffer();
			while ((s = br.readLine()) != null) {
				sb.append(s + "\n");
			}

			fw = new FileWriter(write);
			bw = new BufferedWriter(fw);
			String str = sb.toString();
			s = str.replace("����", "�α�");
			bw.write(s);
			bw.flush();

		} catch (Exception e) {
		} finally {
			try {
				bw.close();
				fw.close();
				br.close();
				fr.close();
			} catch (Exception e2) {
			}
		}

	}
}
