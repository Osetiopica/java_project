package com.ict05.collection;
	
//	VO(ValueObject) : 데이터를 저장하는 객체
//	getter만 사용해서 수정 불가능하게 만들 수 있음

public class Ex03 {
	private String name;
	private int price;

	public Ex03() {
	}

	public Ex03(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}