package org.java.hom01;

import java.util.Scanner;

public class Day2장1번2번 {
static Scanner sc = new Scanner(System.in);
	public static void test03(String[] args){
		int sum=0;
		if(sum>100) {
			sum=100;
		}else {
			sum =0;
		}
		System.out.print("숫자>>");
		sum = sc.nextInt();
		
	}
	public static void test04(String[] args) {
		//2장-1번
		float money =0,cnt=0;
		System.out.print("금액을 입력하세요 >>");
		money = sc.nextInt();
		
		   cnt = money/1100;
		
		System.out.printf("%.0f원은 $%.1f 입니다.",money,cnt);
		}
	//2장-2번
	public static void main(String[] args) {
		int num=0,cnt=0;
		System.out.print("두자리 정수를 입력하세요(10~99) >>");
		num = sc.nextInt();
		
		while(true) {
			if(num<100&&num>10) {
				cnt =num%10;
			System.out.printf("yes! %d의 1의 자리가 %d와 일치합니다!",num,cnt);
			break;
			}
			else{
				System.out.print("일치하지 않습니다. 다시 입력하세요(10~99) >>");
				num = sc.nextInt();
			}
		}
	}
}	

				
		
		
			

			


		

