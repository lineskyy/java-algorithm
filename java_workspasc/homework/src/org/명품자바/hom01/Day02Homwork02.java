package org.java.hom01;

import java.util.Scanner;

public class Day02Homwork02 {
		
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 시작 ,종료 출력
		int start_num,end_num;
			System.out.print("시작단 >>");
			start_num = scan.nextInt();
			System.out.print("종료단 >>");
			end_num = scan.nextInt();
		// 시작단이 종료단 보다 클경우 오름차순 바궈주기	
		if(start_num > end_num) { 
			int tmp = end_num; 
				end_num = start_num; 
				start_num = tmp;
		}
		// 몇 단 인지 표시	
		for (int i = start_num; i <= end_num; i+=3) {
			for (int l = i; l < 3+i; l++) {
				if(l <= end_num)
				System.out.printf(" %d 단 입니다.\t", l);
			}
			System.out.println();
			//구구단 출력
			for (int j = 1; j <= 9; j++) {
				for (int k = i; k < 3+i; k++) {
					if(k <= end_num)
						System.out.printf("%d x %d = %d\t", k, j, k*j);
				}
				System.out.println();
			}
			System.out.println();
		}
			
	}
}
