package com.ict03.class07;

interface Remocon {
	void on();

	void off();
}

class Machine {
	Remocon tv = new Remocon() {

		@Override
		public void on() {
			System.out.println("TV¸¦ ÄÔ");
		}

		@Override
		public void off() {
			System.out.println("TV¸¦ ²û");
		}
	};
	Remocon radio = new Remocon() {
		
		@Override
		public void on() {
			System.out.println("Radio¸¦ ÄÔ");
		}
		
		@Override
		public void off() {
			System.out.println("Radio¸¦ ²û");
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