package org.java.ex02;

import java.util.Scanner;
// 12. ��Ģ ������ �Է¹޾� ����ϴ� ���α׷��� �ۼ��ϰ��� �Ѵ�. 
// �����ڴ� + - * / �� �� ������ �ϰ� �ǿ����ڴ� ��� �Ǽ��� �Ѵ�. 
// �ǿ����ڿ� �����ڴ� ���� ��ʿ� ���� �� ĭ���� �и��Ͽ� �Է��Ѵ�. 
// 0���� ������ �� "0���� ���� �� �����ϴ�."�� ����ϰ� �����Ѵ�.
public class Scanner12 {
	static Scanner sc = new Scanner(System.in);
	public static void sacihc_sw() {
		
		System.out.print("sw���� >>");
		double input = sc.nextInt();
		String yunsan = sc.next();
		double output = sc.nextInt();
		switch (yunsan) {
		case "+":System.out.printf("%s %s %s = %s",input,yunsan,output,input+output);break;
		case "-":System.out.printf("%s %s %s = %s",input,yunsan,output,input-output);break;
		case "/":System.out.printf("%s %s %s = %s",input,yunsan,output,input/output);break;
		case "*":System.out.printf("%s %s %s = %s",input,yunsan,output,input*output);break;
		default:System.out.print("���ǿ� ���� �ʽ��ϴ�.");
			
		}
	}
	public static void sacihc_if() {
		System.out.print("\nif���� >>");
		double input = sc.nextInt();
		String yunsan = sc.next();
		double output = sc.nextInt();
		if(yunsan.equals("+"))
			System.out.printf("%s %s %s = %s",input,yunsan,output,input+output);
		if(yunsan.equals("-"))
			System.out.printf("%s %s %s = %s",input,yunsan,output,input-output);
		if(yunsan.equals("/"))
			System.out.printf("%s %s %s = %s",input,yunsan,output,input/output);
		if(yunsan.equals("*"))
			System.out.printf("%s %s %s = %s",input,yunsan,output,input*output);
	}
	public static void main(String[] args) {
		Scanner12 S12 = new Scanner12();
		S12.sacihc_sw();
		S12.sacihc_if();
		
		}
	}

