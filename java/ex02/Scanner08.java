package org.java.ex02;

import java.util.Scanner;

public class Scanner08 {
	int x,y,rectx1 ,recty1,rectx2,recty2;
	static Scanner sc = new Scanner(System.in);
	public Scanner08() {
		// TODO Auto-generated constructor stub
	}
	public Scanner08(int x, int y,int rectx1, int recty1,int rectx2, int recty2) {
		this.x=x;
		this.y=y;
		this.rectx1=rectx1;
		this.recty1=recty1;
		this.rectx2=rectx2;
		this.recty2=recty2;
	}

	
	public static boolean inRect(int x, int y,int rectx1, int recty1,int rectx2, int recty2) {
		if((x >=rectx1 && x<=rectx2) && (y >=recty1 && y<=recty2)) {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		Scanner08 S8 = new Scanner08();
		
		System.out.print("(rectx1,recty1)점 입력 :");
		S8.rectx1 = sc.nextInt();
		S8.recty1 = sc.nextInt();
		System.out.print("(rectx2,recty2)점 입력 :");
		S8.rectx2 = sc.nextInt();
		S8.recty2 = sc.nextInt();
		System.out.print("(x,y)점 입력 :");
		S8.x = sc.nextInt();
		S8.y = sc.nextInt();
		if(inRect(S8.x,S8.y,S8.rectx1,S8.recty1,S8.rectx2,S8.recty2))
		System.out.print("충돌 하지 않습니다.");
		else System.out.print("충돌충돌 위험");
		
		
		}
	
}
