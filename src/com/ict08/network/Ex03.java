package com.ict08.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class Ex03 {

	public static void main(String[] args) {
//		URL(Uniform Resource Locator) : ���� ������ �ڿ��� �ּ�, final Ŭ������ ��� �Ұ�
//		
		BufferedReader br = null;

		try {
//			�������� �б�
			URL url = new URL("https://naver.com");
			URLConnection conn = url.openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
			System.out.println("���ڵ�: " + conn.getContentEncoding());
			System.out.println("����: " + conn.getContentLength());
			System.out.println("���� Ÿ��: " + conn.getContentType());
			System.out.println("----");
			
//			http ����� �ٵ�� ������
//			����� http �ٵ� �� ��û/���信 ���� ������ ����
//			��� ������ �̿��ؼ� �� �������� �ؼ��ϰ� ����
//			�ٵ�� html �ڵ�, �̹���, css, js
			
			Map<String, List<String>> list = conn.getHeaderFields();
			for (String s : list.keySet()) {
				System.out.println(list.get(s));
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}

	}

}