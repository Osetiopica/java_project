package com.ict07.io;

import java.io.Serializable;

public class Ex25_vo implements Serializable {
	private String name;
	transient private int kor;
	transient private int eng;
	transient private int math;
	private int sum;
	private double avg;
	private String hak;

	public Ex25_vo() {
	}

	public Ex25_vo(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

		sum = kor + eng + math;
		avg = ((int) (sum / 3.0 * 10)) / 10.0;

		if (avg >= 90) {
			hak = "A";
		} else if (avg >= 80) {
			hak = "B";
		} else if (avg >= 70) {
			hak = "C";
		} else {
			hak = "D";
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public double getAvg() {
		return avg;
	}

	public String getHak() {
		return hak;
	}

}
