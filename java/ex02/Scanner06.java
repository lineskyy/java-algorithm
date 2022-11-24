package org.java.ex02;

import java.util.Scanner;
class Game369{
	
	private int num=0;
	
	public Game369() {}
	
	public Game369(int num) {
		this.num=num;
	}
	public int getNum() {return num;}
}
public class Scanner06 extends Game369{
	private int num=0;
	public Scanner06() {}
	
	public Scanner06(int num) {
		super(num);
	}
	
	public void start() {
		System.out.print("1~99 사이의 정수를 입력하시오 >>");
		num = sc.nextInt();
		run();
	}
	public void run() {
		int n =num/10;
		int m =num%10;
		if(num<=0 || num>=100) {
			System.out.print("범위를 벗어났습니다.");
		}
		if(n==3||n==6||n==9) {
			if(m==3||m==6||m==9)
			System.out.print("박수짝짝");
			else {System.out.print("박수짝");}
		}else {
			if(n==3||n==6||n==9)System.out.print("박수짝");
			else System.out.print("맞지 안하요");
		}
	}
	
	static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) {
		Scanner06 s6 = new Scanner06();
			s6.start();
		
		
		
		
		
		
	}
}