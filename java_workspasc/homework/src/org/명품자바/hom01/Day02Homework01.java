package org.java.hom01;

import java.util.Random;
import java.util.Scanner;

public class Day02Homework01 {
	
	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();
	
	public static void main(String[] args) {
		
		int a = 1 + rand.nextInt(100);
		System.out.println("\n���䰪 : "+a);
		int cnt = 5;
		
		
		while(true) {
			System.out.print("\n1~100 ���� �Է�>> ");
			int userNum = scan.nextInt();
			System.out.println(userNum);
			
			if(a > userNum) {
				System.out.printf("�� ����");
				 
				cnt --;
			}	
			if(a < userNum) {
				System.out.printf("�� ����");
				
				cnt --;
			}
			if(cnt==0) {
				System.out.printf("��ȸ�� �������ϴ�.");
				
				break;
			}
			else if(a == userNum) {
				System.out.printf("���� �Դϴ�.");
				String yn = "";
				while(!(yn.equals("y")||yn.equals("n"))) {
					System.out.println("��� �Ͻðڽ��ϱ�? Y or N >>");
					
					yn = scan.nextLine();
					if(yn.equals("y")) {
						cnt = 5;
						a = rand.nextInt(100)+1;
						
				
						
				}else if(yn.equals("n")){
					System.out.println("�����մϴ�.");
					yn = scan.nextLine();
					break;
			
				 }	 
				
				}	
				
			}
		
		} 
	
	}
}			
		
		
	


  

