package org.java.ex04;

import java.util.Scanner;

public class ex04_7rere {
	Scanner sc = new Scanner(System.in);
	String[] menu = {"�Է�:","����:","������:"};
	String work;
	int day;
	
	String[] month= new String[30];
	
	
	int menu_num=0;	
	public ex04_7rere() {
		
	}
	void �ȳ�����() {
		System.out.println(":::::scehdlue ���α׷��� ���� �մϴ�:::::");
		System.out.println("�޴��� Ȯ���� �ּ���.");
		steMONTH();
	}
	
	void steMONTH() {
		
		for (int i = 0; i < menu.length; i++) {
			System.out.printf("%s%d",menu[i],i+1);
			System.out.print(i==menu.length-1 ? "":",");
		}
		System.out.println(">>");
		menu_num = sc.nextInt();
		Switch();
	}
	void Switch() {
		switch (menu_num) {
		case 1:input();break;
		
		case 2:Switch2();break;
		
		case 3: Switch3();break;
		
		default:
			break;
		}
	}
		
	
			

	void input() {
		System.out.print("���ڸ� �Է� ���ּ���\n");
		System.out.print("input day(1~30) :");
		day = sc.nextInt();
		System.out.print("������ �Է� ���ּ���\n");
		System.out.print("input work :");
		work = sc.next();
		month[day-1] = work;
		System.out.print(month[day-1]);
		steMONTH();
		
	}
	void Switch2() {
		System.out.print("���ڸ� �Է� ���ּ���\n");
		System.out.print("Example day(1~30) :");
		int day2 = sc.nextInt();
		if(!(day==day2)) { System.out.print("����� ���ڰ� �����ϴ�.\n�ٽ� �Է��� �ּ���.\n");
		steMONTH();}
		if(!(month[day-1].equals(null))) {
			System.out.print(day+" �� �� ���� "+month[day-1]+"�Դϴ�\n");
			steMONTH();
		}else { System.out.print("������ �����ϴ�.");
		steMONTH();}
	}
	void  Switch3() {
		System.out.print("�ý��� ���� �մϴ�.");sc.close();
	}
	
	
	public static void main(String[] args) {
		ex04_7rere e04 = new ex04_7rere();
		e04.�ȳ�����();
	}
}			





	
		
				
				
				