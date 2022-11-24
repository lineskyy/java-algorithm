package org.java.ex03;

import java.util.Scanner;

public class ex03_6 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[] num = {50000,10000,1000,100,10,1};
		int money=0;
		System.out.print("금액을 입력하시오 >>");
		money = sc.nextInt();
		for(int i=0; i<num.length; i++) {
			if(num[i]==num[0]) 
			System.out.printf("%d원권%d장\n",num[0],money/num[0]);
			else if(num[i]==num[1]) 
				System.out.printf("%d원권%d장\n",num[1],money%num[0]/num[1]);
			else if(num[i]==num[2]) 
				System.out.printf("%d원권%d장\n",num[2],money%num[0]%num[1]/num[2]);
			else if(num[i]==num[3]) 
				System.out.printf("%d원권%d장\n",num[3],money%num[0]%num[1]%num[2]/num[3]);
			else if(num[i]==num[4]) 
				System.out.printf("%d원권%d장\n",num[4],money%num[0]%num[1]%num[2]%num[3]/num[4]);
			else if(num[i]==num[5]) 
				System.out.printf("%d원권%d장\n",num[5],money%num[0]%num[1]%num[2]%num[3]%num[4]/num[5]);
			else break;
		}
	}
}
