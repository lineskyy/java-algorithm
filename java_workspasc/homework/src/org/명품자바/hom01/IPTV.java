package org.java.hom01;

//5-1번
class TV{
	private int size; //protected int size;
	
	public TV(int size) {
		this.size=size;
	}
	//protected 동일 패키지 안에 속하는 클래스 와 하위 클래스에서 접근 가능하다.
	protected int getSize(){ 
		return size;
	}
	
}
class ColorTv extends TV{
	private int Color;
	public ColorTv(int size,int Color) {
		super(size);
		this.Color=Color; 
	}
	
	public void printproperty1() {
		System.out.println(getSize()+" 인치"+Color+" 컬러");
	}
}
class IPTV extends ColorTv{
	private String IP;
	public IPTV(String IP,int size,int Color) {
		super(size, Color);
		this.IP=IP;
	}
	public void printproperty() {
		System.out.println(IP+"주소의 ");
		super.printproperty1(); 
	}
	
	public static void main(String[] args) {
		IPTV tv= new IPTV("나의 IPTV는 192.1.1.2",32,1024);
		tv.printproperty();
	}
}	

