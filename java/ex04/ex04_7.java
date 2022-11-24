package org.java.ex04;

import java.util.Scanner;

class Day{ // Ŭ���� ����
	private String work; // ����
	private int inputDay; // �Է³��� ���� ���� Ŭ���� ���, �ʵ�
	
	public Day() {} // ������ ������ main���� ȣ�� �ȵ�
	public Day(int inputDay,String work) { //Ŭ������ ������ ������ ����ϱ����� �����ڷ� �޾ƿ�
		this.inputDay=inputDay; //this Ŭ������ ������ ������ �����Ѵ�.
		this.work=work;
	}
	//���� ���� Ŭ���� �ʵ忡 ������ Ŭ���� ���(����)�����ϱ� ����
	public void setwork(String work) {this.work=work;} //����setwork(����)
	//���� Day day; ���� Ŭ���� ��ü�� �ν��ͽ��� day ������ ���� �ߴٸ� day.getWork; �̷������� ���
	public String getwork() {return work;} 
	
	public void setinputDay(int inputDay) {this.inputDay=inputDay;}
	public int getinputDay() {return inputDay;}
	
	public void show() {
		if(work == null) System.out.println("�����ϴ�.");
		else System.out.println(getinputDay()+"�Ͽ� �� ���� "+getwork()+" �Դϴ�.");

	}
}

class MonthSchedule extends Day{ //Ŭ���� Day�� ��ӹ���
	Scanner scan = new Scanner(System.in);
	
	Day[] day; // ����� Ȯ�� 
	private int[] month=new int[30]; //1~30 �� ���ڰ� �ʿ��ϱ� ������ �迭 ����
	private String[] menu = {"�Է�","����","������"}; //�޴� �迭����
	int outputDay;
	
	public MonthSchedule() {}
	// ���� Ŭ���� �ȿ��� ����� �������̱� ������ Ŭ���� �ʵ� ��� ���� ���ص� �� 
	public MonthSchedule(int inputDay,String work,String[] menu,int[] month,int outputDay) {
		super(inputDay,work);
		this.menu=menu;
		this.month=month;
		this.outputDay=outputDay;
	}
	
	void start() {
		System.out.print("�̹��� ������ ���� ���α׷� ����\n");
		setSchedule();
	}
	void setSchedule() {
		System.out.print("����(");
		//������ 3���� �޴��迭 �� ���̸� �ݺ��ؼ� �޴�â �����
		for(int i=0; i<menu.length; i++) { 
			// �޴��� ���̰� �Ѿ�鼭 i�� ����ǰ� i�� 0���� ���� �ϱ� ������ i+1 �ϸ� 1,2,3����
			System.out.printf("%s:%d",menu[i],i+1); //       menu.length-1 = 2(������)
			System.out.print((i==menu.length-1)? "":",");//i =(0,    1,   2)
		}										//menu.length=(0,    1,   2)
		System.out.print(")>>");						//  (�������� �������� ����)  �����̸�"," ���̸� ����
		//day=30���� �迭, ���Ϲ��� Day Ŭ������ inputday �Լ��� ��ĵ �Է¹��� �迭�� ����
		day[getinputDay()]=scan.nextInt();
		setWork();
	}
	void setWork() {
		
		if(day[getinputDay()]==1) {// ����� �Է°��� 1�� ������ ��������
			System.out.print("�Է� ��¥(1~30)");
			setinputDay(scan.nextInt());
			System.out.print("����(��ĭ���� �Է�) >>"); // ��¥ day ���� work
			setwork(scan.next());
			setSchedule();
		}else if(day[getinputDay()]==2) {// ����� �Է°��� 2�� ������ ��������
			System.out.print("��ȸ ��¥(1~30)");
			setinputDay(scan.nextInt());
			show(); // Day Ŭ������ show() �޼ҵ� ���� ���ǹ� ������ 
			setSchedule();// �ٽ� ��
		}else if(day[getinputDay()]==3){end();} //���� ���Ͻ� end()�Լ� ���α׷�����
		
	}
	
	void end() {
		
		System.out.println("���α׷��� ���� �մϴ�.");
	}
	void run() { // �׳� ����
		start();
	}
}	
public class ex04_7 {
	public static void main(String[] args) {
		//Day�� ��ӹ��� MonthSchedule Ŭ������ MonthSchedule()������ ȣ�� �� �ν��Ͻ����� ms ���� 
		MonthSchedule ms = new MonthSchedule(); 
		ms.run();//����
	}	
}
		
//package org.java.ex04;
//
//import java.util.Scanner;
//
//class Day{ // Ŭ���� ����
//	private String work; // ����
//	private int inputDay; // �Է³��� ���� ���� Ŭ���� ���, �ʵ�
//	
//	public Day() {} // ������ ������ main���� ȣ�� �ȵ� -> �����ڰ� ������ main���� ȣ���� �ȵȴٱ⺸�ٴ�, �����ڴ� ��ü�� �������ڸ��� ���ư��� �Լ�? ��� �����ϴ� �� ������! �׷��� ���� �����ڸ� ������, ���� Day��� Ŭ������ ��ü�� �����ϴ� ����� ���� ������ �� �� �ִ°���. ���� public Day() {} �̷� ������ �����ڸ� ���������, 
//Day day = new Day(); �̷��� ��ü�� ������ ���� �ִ°ž�. �׷��� ���� �� ���� ������ �ؿ� ������ ����� ����.
//	public Day(int inputDay,String work) { //Ŭ������ ������ ������ ����ϱ����� �����ڷ� �޾ƿ�
//		this.inputDay=inputDay; //this Ŭ������ ������ ������ �����Ѵ�.
//		this.work=work;
//	}
//// �� �����ڴ� int inputDay,String work ��� �ΰ��� �Ű������� ���ؼ� Ŭ������ �����ϰڴٰ� ���� ����� ���Ѱž�.�׷��ϱ� �� �������Լ��� ���� �����ϱ� ����, Day day = new Day(20,"��"); �̷��Ե� Day��� Ŭ���� ��ü�� ���� ���� �־�������. �׸��� �̷��� ����� �� ��ü�� inputDay�� 20, work�� "��" �̶�� �� �ִ� DayŬ������ü�� �����Ǵ°���. ������ �Լ��� ���ؼ��� � ������� Ŭ������ü�� �����ϰڴ�!��� �� �����س��´ٰ� �����ϸ� ����.
//	//���� ���� Ŭ���� �ʵ忡 ������ Ŭ���� ���(����)�����ϱ� ����
//	public void setwork(String work) {this.work=work;} //����setwork(����)
//	//���� Day day; ���� Ŭ���� ��ü�� �ν��ͽ��� day ������ ���� �ߴٸ� day.getWork; �̷������� ���
//	public String getwork() {return work;} 
//	// �̰� ���� �� �� ������, �׷��� �� �� ¤�� �Ѿ�ڸ�, ��������� private String work; �̷��� private���� �����ϸ�, �ٸ� Ŭ���������� work�� ������ ���� ���ݾ�. �׷����� �ٸ� Ŭ�������� work�� ��ߵ�. �׷��� �ٷ� ���������ϱ� getter�Լ��� ����ؼ� ����������? public String getwork() {return work;} �̷�������! return work;���� �����ϱ� ��� work�� ��ȯ�ϴ� �Լ��� �����ݾ�. �׷��� �� �޼ҵ�� �� �ٸ� Ŭ�������� �� �� �ֳ�? �� Ŭ������ public���� �����س����ϱ�! �ٸ� Ŭ�������� ������ �����Ѱž�. �׷��ϱ� �� �Ӹ� �ƴ϶� Ŭ������ private�� ���𰡰� �ִµ�, �ٸ� Ŭ�������� �����ϰ� �ʹ�? �׷���, public�� �޼ҵ带 ���� private�� ���𰡿� ������ �� �ְԸ� ���� ����������, �ٸ� Ŭ�������� public�� �޼ҵ带 ����ؼ� private�� ������ �����ϴ� ������ �ؾ���.
//	public void setinputDay(int inputDay) {this.inputDay=inputDay;}
//	public int getinputDay() {return inputDay;}
//	
//	public void show() {
//		if(work == null) System.out.println("�����ϴ�.");
//		else System.out.println(inputDay+"�Ͽ� �� ���� "+work+" �Դϴ�.");
//
//	}
//}
//class MonthSchedule extends Day{ //Ŭ���� Day�� ��ӹ���
//	Scanner scan = new Scanner(System.in);
//	
//	private int[] day=new int[30]; //1~30 �� ���ڰ� �ʿ��ϱ� ������ �迭 ���� -> ���⼭�� �迭 �����̶�� ���ٴ� ĭ�� 30�� ¥�� �迭�� ����ϰڴ�. �ٵ� �������� day��. ���� �س��°ž�. ������ �����ϱ� ������!
//	private String[] menu = {"�Է�","����","������"}; //�޴� �迭����
//	int outputDay;
//	
//	public MonthSchedule() {}
//	// ���� Ŭ���� �ȿ��� ����� �������̱� ������ Ŭ���� �ʵ� ��� ���� ���ص� �� 
//	public MonthSchedule(int inputDay,String work,String[] menu,int[] day,int outputDay) {
//		super(inputDay,work);
//		this.menu=menu;
//		this.day=day;
//		this.outputDay=outputDay;
//	}
//	
//	void start() {
//		System.out.print("�̹��� ������ ���� ���α׷� ����\n");
//		setSchedule();
//	}
//	void setSchedule() {
//		System.out.print("����(");
//		//������ 3���� �޴��迭 �� ���̸� �ݺ��ؼ� �޴�â �����
//		for(int i=0; i<menu.length; i++) { 
//			// �޴��� ���̰� �Ѿ�鼭 i�� ����ǰ� i�� 0���� ���� �ϱ� ������ i+1 �ϸ� 1,2,3����
//-> i�� 0���� ���۵Ǵµ�,  i<menu.length �� ���� ������ �ݺ��Ұž�. �׷��� �ѹ������ϰ���, i++ �ǰ� �Ұž�. ��, i�� 1�� �����Ұž�.  
//			System.out.printf("%s:%d",menu[i],i+1); //       menu.length-1 = 2(������)
//			System.out.print((i==menu.length-1)? "":",");//i =(0,    1,   2)
//		}										//menu.length=(0,    1,   2)
//		System.out.print(")>>");						//  (�������� �������� ����)  �����̸�"," ���̸� ����
//		//day=30���� �迭, ���Ϲ��� Day Ŭ������ inputday �Լ��� ��ĵ �Է¹��� �迭�� ����
//		day[getinputDay()] = scan.nextInt();
//		setWork();
//	}
//	void setWork() {
//		
//		if(day[getinputDay()]==1) {// ����� �Է°��� 1�� ������ ��������
//			System.out.print("�Է� ��¥(1~30)");
//			setinputDay(scan.nextInt());
//			System.out.print("����(��ĭ���� �Է�) >>"); // ��¥ day ���� work
//			setwork(scan.next());
//			setSchedule();
//		}else if(day[getinputDay()]==2) {// ����� �Է°��� 2�� ������ ��������
//			System.out.print("��ȸ ��¥(1~30)");
//			setinputDay(scan.nextInt());
//			show(); // Day Ŭ������ show() �޼ҵ� ���� ���ǹ� ������ 
//			setSchedule();// �ٽ� ��
//		}else if(day[getinputDay()]==3){end();} //���� ���Ͻ� end()�Լ� ���α׷�����
//		
//	}
//	
//	void end() {
//		
//		System.out.println("���α׷��� ���� �մϴ�.");
//	}
//	void run() { // �׳� ����
//		start();
//	}
//}	
//public class ex04_7 {
//	public static void main(String[] args) {
//		//Day�� ��ӹ��� MonthSchedule Ŭ������ MonthSchedule()������ ȣ�� �� �ν��Ͻ����� ms ���� 
//// -> MonthSchedule ��� Ŭ��������ǵ�, �������� ms�� �Ұž�. 
////  new MonthSchedule();  -> MonthSchedule��� ��ü �����ҰŴ�. MonthSchedule(); �Ű��������� �⺻ �������Լ��� ���ؼ�. ms�� ���������� MonthScheduleŬ������ ����Ű�� �ִ°���.
//		MonthSchedule ms = new MonthSchedule(); 
//		ms.run();//���� 
//	}	
//}		
		
		
		
		
	
		
		
		
		
		

			
		
		
	

