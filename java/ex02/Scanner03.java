package org.java.ex02;

import java.util.Scanner;
// 3. Scanner 클래스를 이용하여 정수로 된 돈의 액수를 입력받아 
// 오만 원권, 만 원권, 천 원권, 500원짜리 동전, 100원짜리 동전, 
// 50원짜리 동전, 10원짜리 동전, 1원짜리 동전 각 몇개로 변환되는지 
// 출력하라.
class Moneyclass{
	 private int num_1 = 1;
	 private int num_10 = 10;
	 private int num_100 =100;
	 private int num_1000 =1000;
	 private int num_10000 = 10000;
	 private int num_50000 = 50000;
	 //private int num_8 = 0;
	 
	public Moneyclass() {}
	public Moneyclass(int num_1,int num_10,int num_100,int num_1000,int num_10000, int num_50000, int num_8) {
		this.num_1 = num_1;
		this.num_10 = num_10;
		this.num_100 = num_100;
		this.num_1000 = num_1000;
		this.num_10000 = num_10000;
		this.num_50000 = num_50000;
//		this.num_8 = num_8;
		
	}
	public int getnum_1() {return num_1;}
	public int getnum_10() {return num_10;}
	public int getnum_100() {return num_100;}
	public int getnum_1000() {return num_1000;}
	public int getnum_10000() {return num_10000;}
	public int getnum_50000() {return num_50000;}
	
	
}
public class Scanner03 extends Moneyclass{
	
	 private int num_8 = 0;
	 public Scanner03() {}
	public Scanner03(int num_1,int num_10,int num_100,int num_1000,int num_10000, int num_50000, int num_8) {
		super(num_1,num_10,num_100,num_1000,num_10000,num_50000,num_8);
		
	}
	public void run() {
		System.out.print("금액을입력하시오. >>");
		 num_8 = sc.nextInt();
		 System.out.printf("%d 원권 %d 장\n",getnum_50000(),num_8/getnum_50000());
		 System.out.printf("%d 원권 %d 장\n",getnum_10000(),num_8%getnum_50000()/getnum_10000());
		 System.out.printf("%d 원권 %d 장\n",getnum_1000(),num_8%getnum_50000()%getnum_10000()/getnum_1000());
		 System.out.printf("%d 원권 %d 장\n",getnum_100(),num_8%getnum_50000()%getnum_10000()%getnum_1000()/getnum_100());
		 System.out.printf("%d 원권 %d 장\n",getnum_10(),num_8%getnum_50000()%getnum_10000()%getnum_1000()%getnum_100()/getnum_10());
		 System.out.printf("%d 원권 %d 장\n",getnum_1(),num_8%getnum_50000()%getnum_10000()%getnum_1000()%getnum_100()%getnum_10()/getnum_1());

	}
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Scanner03 s3 = new Scanner03();
		s3.run();
	
	}
}
