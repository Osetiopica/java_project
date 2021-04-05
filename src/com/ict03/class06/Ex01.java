package com.ict03.class06;

//	enum(������) : ����� �ϳ��� ��ü�� �ν��ϰ� ���� ���� ��� ��ü���� �� ���� ��� �� �ϳ��� ����(��ü)

public class Ex01 {
	static final int JAVA = 100;
	static final int DB = 200;

//	������
	public enum Lesson {
		JAVA, JSP, SPRING, ANDROID, HTML
	}

	public static void main(String[] arg) {
		System.out.println("JAVA : " + Ex01.JAVA);
		System.out.println("enum JAVA : " + Lesson.JAVA);

		Lesson[] arr = Lesson.values();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " " + arr[i].ordinal() + " ");
		}
	}
}
