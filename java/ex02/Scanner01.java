package org.java.ex02;

import java.util.Scanner;
// 1. Scanner Ŭ������ �̿��Ͽ� �Է¹��� ��ȭ ���� �޷��� �ٲپ�
// ���� ���ÿ� ���� ����ϴ� ���α׷��� �ۼ��϶�. ($1=1100������ ����)
public class Scanner01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȭ�� �Է��ϼ���(���� ��) >>");
		double num = sc.nextInt();
		double num1 = num/1100;
		System.out.printf("%s���� $%s�Դϴ�",num,num1);
	}
}
