package org.java.ex02;

import java.util.Scanner;
// 2. Scanner Ŭ������ �̿��Ͽ� 2�ڸ��� ����(10~99����)�� �Է¹ް�,
// ���� �ڸ��� 1�� �ڸ��� ���� �� �Ǻ��Ͽ� ����ϴ� ���α׷��� �ۼ��϶�.
public class Scanner02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2�ڸ��� ���� �Է�(10~99) >>");
		int num = sc.nextInt();
		if(num>99 || num<10) {
			System.out.print("������ ������ϴ�.");
		}
		int num2 = num/10;
		int num1 = num%10;
		if(num1==num2) {
			System.out.print("yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		}else {
			System.out.print("no! 10�� �ڸ��� 1�� �ڸ��� ���� �ʽ��ϴ�.");
		}
	}
}			
		
		
