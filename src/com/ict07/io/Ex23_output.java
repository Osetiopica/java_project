package com.ict07.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

//	객체 직렬화 : ObjectOutputStream : writeObject()
public class Ex23_output {
	public static void main(String[] args) {
//		직렬화 : 특정 클래스를 객체로 만들 특정 위치에 .ser로 저장
//		객체들이 가진 내용이 직렬화 되어 있음(사람은 읽을 수 없음)

		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "ict07.ser";
		File file = new File(pathname);

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);

//			객체 직렬화를 위한 객체 생성
			Ex23_vo vo = new Ex23_vo("둘리", 28, 34.5, true);
			
//			객체 직렬화
			oos.writeObject(vo);
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
