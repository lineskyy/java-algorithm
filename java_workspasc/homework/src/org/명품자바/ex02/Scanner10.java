package org.java.ex02;

import java.util.Scanner;

public class Scanner10 {
	public void ifmonth() {
		int num;
		System.out.print("(if)달을 입력 하세요(1~12) >>");
		num = sc.nextInt();
		if(num<3 || num>=12) 
			System.out.println("겨울");
		if(num>=3 && num<6) 
			System.out.print("봄");
		if(num<=8 && num>=6) 
			System.out.print("여름");
		if(9<=num && num<=11)
			System.out.print("가을");
		else if(13<=num || num<=0)
			System.out.print("없음");
		
	}
	public void swmonth() {
		System.out.print("\n(switch)달을 입력 하세요(1~12) >>");
		int month = sc.nextInt();
		switch (month) {
		case 1:System.out.print("겨울"); break;
		case 2:System.out.print("겨울"); break;
		case 3:System.out.print("봄");  break;
		case 4:System.out.print("봄");  break;
		case 5:System.out.print("봄");  break;
		case 6:System.out.print("여름"); break;
		case 7:System.out.print("여름"); break;
		case 8:System.out.print("여름"); break;
		case 9:System.out.print("가을"); break;
		case 10:System.out.print("가을"); break;
		case 11:System.out.print("가을"); break;
		case 12:System.out.print("겨울"); break;
		default:System.out.print("범위를 벗어났습니다");
			break;
			
		}
	}
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		Scanner10 S10 = new Scanner10();
		S10.ifmonth();
		S10.swmonth();
	}
}
