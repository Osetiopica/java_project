package com.ict03.class02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex02 {

	public static void main(String[] args) {
//		날짜 관련 클래스 : 현재 컴퓨터 날짜 기준
//		Date 클래스

		Date day = new Date();
		System.out.println(day);

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd. E hh.mm.ss");
		System.out.println(dateFormat.format(day));

//		년, 월, 일, 시, 분, 초, 요일 각각 구하기
		System.out.print(day.getYear() + 1900 + "년 "); // Calendar.get(Calendar.YEAR) = 2021-1900
		System.out.print(day.getMonth() + 1 + "월 "); // = 0-11
		System.out.print(day.getDate() + "일 ");
		System.out.print(day.getHours() + "시 ");
		System.out.print(day.getMinutes() + "분 ");
		System.out.print(day.getSeconds() + "초 ");
		System.out.print(day.getDay() + " "); // Calendar.get(Calendar.DAY_OF_WEEK) = 요일 : 0(일요일)~6(토요일)

		System.out.println();
		System.out.println("----");

//		Calender 클래스
//		현재 날짜와 시간을 구할 때는 new 예약어를 사용하지 않고 객체 생성 (static)
//		년월일시분초를 구할 때 Calendar.get(Calendar.상수)를 사용
		System.out.print(Calendar.getInstance().get(Calendar.YEAR) + "년 ");
		Calendar now = Calendar.getInstance();
		System.out.print(now.get(Calendar.MONTH) + 1 + "월 "); // 0~11
		System.out.print(now.get(Calendar.DATE) + "일 ");
		System.out.print(now.get(Calendar.DAY_OF_MONTH) + "일 ");

		System.out.print(now.get(Calendar.HOUR_OF_DAY) + "시 "); // 24시간제
		System.out.print(now.get(Calendar.HOUR) + "시 "); // 12시간제
		System.out.print(now.get(Calendar.AM_PM) + " "); // AM==0, PM==1
		if (now.get(Calendar.AM_PM) == 0) {
			System.out.print("AM" + " ");
		} else if (now.get(Calendar.AM_PM) == 1) {
			System.out.print("PM" + " ");
		}

//		요일(1(일요일)~7(토요일))
		int r2 = now.get(Calendar.DAY_OF_WEEK);
		switch (r2) {
		case 1:
			System.out.print("일요일");
			break;
		case 2:
			System.out.print("월요일");
			break;
		case 3:
			System.out.print("화요일");
			break;
		case 4:
			System.out.print("수요일");
			break;
		case 5:
			System.out.print("목요일");
			break;
		case 6:
			System.out.print("금요일");
			break;
		case 7:
			System.out.print("토요일");
			break;
		}
	}

}
