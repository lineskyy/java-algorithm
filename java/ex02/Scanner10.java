package org.java.ex02;

import java.util.Scanner;

public class Scanner10 {
	public void ifmonth() {
		int num;
		System.out.print("(if)���� �Է� �ϼ���(1~12) >>");
		num = sc.nextInt();
		if(num<3 || num>=12) 
			System.out.println("�ܿ�");
		if(num>=3 && num<6) 
			System.out.print("��");
		if(num<=8 && num>=6) 
			System.out.print("����");
		if(9<=num && num<=11)
			System.out.print("����");
		else if(13<=num || num<=0)
			System.out.print("����");
		
	}
	public void swmonth() {
		System.out.print("\n(switch)���� �Է� �ϼ���(1~12) >>");
		int month = sc.nextInt();
		switch (month) {
		case 1:System.out.print("�ܿ�"); break;
		case 2:System.out.print("�ܿ�"); break;
		case 3:System.out.print("��");  break;
		case 4:System.out.print("��");  break;
		case 5:System.out.print("��");  break;
		case 6:System.out.print("����"); break;
		case 7:System.out.print("����"); break;
		case 8:System.out.print("����"); break;
		case 9:System.out.print("����"); break;
		case 10:System.out.print("����"); break;
		case 11:System.out.print("����"); break;
		case 12:System.out.print("�ܿ�"); break;
		default:System.out.print("������ ������ϴ�");
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
