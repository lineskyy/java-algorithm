package org.java.hom01;

import java.util.Scanner;

public class Day02Homwork02 {
		
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// ���� ,���� ���
		int start_num,end_num;
			System.out.print("���۴� >>");
			start_num = scan.nextInt();
			System.out.print("����� >>");
			end_num = scan.nextInt();
		// ���۴��� ����� ���� Ŭ��� �������� �ٱ��ֱ�	
		if(start_num > end_num) { 
			int tmp = end_num; 
				end_num = start_num; 
				start_num = tmp;
		}
		// �� �� ���� ǥ��	
		for (int i = start_num; i <= end_num; i+=3) {
			for (int l = i; l < 3+i; l++) {
				if(l <= end_num)
				System.out.printf(" %d �� �Դϴ�.\t", l);
			}
			System.out.println();
			//������ ���
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
