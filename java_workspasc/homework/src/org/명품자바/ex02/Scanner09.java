package org.java.ex02;

import java.util.Scanner;

public class Scanner09 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("���� ������ ������ �Է� >>");
		int ji= sc.nextInt();
		int ji2= sc.nextInt();
		Double pi= sc.nextDouble();
		System.out.print("�� �Է�>>");
		Double x = sc.nextDouble();
		Double y = sc.nextDouble();
		double distance = Math.sqrt((ji - x) *(ji - x) + (ji2 - y) * (ji2 - y));
        if(distance < pi)
		System.out.printf("��(%s,%s)",x,y+"�� �� �ȿ� �ִ�.");
		else System.out.print("����.");
	

}
}