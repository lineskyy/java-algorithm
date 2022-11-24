package org.java.ex03;

import java.util.Arrays;
import java.util.Scanner;

public class ex03_8 {
	static Scanner sc = new Scanner(System.in);
	public static void test(String[] args) {
		
		
//		System.out.print("정수몇개? ");
//		int num = sc.nextInt();
//		int[] nums = new int[num];
//		
//		for(int i=0; i<nums.length; i++) {
//			nums[i] = (int)(Math.random()*100+1);
//			for(int j=0; j<i; j++) {
//				if(nums[i]==nums[j]) {
//					i--;
//				}
//			}
//		}
//		System.out.print(Arrays.toString(nums));
		
	}
	public static void main(String[] args) {
		System.out.print("출력할 정수를 입력하세요 >>");
		int num = sc.nextInt();
		int[] nums = new int[num];
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = (int)(Math.random()*100+1);
			for(int j=0; j<i; j++) {
				if(nums[i]==nums[j]) {
					nums[i]--;
				}
			}
		}
		for(int i=0; i<nums.length; i++) {
			Arrays.sort(nums);
			System.out.print(nums[i]+" ");
			if(i % 10 == 0 && i != 0) 
				System.out.println();
		}
		
		
	}
	public static void test2(String[] args) {
		System.out.println(10%10);
	}
}
