package com.ict03.class02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex02 {

	public static void main(String[] args) {
//		��¥ ���� Ŭ���� : ���� ��ǻ�� ��¥ ����
//		Date Ŭ����

		Date day = new Date();
		System.out.println(day);

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd. E hh.mm.ss");
		System.out.println(dateFormat.format(day));

//		��, ��, ��, ��, ��, ��, ���� ���� ���ϱ�
		System.out.print(day.getYear() + 1900 + "�� "); // Calendar.get(Calendar.YEAR) = 2021-1900
		System.out.print(day.getMonth() + 1 + "�� "); // = 0-11
		System.out.print(day.getDate() + "�� ");
		System.out.print(day.getHours() + "�� ");
		System.out.print(day.getMinutes() + "�� ");
		System.out.print(day.getSeconds() + "�� ");
		System.out.print(day.getDay() + " "); // Calendar.get(Calendar.DAY_OF_WEEK) = ���� : 0(�Ͽ���)~6(�����)

		System.out.println();
		System.out.println("----");

//		Calender Ŭ����
//		���� ��¥�� �ð��� ���� ���� new ���� ������� �ʰ� ��ü ���� (static)
//		����Ͻú��ʸ� ���� �� Calendar.get(Calendar.���)�� ���
		System.out.print(Calendar.getInstance().get(Calendar.YEAR) + "�� ");
		Calendar now = Calendar.getInstance();
		System.out.print(now.get(Calendar.MONTH) + 1 + "�� "); // 0~11
		System.out.print(now.get(Calendar.DATE) + "�� ");
		System.out.print(now.get(Calendar.DAY_OF_MONTH) + "�� ");

		System.out.print(now.get(Calendar.HOUR_OF_DAY) + "�� "); // 24�ð���
		System.out.print(now.get(Calendar.HOUR) + "�� "); // 12�ð���
		System.out.print(now.get(Calendar.AM_PM) + " "); // AM==0, PM==1
		if (now.get(Calendar.AM_PM) == 0) {
			System.out.print("AM" + " ");
		} else if (now.get(Calendar.AM_PM) == 1) {
			System.out.print("PM" + " ");
		}

//		����(1(�Ͽ���)~7(�����))
		int r2 = now.get(Calendar.DAY_OF_WEEK);
		switch (r2) {
		case 1:
			System.out.print("�Ͽ���");
			break;
		case 2:
			System.out.print("������");
			break;
		case 3:
			System.out.print("ȭ����");
			break;
		case 4:
			System.out.print("������");
			break;
		case 5:
			System.out.print("�����");
			break;
		case 6:
			System.out.print("�ݿ���");
			break;
		case 7:
			System.out.print("�����");
			break;
		}
	}

}
