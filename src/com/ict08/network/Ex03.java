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
//		URL(Uniform Resource Locator) : 접근 가능한 자원의 주소, final 클래스라 상속 불가
//		
		BufferedReader br = null;

		try {
//			웹페이지 읽기
			URL url = new URL("https://naver.com");
			URLConnection conn = url.openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
			System.out.println("인코딩: " + conn.getContentEncoding());
			System.out.println("길이: " + conn.getContentLength());
			System.out.println("문서 타입: " + conn.getContentType());
			System.out.println("----");
			
//			http 헤더와 바디로 나눠짐
//			헤더는 http 바디 및 요청/응답에 대한 정보를 포함
//			헤더 정보를 이용해서 웹 브라우저가 해석하고 실행
//			바디는 html 코드, 이미지, css, js
			
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