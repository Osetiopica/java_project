package com.ict03.class04;

public class Ex08_Cat extends Ex06_Animal {

	@Override
	public void sound() {
		System.out.println("¾ß¿Ë~");
	}

	@Override
	public void eat(String food) {
		System.out.println("»ý¼±");
	}

	@Override
	public String play() {
		return "Ä¹Å¸¿ö¿¡¼­ ³î±â";
	}

}
