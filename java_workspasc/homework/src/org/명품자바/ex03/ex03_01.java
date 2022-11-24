package org.java.ex03;
class Whiletest {
	private int sum,i;
	public Whiletest() {}
	public Whiletest(int sum,int i) {
		this.sum=sum;
		this.i=i;
	}
	public int getSum() {return sum;}
	public int getI() {return i;}
	public void setSum(int sum) {this.sum=sum;}
	public void setI(int i) {this.i=i;}
	public void run() {
		
		while(i<100) {
			sum = sum+i;
			i+=2;
		}
		System.out.print("while>> "+i);
	}

}
class Fortest extends Whiletest{
	private int sum,i;
	public Fortest() {}
	public Fortest(int sum,int i) {
		super(sum,i);
	}
	
	public void setFortest() {
		for(;i<100;) {
			sum = sum+i;
			i+=2;
		}
		System.out.print("for>> "+i+"\n");
	}
}
class do_while extends Fortest{
	private int sum,i;
	
	public do_while() {}
	public do_while(int sum,int i) {
		super(sum,i);
	}
	public void setdo_while() {
		do {
		sum = sum+i;
		i+=2;
		}
		while(i<100); 
			
		
		System.out.print("\ndo_while>> "+i);
	}
}

public class ex03_01 {
	public static void main(String[] args) {
		do_while forwhile = new do_while();
		forwhile.setFortest();
		forwhile.run();
		forwhile.setdo_while();
	}
}
