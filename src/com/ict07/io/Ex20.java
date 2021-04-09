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
//		바이트-문자 결합 : 체인 방식
//		입력 : InputStreamReader : InputStream -> Reader
//		 ㄴInputStream -> InputStreamReader -> Reader -> BufferedReader

//		Scanner sc = new Scanner(System.in);
//		System.out.print("문자 입력 : ");
//		String s = sc.next();
//		System.out.print("받은 문자 : " + s);

		System.out.print("문자 입력 : ");
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			String s = br.readLine();
		System.out.print("받은 문자 : " + s);
			
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
