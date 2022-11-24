package org.java.hom01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day04로또과제2 {
	static Scanner sc = new Scanner(System.in);
	static Random rand = new Random();
	
	public static void main(String[] args) {
		// 배열 정의
		final int SIZE = 6;
		final int LENGTH = 45;
		final int[] num = new int[6];
		int[] lotto = new int[SIZE];
		
		for(int i=0; i<SIZE; i++) {
			//배열에 45개의 랜덤한 수를 i<SIZE(6) i++만큼 넣어준다.
			lotto[i] = rand.nextInt(LENGTH);
			int tmp = lotto[i];
			lotto[i]= num[45]; 
			num[45] =tmp;
				
		}
		System.out.println(Arrays.toString(num));
	}
}
				
		
