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
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
//		����Ʈ-���� ���� : ü�� ���
//		�Է� : InputStreamReader : InputStream -> Reader
//		 ��InputStream -> InputStreamReader -> Reader -> BufferedReader

//		Scanner sc = new Scanner(System.in);
//		System.out.print("���� �Է� : ");
//		String s = sc.next();
//		System.out.print("���� ���� : " + s);

		System.out.print("���� �Է� : ");
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			String s = br.readLine();
		System.out.print("���� ���� : " + s);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				isr.close();
			} catch (Exception e2) {
			}
		}

	}
}
