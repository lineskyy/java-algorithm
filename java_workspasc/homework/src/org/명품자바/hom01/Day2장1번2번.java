package org.java.hom01;

import java.util.Scanner;

public class Day2��1��2�� {
static Scanner sc = new Scanner(System.in);
	public static void test03(String[] args){
		int sum=0;
		if(sum>100) {
			sum=100;
		}else {
			sum =0;
		}
		System.out.print("����>>");
		sum = sc.nextInt();
		
	}
	public static void test04(String[] args) {
		//2��-1��
		float money =0,cnt=0;
		System.out.print("�ݾ��� �Է��ϼ��� >>");
		money = sc.nextInt();
		
		   cnt = money/1100;
		
		System.out.printf("%.0f���� $%.1f �Դϴ�.",money,cnt);
		}
	//2��-2��
	public static void main(String[] args) {
		int num=0,cnt=0;
		System.out.print("���ڸ� ������ �Է��ϼ���(10~99) >>");
		num = sc.nextInt();
		
		while(true) {
			if(num<100&&num>10) {
				cnt =num%10;
			System.out.printf("yes! %d�� 1�� �ڸ��� %d�� ��ġ�մϴ�!",num,cnt);
			break;
			}
			else{
				System.out.print("��ġ���� �ʽ��ϴ�. �ٽ� �Է��ϼ���(10~99) >>");
				num = sc.nextInt();
			}
		}
	}
}	

				
		
		
			

			


		

