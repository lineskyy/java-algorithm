package org.java.ex02;

import java.util.Scanner;

class Triangle{
	private int x=0, y=0, z=0;
	public Triangle() {}
	public Triangle(int x, int y, int z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public int getx() {return x;}
	public int gety() {return y;}
	public int getz() {return z;}
}


public class Scanner05 extends Triangle{
	private int x=0, y=0, z=0;
	public Scanner05() {}
	public Scanner05(int x, int y, int z) {
		super(x,y,z);
	}
	
	public void start() {
		System.out.print("���� 3���� �Է��Ͻÿ� >>");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		run();
	}
	public void run() {
		
		if(x+y > z && x+z > y && y+z > x) {
			System.out.print("�ﰢ���� �˴ϴ�.");
		}
		else {System.out.print("���� ������");}
		}
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Scanner05().start();
	
	
	}
}