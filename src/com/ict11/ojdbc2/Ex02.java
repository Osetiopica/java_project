package com.ict11.ojdbc2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {

	public void prn(ArrayList<VO> list) {
		System.out.println("번호\t도서명\t출판사\t가격");
		for (VO vo : list) {
			System.out.print(vo.getBookid() + "\t");
			System.out.print(vo.getBookname() + "\t");
			System.out.print(vo.getPublisher() + "\t");
			System.out.println(vo.getPrice());
		}
	}
	
}