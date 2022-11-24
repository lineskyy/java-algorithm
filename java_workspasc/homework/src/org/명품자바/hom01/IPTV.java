package org.java.hom01;

//5-1��
class TV{
	private int size; //protected int size;
	
	public TV(int size) {
		this.size=size;
	}
	//protected ���� ��Ű�� �ȿ� ���ϴ� Ŭ���� �� ���� Ŭ�������� ���� �����ϴ�.
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
		System.out.println(getSize()+" ��ġ"+Color+" �÷�");
	}
}
class IPTV extends ColorTv{
	private String IP;
	public IPTV(String IP,int size,int Color) {
		super(size, Color);
		this.IP=IP;
	}
	public void printproperty() {
		System.out.println(IP+"�ּ��� ");
		super.printproperty1(); 
	}
	
	public static void main(String[] args) {
		IPTV tv= new IPTV("���� IPTV�� 192.1.1.2",32,1024);
		tv.printproperty();
	}
}	

