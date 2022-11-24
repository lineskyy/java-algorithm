package org.java.hom01;

import java.util.Scanner;

public class Day2장3번 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int num_0=1,num_1=10,num_2=100,num_3=1000,num_4=10000,num_5=50000,money=0;
		System.out.print("금액을 입력하시오 >> ");
		money = sc.nextInt();
		while(money!=0) {
			if(num_5<money) {
				System.out.printf("%d만원 권%d개",num_5,money/50000);
			}if(num_4<money) {
				System.out.printf("\n%d만원 권%d개",num_4,money%50000/10000);
			}if(num_3<money) {
				System.out.printf("\n%d원 권%d개",num_3,money%50000%10000/1000);
			}if(num_2<money) {
				System.out.printf("\n%d원 권%d개",num_2,money%50000%10000%1000/100);
			}if(num_1<money) {
				System.out.printf("\n%d원 권%d개",num_1,money%50000%10000%1000&100/10);
			}if(num_0<money) {
				System.out.printf("\n%d원 권%d개",num_0,money%50000%10000%1000%100%10/1);
			}
			break;
			
		}
		
	}
	
}
				
				
				
				
				


