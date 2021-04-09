package com.ict08.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex01 {

	public static void main(String[] args) {
//		InetAddress : �ڹٿ��� IP�ּҸ� ǥ���ϴ� Ŭ����
//		�����ڰ� ���������� �̻��
//		6���� static �޼ҵ带 �̿�
		try {
			InetAddress addr = InetAddress.getByName("naver.com");
			System.out.println("�̸�: " + addr.getHostName());
			System.out.println("�ּ�: " + addr.getHostAddress());
			System.out.println("toString: " + addr.toString());
			System.out.println("----");

			addr = InetAddress.getLocalHost();
			System.out.println("�̸�: " + addr.getHostName());
			System.out.println("�ּ�: " + addr.getHostAddress());
			System.out.println("toString: " + addr.toString());
			System.out.println("----");

			InetAddress[] addrs = InetAddress.getAllByName("m.naver.com");
			for (InetAddress i : addrs) {
				System.out.println("�̸�: " + i.getHostName());
				System.out.println("�ּ�: " + i.getHostAddress());
				System.out.println("toString: " + i.toString());
				System.out.println("----");
			}

			byte[] b = { 125, (byte) 209, (byte) 222, (byte) 137 };
			addr = InetAddress.getByAddress(b);
			System.out.println("�̸�: " + addr.getHostName());
			System.out.println("�ּ�: " + addr.getHostAddress());
			System.out.println("toString: " + addr.toString());
			System.out.println("----");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}