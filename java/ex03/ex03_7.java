package org.java.ex03;

import java.util.Arrays;
import java.util.Random;

public class ex03_7 {
	public static void main(String[] args) {
		Random r = new Random();
		float[] n = new float[10];
		float sums=0;
		float z= 0;
		
		
		 for(int i =0; i<n.length; i++) {
			 //n[i] = 1+r.nextInt(10);
			 n[i]= (int)(Math.random()*10+1);
			sums+=n[i];
		 }
		 System.out.print("·£´ýÇÑ Á¤¼ö>>"+Arrays.toString(n));
		
		 for(int j=0; j<n.length; j++) {
			z = sums/n.length;
		 }
		 System.out.printf("\nÆò±ÕÀº %.1f",z);
	}
}
