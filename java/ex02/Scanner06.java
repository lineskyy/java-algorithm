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
		System.out.print("1~99 ������ ������ �Է��Ͻÿ� >>");
		num = sc.nextInt();
		run();
	}
	public void run() {
		int n =num/10;
		int m =num%10;
		if(num<=0 || num>=100) {
			System.out.print("������ ������ϴ�.");
		}
		if(n==3||n==6||n==9) {
			if(m==3||m==6||m==9)
			System.out.print("�ڼ�¦¦");
			else {System.out.print("�ڼ�¦");}
		}else {
			if(n==3||n==6||n==9)System.out.print("�ڼ�¦");
			else System.out.print("���� ���Ͽ�");
		}
	}
	
	static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) {
		Scanner06 s6 = new Scanner06();
			s6.start();
		
		
		
		
		
		
	}
}