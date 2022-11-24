package org.java.ex03;

import java.util.Scanner;

public class ex03_03 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("정수입력 >>");
		int n =sc.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=5; j>=n-i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	}
}
