package com.ict01.grammar02;
class Ex09{
	public static void main(String[] args){
		int a = 2*3600 + 40*60 + 23;
		System.out.printf("%d%n", a);

		int x = 60;
		int t = 9630;
		int h = t / (x * x);
		int r = t % (x * x);
		int m = r / x;
		int s = r % x;
		System.out.printf("%dΩ√ %d∫– %d√ ",h ,m ,s);
	}
}





