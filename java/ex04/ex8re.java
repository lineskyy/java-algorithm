package org.java.ex04;


import java.util.Scanner;
class Phones{
	private  String name;
	private  String tel;
	public Phones() {}
	public Phones(String name,String tel) {
		this.name=name;
		this.tel=tel;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
}
public class ex8re extends Phones{
	private String serach;
	Scanner sc = new Scanner(System.in);
	private int num=0;
	Phones[] ph;
	public ex8re() {}
	public ex8re(String name,String tel) {
		super(name,tel);
	}
	public void start() {
		System.out.print("�ο��� >>");
		num = sc.nextInt();
		
		
		ph = new Phones[num];
		input();
		
	}
	public void input() {
		for(int i=0; i< num; i++) {
			System.out.print("�̸��� ��ȣ�� �Է� �Ͻÿ� >>");
			ph[i]= new Phones();
			String name = sc.next();
			String tel = sc.next();
			ph[i] = new Phones(name,tel);
		}	
		System.out.println("����Ǿ����ϴ�.");
		seachs();
	}
	public void seachs() {
		for(int i=0; i< ph.length; i++) {
			System.out.print("�˻��� �̸��� �Է� �ϼ��� >>");
			serach = sc.next();
			if(serach.equals("�׸�")) {
				System.out.print("���α׷� ����.");
				break;
			}
			Flags();
		}
	}
		public void Flags() {
			boolean flag =true;
			for(int i=0; i<ph.length; i++) {
			if(serach.equals(ph[i].getName())) {
				System.out.print(ph[i].getName()+" ��ȣ��"+ph[i].getTel()+"\n");
				flag =false;
			}
		}
			if(flag) { System.out.print(serach+"�����ϴ�.\n");seachs();}
	}
	
	public static void main(String[] args) {
		ex8re ps = new ex8re();
		ps.start();
		
	
		
	
		
		
		
		
		
			
		
			
			
			
		
		
	}
	private static boolean isNumber(int num) {
		num=0;
		return true;
	}
		
}		
	


