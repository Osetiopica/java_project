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
//		DataOutputStream�� DataInputStream		
//		�⺻ �ڷ����� �ְ� ���� �� ���(�⺻ �ڷ����� �а� ���� �޼ҵ尡 ������ ����)
//		FileInputStream, FileOutputStream���� �ٸ� ���� ���� �����͸� ������� �� ���(Ÿ �ý��۰� ������� �� ����)
//		�Է� ������ ��� ������ �ٸ��� �������� ����� �޶��� �� ����
//		BufferedInputStream, BufferedOutputStream�� Ȱ���� �� ����

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

//			���� �޼ҵ� : writeXXX(XXX�� �⺻ �ڷ����� ����)
//			�޸������� ��� ���� �� ����
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
			
//			�д� �޼ҵ� : readXXX(XXX�� �⺻ �ڷ����� ����)
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
