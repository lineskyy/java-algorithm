package org.java.ex03;

import java.util.Scanner;

public class ex03_4 {
	static Scanner sc = new Scanner(System.in);
	   public static void main(String[] args) {
		      System.out.print("문자 입력 >>");
		      String s = sc.next();
		      char c = s.charAt(0);
		      for(int i=0; i<=c-'a'; i++) {
		    	  for(char j='a';j<=c-i; j++) {
		    	  System.out.print(j);
		      }
		    	  System.out.println();
		      }
		   }
}
