package com.ict03.class07;

interface Remocon {
	void on();

	void off();
}

class Machine {
	Remocon tv = new Remocon() {

		@Override
		public void on() {
			System.out.println("TV�� ��");
		}

		@Override
		public void off() {
			System.out.println("TV�� ��");
		}
	};
	Remocon radio = new Remocon() {
		
		@Override
		public void on() {
			System.out.println("Radio�� ��");
		}
		
		@Override
		public void off() {
			System.out.println("Radio�� ��");
		}
	};
}

public class Ex06 {
	public static void main(String[] args) {
		Machine mc = new Machine();
		mc.tv.on();
		mc.tv.off();
		mc.radio.on();
		mc.radio.off();
	}
}