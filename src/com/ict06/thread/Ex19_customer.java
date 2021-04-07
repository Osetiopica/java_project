package com.ict06.thread;

public class Ex19_customer implements Runnable {
	private Ex17_car car;

	public Ex19_customer(Ex17_car car) {
		this.car = car;
	}

	public void run() {
		String carName = null;
		for (int i = 0; i < 20; i++) {
			carName = car.pop();
			try {
				Thread.sleep((int) (Math.random() * 200));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
