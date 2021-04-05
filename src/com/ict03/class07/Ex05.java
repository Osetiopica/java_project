package com.ict03.class07;

//	Anonymous 내부 클래스 : 대상이 보통 추상 클래스나 인터페이스에서 많이 사용
abstract class Car {
	abstract void run();

}

class Bus extends Car {

	@Override
	void run() {
		System.out.println("80으로 달림");
	}

}

class Taxi extends Car {

	@Override
	void run() {
		System.out.println("160으로 달림");
	}

}

class Ex05 {
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.run();
		System.err.println();
		
		Car car = new Taxi();
		car.run();
		System.err.println();
		
		Car car2 = new Car() {
			
			@Override
			void run() {
				System.out.println("무조건 달림");
			}
		};
		car2.run();
	}
}
