package org.java.ex04;

import java.util.Scanner;



public class ex04_5_6{
	private  double x;
	private  double y;
	private  int radius;
	public ex04_5_6() {}
	public ex04_5_6(double x,double y,int radius) {
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	public double getX() {return x;}
	public double getY() {return y;}
	public double getRadius() {return radius;}
	public void show() {
		if(radius>5)
		System.out.printf("가장 면적이 큰 원은(%.1f,%.1f,)%d\n",x,y,radius);
	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ex04_5_6 c[] = new ex04_5_6[3];
		for(int i=0; i<c.length; i++) {
			System.out.print("x ,y ,radius >>");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new ex04_5_6(x,y,radius);
		}
		for(int i =0; i<c.length; i++)c[i].show();
			
		
	}
}
