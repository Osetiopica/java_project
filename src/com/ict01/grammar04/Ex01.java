package com.ict01.grammar04;
class Ex01{
	public static void main(String[] args){
		char k1 = 'C';
		String str = "";
		switch(k1){
			case 'A' : str = "������ī"; break;
			case 'B' : str = "�����"; break;
			case 'C' : str = "ĳ����"; break;
			default : str = "�ѱ�";
		}
		System.out.println("��� : " + str);

		char k2 = '1';
		String str2 = "";
		switch(k2){
			case '1' : 
			case '3' : str2 = "����"; break;
			case '2' :
			case '4' : str2 = "����"; break;
		}
		System.out.println("��� : " + str2);
	}
}