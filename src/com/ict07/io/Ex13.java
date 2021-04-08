package com.ict07.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex13 {
	public static void main(String[] args) {
//		DataOutputStream과 DataInputStream		
//		기본 자료형을 주고 받을 때 사용(기본 자료형을 읽고 쓰는 메소드가 별도로 존재)
//		FileInputStream, FileOutputStream과의 다른 점은 이진 데이터를 입출력할 때 사용(타 시스템과 입출력할 때 유리)
//		입력 순서와 출력 순서가 다르면 데이터의 결과가 달라질 수 있음
//		BufferedInputStream, BufferedOutputStream을 활용할 수 있음

		String pathname = "c:" + File.separator + "study" + File.separator + "util" + File.separator + "ict03.txt";
		File file = new File(pathname);

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		DataOutputStream dos = null;

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			dos = new DataOutputStream(bos);

//			쓰기 메소드 : writeXXX(XXX는 기본 자료형을 말함)
//			메모장으로 열어도 읽을 수 없음
			dos.writeLong(126L);
			dos.writeBoolean(true);
			dos.writeFloat(3.14f);
			dos.writeInt(256);
			dos.writeDouble(245.31);
			dos.writeChar('A');
			dos.flush();

			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
			
//			읽는 메소드 : readXXX(XXX는 기본 자료형을 말함)
			System.out.println(dis.readLong());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readFloat());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			
			
		} catch (Exception e) {
		} finally {
			try {
				dos.close();
				bos.close();
				fos.close();
				dis.close();
				bis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
