package org.java.ex02;

import java.util.Scanner;
// 1. Scanner 클래스를 이용하여 입력받은 원화 값을 달러로 바꾸어
// 다음 예시와 같이 출력하는 프로그램을 작성하라. ($1=1100원으로 가정)
public class Scanner01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원) >>");
		double num = sc.nextInt();
		double num1 = num/1100;
		System.out.printf("%s원은 $%s입니다",num,num1);
	}
}
