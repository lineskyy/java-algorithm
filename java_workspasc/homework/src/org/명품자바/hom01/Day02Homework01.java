package org.java.hom01;

import java.util.Random;
import java.util.Scanner;

public class Day02Homework01 {
	
	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();
	
	public static void main(String[] args) {
		
		int a = 1 + rand.nextInt(100);
		System.out.println("\n정답값 : "+a);
		int cnt = 5;
		
		
		while(true) {
			System.out.print("\n1~100 사이 입력>> ");
			int userNum = scan.nextInt();
			System.out.println(userNum);
			
			if(a > userNum) {
				System.out.printf("더 높게");
				 
				cnt --;
			}	
			if(a < userNum) {
				System.out.printf("더 낮게");
				
				cnt --;
			}
			if(cnt==0) {
				System.out.printf("기회가 끝났습니다.");
				
				break;
			}
			else if(a == userNum) {
				System.out.printf("정답 입니다.");
				String yn = "";
				while(!(yn.equals("y")||yn.equals("n"))) {
					System.out.println("계속 하시겠습니까? Y or N >>");
					
					yn = scan.nextLine();
					if(yn.equals("y")) {
						cnt = 5;
						a = rand.nextInt(100)+1;
						
				
						
				}else if(yn.equals("n")){
					System.out.println("종료합니다.");
					yn = scan.nextLine();
					break;
			
				 }	 
				
				}	
				
			}
		
		} 
	
	}
}			
		
		
	


  

