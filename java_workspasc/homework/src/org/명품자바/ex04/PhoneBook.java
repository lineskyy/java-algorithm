package org.java.ex04;

import java.util.Scanner;

class Phone{
	static Scanner sc = new Scanner(System.in);
	 String name; // Ŭ���� �ʵ忡 Ŭ���� �������  
	 String tel;
	public Phone() {}//������
	public Phone(String name,String tel) {
		this.name=name; // �ʵ忡 ������ Ŭ���� ��� ���� ����
		this.tel=tel;
	}
	// Ŭ���� ��� ������ �����ϱ� ���� ���ͼ���
	public void setName(String name) {this.name=name;}
	public void setTel(String tel) {this.tel=tel;}
	
	String getName() {return name;}
	public String getTel() {return tel;}
	
	
}

public class PhoneBook extends Phone{ //class Phone ���
	String search; // ����� �ο� �˻�
	int num=0; // �ο��� ����
	Phone[] ph; // PhoneŬ������ name tel�Է°� ������ ���� PhoneŬ���� �迭
	
	public PhoneBook() {}//������
	public PhoneBook(String name,int num,String tel) {
		super(name,tel);// Phone Ŭ������ ����� �޾ƿ� super�� this�� ���
		
		this.num=num;
		
	}
	public void start() {
		System.out.print("�ο��� >> ");
		num=sc.nextInt();
		ph =new Phone[num]; //�ο����� �����ϱ� ���� �迭
		name_tel(); //�Ѿ
	}
	public void name_tel() {
		for(int i=0; i<num; i++) { //num�� �Էµ� �� ��ŭ name tel �� �Է�
			System.out.printf("�̸� ��ȣ%d >>",i+1);
			ph[i] = new Phone();
			name=sc.next();
			tel=sc.next();
			
			// num�� �Ѿ i�� �迭�� �����ϰ� �Է°��� �迭�� ���� 
			ph[i] = new Phone(name,tel);
		}
		System.out.print("����Ϸ�...\n");
		search();
	} 
	public void search() {
		while(true) {
			System.out.print("�˻��� �̸� >>");
			search =sc.next();//�˻��� ����
			if(search.equals("�׸�")) { //�˻� ������ �׸� ������ �ý�������
				System.out.print("�ý��� ����");
				break;
				
			} 
			Flag();
		}	
		
	}
	public void Flag() {//fit.����
		boolean flag = true; // true�� �ʱ�ȭ
		//ph �迭�� ���̸� �޾� ���ǹ��� �����ϰ� ������ �����Ǹ� �÷��� false�� �ʱ�ȭ
		for (int i = 0; i < ph.length; i++) {
			if(search.equals(ph[i].getName())){
				System.out.print(ph[i].getName()+" �� ��ȣ��"+ph[i].getTel()+" �Դϴ�.\n"); 
				flag = false; 
				break; //false�� ���� �ؿ� ���ǹ�(�����ϴ�.) ������ ���� �÷���
			}  
		}
		// for�� �ȿ��� ���� �˻��� �ο� ���� �ο��� ���ٰ� ��µ� 
		if(flag) System.out.print(search +" �����ϴ�.\n");							
		
	}
	public static void main(String[] args) {
		PhoneBook pb= new PhoneBook();
		pb.start();
	}
}
		
			
				
	
			
		
		
			
		
		
		
//�ο��� �˻��� �̸�
//�̸��� ��ȭ��ȣ ���ڿ���
//�׸� equalse