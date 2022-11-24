package org.java.hom01;
import java.util.Arrays;
import java.util.Scanner;

public class Day2장4번 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//정수 입력
		
		int[] arr = new int[]{1,2,3};
		System.out.print("정수 3개 입력 >>");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		    Arrays.sort(arr);
		    System.out.print("중앙값은" +arr[1]+ "입니다.");
	}
}
		
		
