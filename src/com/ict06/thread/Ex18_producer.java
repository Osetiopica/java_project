package com.ict06.thread;

public class Ex18_producer implements Runnable {
	private Ex17_car car;

	public Ex18_producer(Ex17_car car) {
		this.car = car;
	}

	public void run() {
		String carName = null;
		for (int i = 0; i < 20; i++) {
			carName = car.getCar();
			car.push(carName);
			try {
				Thread.sleep((int) (Math.random() * 200));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
