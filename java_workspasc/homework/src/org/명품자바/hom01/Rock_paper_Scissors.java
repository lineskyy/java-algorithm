package org.java.hom01;

import java.util.Scanner;

public class Rock_paper_Scissors {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����(1) ����(2) ��(3) ����:");
		
		// ö��
		
		int chullsu = sc.nextInt();
		
		if (chullsu==1) 
			{System.out.println("ö��:����");}
		if (chullsu==2) 
			{System.out.println("ö��:����");}
		if (chullsu==3) 
			{System.out.println("ö��:��");}
		
		//����
		
		int Younghee =(int)(Math.random()*3);
		
		if (Younghee==1) 
			{System.out.println("����:����");}
		if (Younghee==2) 
			{System.out.println("����:����");}
		if (Younghee==3) 
			{System.out.println("����:��");}
		
		// ��� ���� �϶�
		if (Younghee==1) {
			if (chullsu==1) {
				System.out.println("��� ���ϴ�");}
					
			if (chullsu==2) {
				System.out.println("ö���� �̰���ϴ�");}
					
			if (chullsu==3) {
				System.out.println("���� �̰�3���ϴ�");}
		}
		
		// ��� ���� �϶�
		if (Younghee==2) {
			if (chullsu==1) {
				System.out.println("��� ���ϴ�");}
			
			if (chullsu==2) {
				System.out.println("ö���� �̰���ϴ�");}
			
			if (chullsu==3) {
				System.out.println("���� �̰���ϴ�");}
		}
		// ��� �� �϶�
		if (Younghee==3) {
			if (chullsu==1) {
				System.out.println("��� ���ϴ�");}
			
			if (chullsu==2) {
				System.out.println("ö���� �̰���ϴ�");}
			
			if (chullsu==3) {
				System.out.println("���� �̰���ϴ�");}
		}
	}
}
