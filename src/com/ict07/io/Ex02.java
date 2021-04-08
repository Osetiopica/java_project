package com.ict07.io;

import java.io.File;
import java.text.SimpleDateFormat;

public class Ex02 {

	public static void main(String[] args) {
//		File 클래스를 사용하기 전에 특정 위치를 지정
		String pathname_1 = "C:\\study\\util"; // OS가 Windows일 때
		String pathname_2 = "C:/study/util"; // OS가 Linux, Unix일 때

//		OS 상관없이 쓰는 법
		String pathname_3 = "C:" + File.separator + "study" + File.separator + "util";

//		마지막 수정 날짜
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");

		File file = new File(pathname_3);
		String[] arr = file.list();
		for (String s : arr) {
//			System.out.println(s);
			File file2 = new File(pathname_3, s);
//			System.out.println(file2);

			if (file2.isDirectory()) {
				System.out.println("디렉토리 : " + file2);
			} else {
				System.out.println("파일 : " + file2 + 
						" | 크기 : " + (int) (file2.length() / 1024) + 
						"KB | 수정한 날짜 : " + sdf.format(file2.lastModified()));
			}
		}
	}

}