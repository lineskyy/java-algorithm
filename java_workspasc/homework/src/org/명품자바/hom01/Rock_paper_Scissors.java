package org.java.hom01;

import java.util.Scanner;

public class Rock_paper_Scissors {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가위(1) 바위(2) 보(3) 내기:");
		
		// 철수
		
		int chullsu = sc.nextInt();
		
		if (chullsu==1) 
			{System.out.println("철수:가위");}
		if (chullsu==2) 
			{System.out.println("철수:바위");}
		if (chullsu==3) 
			{System.out.println("철수:보");}
		
		//영희
		
		int Younghee =(int)(Math.random()*3);
		
		if (Younghee==1) 
			{System.out.println("영희:가위");}
		if (Younghee==2) 
			{System.out.println("영희:바위");}
		if (Younghee==3) 
			{System.out.println("영희:보");}
		
		// 결과 가위 일때
		if (Younghee==1) {
			if (chullsu==1) {
				System.out.println("비겼 습니다");}
					
			if (chullsu==2) {
				System.out.println("철수가 이겼습니다");}
					
			if (chullsu==3) {
				System.out.println("영희가 이겼3습니다");}
		}
		
		// 결과 바위 일때
		if (Younghee==2) {
			if (chullsu==1) {
				System.out.println("비겼 습니다");}
			
			if (chullsu==2) {
				System.out.println("철수가 이겼습니다");}
			
			if (chullsu==3) {
				System.out.println("영희가 이겼습니다");}
		}
		// 결과 보 일때
		if (Younghee==3) {
			if (chullsu==1) {
				System.out.println("비겼 습니다");}
			
			if (chullsu==2) {
				System.out.println("철수가 이겼습니다");}
			
			if (chullsu==3) {
				System.out.println("영희가 이겼습니다");}
		}
	}
}
