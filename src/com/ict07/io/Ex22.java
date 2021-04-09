package com.ict07.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex22 {
	public static void main(String[] args) {

		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		InputStreamReader isr = null;
		BufferedReader br = null;

		try {
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			bw.write("문자 입력 : ");
			bw.flush();
			String s = br.readLine();
//			Integer.parseInt(s);
			bw.write("문자 출력 : " + s);
			bw.flush();
		} catch (Exception e) {

		} finally {
			try {
				br.close();
				isr.close();
				bw.close();
				osw.close();
			} catch (Exception e2) {
			}
		}
	}
}
