package org.java.hom01;
import java.util.Arrays;
import java.util.Scanner;

public class Day2��4�� {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//���� �Է�
		
		int[] arr = new int[]{1,2,3};
		System.out.print("���� 3�� �Է� >>");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		    Arrays.sort(arr);
		    System.out.print("�߾Ӱ���" +arr[1]+ "�Դϴ�.");
	}
}
		
		
