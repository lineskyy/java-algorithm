package org.java.ex02;

import java.util.Arrays;
import java.util.Scanner;
// Scanner 클래스로 정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력하라. 
// 균값을 구하는 것이 아님에 주의
class extendsScanner04{
	protected int[] num = new int[3];
	public extendsScanner04() {}
	public extendsScanner04(int[] num) {this.num = num;}
	
	public int[] getnum() {return num;}
}

public class Scanner04 extends extendsScanner04{
	public Scanner04() {}
	public Scanner04(int[] num) {super(num);}
	
	void run() {
		System.out.print("정수 3개 입력 >>");
		for(int i=0; i<num.length; i++ ) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		System.out.print("중간값은 "+num[1]+"입니다.");
	}
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		Scanner04 s4 = new Scanner04();
		s4.run();
		
	}
	
}
			
			

