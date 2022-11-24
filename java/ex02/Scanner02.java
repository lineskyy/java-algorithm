package org.java.ex02;

import java.util.Scanner;
// 2. Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고,
// 십의 자리와 1의 자리가 같은 지 판별하여 출력하는 프로그램을 작성하라.
public class Scanner02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99) >>");
		int num = sc.nextInt();
		if(num>99 || num<10) {
			System.out.print("범위를 벗어났습니다.");
		}
		int num2 = num/10;
		int num1 = num%10;
		if(num1==num2) {
			System.out.print("yes! 10의 자리와 1의 자리가 같습니다.");
		}else {
			System.out.print("no! 10의 자리와 1의 자리가 같지 않습니다.");
		}
	}
}			
		
		
