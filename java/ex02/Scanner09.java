package org.java.ex02;

import java.util.Scanner;

public class Scanner09 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("원의 지름과 반지름 입력 >>");
		int ji= sc.nextInt();
		int ji2= sc.nextInt();
		Double pi= sc.nextDouble();
		System.out.print("점 입력>>");
		Double x = sc.nextDouble();
		Double y = sc.nextDouble();
		double distance = Math.sqrt((ji - x) *(ji - x) + (ji2 - y) * (ji2 - y));
        if(distance < pi)
		System.out.printf("점(%s,%s)",x,y+"는 원 안에 있다.");
		else System.out.print("없다.");
	

}
}