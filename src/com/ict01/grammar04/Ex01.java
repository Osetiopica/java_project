package com.ict01.grammar04;
class Ex01{
	public static void main(String[] args){
		char k1 = 'C';
		String str = "";
		switch(k1){
			case 'A' : str = "아프리카"; break;
			case 'B' : str = "브라질"; break;
			case 'C' : str = "캐나다"; break;
			default : str = "한국";
		}
		System.out.println("결과 : " + str);

		char k2 = '1';
		String str2 = "";
		switch(k2){
			case '1' : 
			case '3' : str2 = "남자"; break;
			case '2' :
			case '4' : str2 = "여자"; break;
		}
		System.out.println("결과 : " + str2);
	}
}