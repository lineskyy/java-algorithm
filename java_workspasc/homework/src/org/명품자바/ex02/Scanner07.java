package org.java.ex02;

import java.util.Scanner;
class Lectangle{
	private int x,y;
	static Scanner sc = new Scanner(System.in);
	public Lectangle() {this(0,0);}
	public Lectangle(int x, int y) {
		this.x=x;this.y=y;
		}
	public void run() {
		System.out.print("�� (x,y)�� ��ǥ�� �Է� �Ͻÿ�. >>");
		x = sc.nextInt();
		y = sc.nextInt();
		if(x>100 && y<200){
			System.out.printf("(%d,%d)�� �簢�� �ȿ� �ֽ��ϴ�.",x,y);
		}
	}
	
}
public class Scanner07{
	private int x,y;
	private Lectangle lectangle;
	static Scanner sc = new Scanner(System.in);
	public Scanner07() {}
	public Scanner07(int x ,int y) {
		lectangle = new Lectangle(x,y);
	}
	
	public Lectangle getLectangle() {
		return lectangle;
	}
	public void setLectangle(Lectangle lectangle) {
		this.lectangle = lectangle;
	}
	public void run() {
		System.out.print("�� (x,y)�� ��ǥ�� �Է� �Ͻÿ�. >>");
		x = sc.nextInt();
		y = sc.nextInt();
		if(x>100 && y<200){
			System.out.printf("(%d,%d)�� �簢�� �ȿ� �ֽ��ϴ�.",x,y);
		}
	}
	public static void main(String[] args) {
		Scanner07 S7 = new Scanner07();
		S7.run();
	}

}	


