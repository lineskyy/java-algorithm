package org.java.ex04;

import java.util.Scanner;

class Grad{
	private int math,science,english;
	public Grad() {}
	public Grad(int math,int science,int english) {
		this.math=math;
		this.science=science;
		this.english=english;
	}

	private int sum() {return math+science+english;}
	
	public int average() {return sum()/3;}
}
public class ex04_2 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("��,��,��, ������ 3���� ���� �Է� >> ");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		Grad me = new Grad(math,science,english);
		System.out.println("�����"+ me.average());

	}

}
