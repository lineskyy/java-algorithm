package org.java.ex02;

import java.util.Arrays;
import java.util.Scanner;
// Scanner Ŭ������ ���� 3���� �Է¹ް� 3���� ���� �� �߰� ũ���� ���� ����϶�. 
// �հ��� ���ϴ� ���� �ƴԿ� ����
class extendsScanner04{
	protected int[] num = new int[3];
	public extendsScanner04() {}
	public extendsScanner04(int[] num) {this.num = num;}
	
	public int[] getnum() {return num;}
}

public class Scanner04 extends extendsScanner04{
	public Scanner04() {}
	public Scanner04(int[] num) {super(num);}
	
	void run() {
		System.out.print("���� 3�� �Է� >>");
		for(int i=0; i<num.length; i++ ) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		System.out.print("�߰����� "+num[1]+"�Դϴ�.");
	}
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		Scanner04 s4 = new Scanner04();
		s4.run();
		
	}
	
}
			
			

