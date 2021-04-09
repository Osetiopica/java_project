package com.ict08.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex01 {

	public static void main(String[] args) {
//		InetAddress : 자바에서 IP주소를 표현하는 클래스
//		생성자가 존재하지만 미사용
//		6개의 static 메소드를 이용
		try {
			InetAddress addr = InetAddress.getByName("naver.com");
			System.out.println("이름: " + addr.getHostName());
			System.out.println("주소: " + addr.getHostAddress());
			System.out.println("toString: " + addr.toString());
			System.out.println("----");

			addr = InetAddress.getLocalHost();
			System.out.println("이름: " + addr.getHostName());
			System.out.println("주소: " + addr.getHostAddress());
			System.out.println("toString: " + addr.toString());
			System.out.println("----");

			InetAddress[] addrs = InetAddress.getAllByName("m.naver.com");
			for (InetAddress i : addrs) {
				System.out.println("이름: " + i.getHostName());
				System.out.println("주소: " + i.getHostAddress());
				System.out.println("toString: " + i.toString());
				System.out.println("----");
			}

			byte[] b = { 125, (byte) 209, (byte) 222, (byte) 137 };
			addr = InetAddress.getByAddress(b);
			System.out.println("이름: " + addr.getHostName());
			System.out.println("주소: " + addr.getHostAddress());
			System.out.println("toString: " + addr.toString());
			System.out.println("----");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}