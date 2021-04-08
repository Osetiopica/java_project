package com.ict07.io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Ex03 {

	public static void main(String[] args) {

//		작업 위치 지정
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io_test.txt";
		File file = new File(pathname);
		try {
			boolean b1 = file.createNewFile();
			if (b1) {
				System.out.println("성공");
			} else {
				System.out.println("실패"); // 이미 같은 이름의 파일 있으면 실패
			}
			pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "IO_Test";
			File file2 = new File(pathname);
			boolean b2 = file2.mkdirs();
			if (b2) {
				System.out.println("성공");
			} else {
				System.out.println("실패"); // 이미 같은 이름의 파일 있으면 실패
			}

//			디렉토리 삭제
			File file3 = new File(pathname);
			boolean b3 = file3.delete();
			if (b3) {
				System.out.println("성공");
			} else {
				System.out.println("실패"); // 비어있어야 삭제 가능
			}

//			파일 삭제
			pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "IO_Test"
					+ File.separator + "test.txt";
			File file4 = new File(pathname);
			boolean b4 = file4.delete();
			if (b4) {
				System.out.println("성공");
			} else {
				System.out.println("실패"); // 이미 같은 이름의 파일 있으면 실패
			}

			System.out.println();

//			경로
			pathname = "C:" + File.separator + "study" + File.separator + "util";
			File file5 = new File(pathname);
			System.out.println(file5.getAbsolutePath());
			System.out.println(file5.getCanonicalPath());
			System.out.println(file5.getPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}