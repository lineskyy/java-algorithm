package org.java.ex03;

import java.util.Scanner;

public class ex03_5 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[] n = new int[10];
		System.out.print("�������� 10�� �Է� >>\n");
		for(int i =0; i< n.length; i++) {
			n[i] = sc.nextInt();
		}
		System.out.print("3�� ����� >>");
		for(int i =0; i< n.length; i++)
			if(n[i]%3==0) {
				System.out.print(n[i]+" ");
				
			}else {}
		
		}
	}

//1 5 99 22 345 154 2346 55 32 85