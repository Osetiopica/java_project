package com.ict06.thread;

public class Ex20_main {
	public static void main(String[] args) {
		Ex17_car c = new Ex17_car();
		Ex18_producer producer = new Ex18_producer(c);
		Thread tProducer = new Thread(producer);
		Ex19_customer customer = new Ex19_customer(c);
		Thread tCustomer = new Thread(customer);
		tProducer.start();
		tCustomer.start();
	}
}
