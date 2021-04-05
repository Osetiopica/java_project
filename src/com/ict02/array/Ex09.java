package com.ict02.array;

public class Ex09 {

	public static void main(String[] args) {

		int[][] persons = new int[5][];
//		번호, 총점, 평균, 학점, 순위
		int[] person1 = { 1, 270, 90, 'A', 1 };
		int[] person2 = { 2, 210, 70, 'C', 1 };
		int[] person3 = { 3, 180, 60, 'F', 1 };
		int[] person4 = { 4, 300, 100, 'A', 1 };
		int[] person5 = { 5, 285, 95, 'A', 1 };

		persons[0] = person1;
		persons[1] = person2;
		persons[2] = person3;
		persons[3] = person4;
		persons[4] = person5;

		for (int i = 0; i < persons.length; i++) {
			for (int j = 0; j < persons.length; j++) {
				if (persons[i][1] > persons[j][1]) {
					persons[j][4]++;
				}
			}
		}

//		정렬
		int[] t = new int[5];
		for (int i = 0; i < t.length - 1; i++) {
			for (int j = i + 1; j < t.length; j++) {
				if (persons[i][4] > persons[j][4]) {
					t = persons[i];
					persons[i] = persons[j];
					persons[j] = t;
				}
			}
		}

//		출력
		for (int i = 0; i < persons.length; i++) {
			for (int j = 0; j < persons.length; j++) {
				if (j == 3) {
					System.out.print((char) persons[i][j] + "\t");
				} else {
					System.out.print(persons[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}

}
