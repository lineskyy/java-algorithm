package org.java.ex04;

import java.util.Scanner;

class Phone{
	static Scanner sc = new Scanner(System.in);
	 String name; // 클래스 필드에 클래스 멤버변수  
	 String tel;
	public Phone() {}//생성자
	public Phone(String name,String tel) {
		this.name=name; // 필드에 생성된 클래스 멤버 변수 참조
		this.tel=tel;
	}
	// 클래스 멤버 변수에 접근하기 위한 게터세터
	public void setName(String name) {this.name=name;}
	public void setTel(String tel) {this.tel=tel;}
	
	String getName() {return name;}
	public String getTel() {return tel;}
	
	
}

public class PhoneBook extends Phone{ //class Phone 상속
	String search; // 저장된 인원 검색
	int num=0; // 인원수 저장
	Phone[] ph; // Phone클래스의 name tel입력값 저장의 위한 Phone클래스 배열
	
	public PhoneBook() {}//생성자
	public PhoneBook(String name,int num,String tel) {
		super(name,tel);// Phone 클래스의 멤버를 받아옴 super는 this의 어미
		
		this.num=num;
		
	}
	public void start() {
		System.out.print("인원수 >> ");
		num=sc.nextInt();
		ph =new Phone[num]; //인원수를 저장하기 위한 배열
		name_tel(); //넘어감
	}
	public void name_tel() {
		for(int i=0; i<num; i++) { //num에 입력된 값 만큼 name tel 에 입력
			System.out.printf("이름 번호%d >>",i+1);
			ph[i] = new Phone();
			name=sc.next();
			tel=sc.next();
			
			// num이 넘어간 i를 배열에 저장하고 입력값을 배열에 저장 
			ph[i] = new Phone(name,tel);
		}
		System.out.print("저장완료...\n");
		search();
	} 
	public void search() {
		while(true) {
			System.out.print("검색할 이름 >>");
			search =sc.next();//검색할 변수
			if(search.equals("그만")) { //검색 변수에 그만 있으면 시스템종료
				System.out.print("시스템 종료");
				break;
				
			} 
			Flag();
		}	
		
	}
	public void Flag() {//fit.영욱
		boolean flag = true; // true로 초기화
		//ph 배열의 길이를 받아 조건문을 실행하고 조건이 충족되면 플래그 false로 초기화
		for (int i = 0; i < ph.length; i++) {
			if(search.equals(ph[i].getName())){
				System.out.print(ph[i].getName()+" 의 번호는"+ph[i].getTel()+" 입니다.\n"); 
				flag = false; 
				break; //false면 멈춤 밑에 조건문(없습니다.) 실행을 위한 플래그
			}  
		}
		// for문 안에서 돌면 검색한 인원 외의 인원이 없다고 출력됨 
		if(flag) System.out.print(search +" 없습니다.\n");							
		
	}
	public static void main(String[] args) {
		PhoneBook pb= new PhoneBook();
		pb.start();
	}
}
		
			
				
	
			
		
		
			
		
		
		
//인원수 검색할 이름
//이름과 전화번호 문자열로
//그만 equalse