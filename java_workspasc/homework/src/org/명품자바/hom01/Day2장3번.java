package org.java.hom01;

import java.util.Scanner;

public class Day2��3�� {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int num_0=1,num_1=10,num_2=100,num_3=1000,num_4=10000,num_5=50000,money=0;
		System.out.print("�ݾ��� �Է��Ͻÿ� >> ");
		money = sc.nextInt();
		while(money!=0) {
			if(num_5<money) {
				System.out.printf("%d���� ��%d��",num_5,money/50000);
			}if(num_4<money) {
				System.out.printf("\n%d���� ��%d��",num_4,money%50000/10000);
			}if(num_3<money) {
				System.out.printf("\n%d�� ��%d��",num_3,money%50000%10000/1000);
			}if(num_2<money) {
				System.out.printf("\n%d�� ��%d��",num_2,money%50000%10000%1000/100);
			}if(num_1<money) {
				System.out.printf("\n%d�� ��%d��",num_1,money%50000%10000%1000&100/10);
			}if(num_0<money) {
				System.out.printf("\n%d�� ��%d��",num_0,money%50000%10000%1000%100%10/1);
			}
			break;
			
		}
		
	}
	
}
				
				
				
				
				


