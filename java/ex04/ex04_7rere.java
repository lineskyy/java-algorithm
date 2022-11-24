package org.java.ex04;

import java.util.Scanner;

public class ex04_7rere {
	Scanner sc = new Scanner(System.in);
	String[] menu = {"입력:","보기:","끝내기:"};
	String work;
	int day;
	
	String[] month= new String[30];
	
	
	int menu_num=0;	
	public ex04_7rere() {
		
	}
	void 안내문구() {
		System.out.println(":::::scehdlue 프로그램을 시작 합니다:::::");
		System.out.println("메뉴를 확인해 주세요.");
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
		System.out.print("날자를 입력 해주세요\n");
		System.out.print("input day(1~30) :");
		day = sc.nextInt();
		System.out.print("할일을 입력 해주세요\n");
		System.out.print("input work :");
		work = sc.next();
		month[day-1] = work;
		System.out.print(month[day-1]);
		steMONTH();
		
	}
	void Switch2() {
		System.out.print("날자를 입력 해주세요\n");
		System.out.print("Example day(1~30) :");
		int day2 = sc.nextInt();
		if(!(day==day2)) { System.out.print("저장된 날자가 없습니다.\n다시 입력해 주세요.\n");
		steMONTH();}
		if(!(month[day-1].equals(null))) {
			System.out.print(day+" 에 할 일은 "+month[day-1]+"입니다\n");
			steMONTH();
		}else { System.out.print("할일이 없습니다.");
		steMONTH();}
	}
	void  Switch3() {
		System.out.print("시스템 종료 합니다.");sc.close();
	}
	
	
	public static void main(String[] args) {
		ex04_7rere e04 = new ex04_7rere();
		e04.안내문구();
	}
}			





	
		
				
				
				