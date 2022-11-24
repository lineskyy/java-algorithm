package org.java.ex04;
class TV{
	private String maker;
	private int year;
	private int inch;
	
	public TV() {}
	public TV(String maker,int year,int inch) {
		this.maker=maker;
		this.year=year;
		this.inch=inch;
	}
	public String getmaker() {return maker;}
	public int getyear() {return year;}
	public int getinch() {return inch;}
	void show() {
		System.out.println(getmaker()+"에서만든"+getyear()+"년형"+getinch()+"인치 Tv");

	}
	
}
public class ex04_1 {
	public static void main(String[] args) {
		TV tv = new TV("LG",2017,32);
		tv.show();
	}
}
