package org.java.ex02;

import java.util.Scanner;
// 12. 사칙 연산을 입력받아 계산하는 프로그램을 작성하고자 한다. 
// 연산자는 + - * / 의 네 가지로 하고 피연산자는 모두 실수로 한다. 
// 피연산자와 연산자는 실행 사례와 같이 빈 칸으로 분리하여 입력한다. 
// 0으로 나누기 시 "0으로 나눌 수 없습니다."를 출력하고 종료한다.
public class Scanner12 {
	static Scanner sc = new Scanner(System.in);
	public static void sacihc_sw() {
		
		System.out.print("sw연산 >>");
		double input = sc.nextInt();
		String yunsan = sc.next();
		double output = sc.nextInt();
		switch (yunsan) {
		case "+":System.out.printf("%s %s %s = %s",input,yunsan,output,input+output);break;
		case "-":System.out.printf("%s %s %s = %s",input,yunsan,output,input-output);break;
		case "/":System.out.printf("%s %s %s = %s",input,yunsan,output,input/output);break;
		case "*":System.out.printf("%s %s %s = %s",input,yunsan,output,input*output);break;
		default:System.out.print("조건에 맞지 않습니다.");
			
		}
	}
	public static void sacihc_if() {
		System.out.print("\nif연산 >>");
		double input = sc.nextInt();
		String yunsan = sc.next();
		double output = sc.nextInt();
		if(yunsan.equals("+"))
			System.out.printf("%s %s %s = %s",input,yunsan,output,input+output);
		if(yunsan.equals("-"))
			System.out.printf("%s %s %s = %s",input,yunsan,output,input-output);
		if(yunsan.equals("/"))
			System.out.printf("%s %s %s = %s",input,yunsan,output,input/output);
		if(yunsan.equals("*"))
			System.out.printf("%s %s %s = %s",input,yunsan,output,input*output);
	}
	public static void main(String[] args) {
		Scanner12 S12 = new Scanner12();
		S12.sacihc_sw();
		S12.sacihc_if();
		
		}
	}

