package com.ict07.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//	객체 직렬화 : ObjectOutputStream : writeObject()
public class Ex24_output {
	public static void main(String[] args) {
//		직렬화 : 특정 클래스를 객체로 만들 특정 위치에 .ser로 저장
//		객체들이 가진 내용이 직렬화 되어 있음(사람은 읽을 수 없음)

		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "ict08.ser";
		File file = new File(pathname);

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);

//			객체 직렬화를 위한 객체 생성
			Ex24_vo vo1 = new Ex24_vo("길동", 44, 54.5, true);
			Ex24_vo vo2 = new Ex24_vo("마콜", 33, 46.1, true);
			Ex24_vo vo3 = new Ex24_vo("희동", 3, 5.6, false);
			Ex24_vo vo4 = new Ex24_vo("도너", 22, 28.2, true);
			Ex24_vo vo5 = new Ex24_vo("또치", 11, 15.8, false);
			
//			객체는 배열이나 컬렉션에 담을 수 있음
			ArrayList<Ex24_vo> list= new ArrayList<Ex24_vo>();
			list.add(vo1);
			list.add(vo2);
			list.add(vo3);
			list.add(vo4);
			list.add(vo5);
			
//			객체 직렬화
			oos.writeObject(list);
			oos.flush();
			
		} catch (Exception e) {
		} finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}
	}
}
