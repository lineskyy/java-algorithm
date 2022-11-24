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
		System.out.print("인원수 >>");
		num = sc.nextInt();
		
		
		ph = new Phones[num];
		input();
		
	}
	public void input() {
		for(int i=0; i< num; i++) {
			System.out.print("이름과 번호를 입력 하시오 >>");
			ph[i]= new Phones();
			String name = sc.next();
			String tel = sc.next();
			ph[i] = new Phones(name,tel);
		}	
		System.out.println("저장되었습니다.");
		seachs();
	}
	public void seachs() {
		for(int i=0; i< ph.length; i++) {
			System.out.print("검색할 이름을 입력 하세요 >>");
			serach = sc.next();
			if(serach.equals("그만")) {
				System.out.print("프로그램 종료.");
				break;
			}
			Flags();
		}
	}
		public void Flags() {
			boolean flag =true;
			for(int i=0; i<ph.length; i++) {
			if(serach.equals(ph[i].getName())) {
				System.out.print(ph[i].getName()+" 번호는"+ph[i].getTel()+"\n");
				flag =false;
			}
		}
			if(flag) { System.out.print(serach+"없습니다.\n");seachs();}
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
	


