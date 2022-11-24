package org.java.ex04;

import java.util.Scanner;

class Day{ // 클래스 생성
	private String work; // 할일
	private int inputDay; // 입력날자 변수 생성 클래스 멤버, 필드
	
	public Day() {} // 생성자 없으면 main에서 호출 안됨
	public Day(int inputDay,String work) { //클래스에 선언한 변수를 사용하기위해 생성자로 받아옴
		this.inputDay=inputDay; //this 클래스에 생성된 변수를 참조한다.
		this.work=work;
	}
	//게터 세터 클래스 필드에 선언한 클래스 멤버(변수)접근하기 위함
	public void setwork(String work) {this.work=work;} //사용법setwork(변수)
	//사용법 Day day; 만약 클래스 객체의 인스터스로 day 변수를 선언 했다면 day.getWork; 이런식으로 사용
	public String getwork() {return work;} 
	
	public void setinputDay(int inputDay) {this.inputDay=inputDay;}
	public int getinputDay() {return inputDay;}
	
	public void show() {
		if(work == null) System.out.println("없습니다.");
		else System.out.println(getinputDay()+"일에 할 일은 "+getwork()+" 입니다.");

	}
}

class MonthSchedule extends Day{ //클래스 Day를 상속받음
	Scanner scan = new Scanner(System.in);
	
	Day[] day; // 상속은 확장 
	private int[] month=new int[30]; //1~30 의 날자가 필요하기 때문에 배열 생성
	private String[] menu = {"입력","보기","끝내기"}; //메뉴 배열생성
	int outputDay;
	
	public MonthSchedule() {}
	// 같은 클래스 안에서 사용할 변수들이기 때문에 클래스 필드 멤버 선언 안해도 됨 
	public MonthSchedule(int inputDay,String work,String[] menu,int[] month,int outputDay) {
		super(inputDay,work);
		this.menu=menu;
		this.month=month;
		this.outputDay=outputDay;
	}
	
	void start() {
		System.out.print("이번달 스케쥴 관리 프로그램 시작\n");
		setSchedule();
	}
	void setSchedule() {
		System.out.print("할일(");
		//생성된 3개의 메뉴배열 의 길이를 반복해서 메뉴창 만들기
		for(int i=0; i<menu.length; i++) { 
			// 메뉴의 길이가 넘어가면서 i에 저장되고 i는 0부터 시작 하기 때문에 i+1 하면 1,2,3나옴
			System.out.printf("%s:%d",menu[i],i+1); //       menu.length-1 = 2(끝내기)
			System.out.print((i==menu.length-1)? "":",");//i =(0,    1,   2)
		}										//menu.length=(0,    1,   2)
		System.out.print(")>>");						//  (같지않음 같지않음 같음)  거짓이면"," 참이면 공백
		//day=30개의 배열, 리턴받은 Day 클래스의 inputday 함수로 스캔 입력받음 배열에 저장
		day[getinputDay()]=scan.nextInt();
		setWork();
	}
	void setWork() {
		
		if(day[getinputDay()]==1) {// 저장된 입력값이 1과 같으면 다음실행
			System.out.print("입력 날짜(1~30)");
			setinputDay(scan.nextInt());
			System.out.print("할일(빈칸없이 입력) >>"); // 날짜 day 할일 work
			setwork(scan.next());
			setSchedule();
		}else if(day[getinputDay()]==2) {// 저장된 입력값이 2과 같으면 다음실행
			System.out.print("조회 날짜(1~30)");
			setinputDay(scan.nextInt());
			show(); // Day 클래스의 show() 메소드 가서 조건문 실행후 
			setSchedule();// 다시 돔
		}else if(day[getinputDay()]==3){end();} //조건 동일시 end()함수 프로그램종료
		
	}
	
	void end() {
		
		System.out.println("프로그램은 종료 합니다.");
	}
	void run() { // 그냥 만듬
		start();
	}
}	
public class ex04_7 {
	public static void main(String[] args) {
		//Day를 상속받은 MonthSchedule 클래스의 MonthSchedule()생성자 호출 후 인스턴스변수 ms 생성 
		MonthSchedule ms = new MonthSchedule(); 
		ms.run();//실행
	}	
}
		
//package org.java.ex04;
//
//import java.util.Scanner;
//
//class Day{ // 클래스 생성
//	private String work; // 할일
//	private int inputDay; // 입력날자 변수 생성 클래스 멤버, 필드
//	
//	public Day() {} // 생성자 없으면 main에서 호출 안됨 -> 생성자가 없으면 main에서 호출이 안된다기보다는, 생성자는 객체를 생성하자마자 돌아가는 함수? 라고 생각하는 게 좋을듯! 그런데 이제 생성자를 만지면, 형이 Day라는 클래스의 객체를 생성하는 방식을 형이 설정을 할 수 있는거지. 지금 public Day() {} 이런 식으로 생성자를 만들었으면, 
//Day day = new Day(); 이렇게 객체를 생성할 수가 있는거야. 그런데 이제 또 형이 설정한 밑에 생성자 방식을 보자.
//	public Day(int inputDay,String work) { //클래스에 선언한 변수를 사용하기위해 생성자로 받아옴
//		this.inputDay=inputDay; //this 클래스에 생성된 변수를 참조한다.
//		this.work=work;
//	}
//// 이 생성자는 int inputDay,String work 라는 두개의 매개변수를 통해서 클래스를 생성하겠다고 형이 방식을 정한거야.그러니까 이 생성자함수를 형이 썼으니까 이제, Day day = new Day(20,"일"); 이렇게도 Day라는 클래스 객체를 만들 수가 있어진거지. 그리고 이렇게 만들면 이 객체는 inputDay에 20, work에 "일" 이라고 들어가 있는 Day클래스객체가 생성되는거지. 생성자 함수를 통해서는 어떤 방식으로 클래스객체를 생성하겠다!라는 걸 지정해놓는다고 생각하면 편해.
//	//게터 세터 클래스 필드에 선언한 클래스 멤버(변수)접근하기 위함
//	public void setwork(String work) {this.work=work;} //사용법setwork(변수)
//	//사용법 Day day; 만약 클래스 객체의 인스터스로 day 변수를 선언 했다면 day.getWork; 이런식으로 사용
//	public String getwork() {return work;} 
//	// 이건 형이 알 것 같지만, 그래도 한 번 짚고 넘어가자면, 멤버변수를 private String work; 이렇게 private으로 설정하면, 다른 클래스에서는 work에 접근할 수가 없잖아. 그런데도 다른 클래스에서 work를 써야돼. 그러면 바로 못가져오니까 getter함수를 사용해서 가져오겠지? public String getwork() {return work;} 이런식으로! return work;으로 끝나니까 사실 work만 반환하는 함수일 뿐이잖아. 그런데 이 메소드는 왜 다른 클래스에서 쓸 수 있냐? 이 클래스는 public으로 설정해놨으니까! 다른 클래스에서 접근이 가능한거야. 그러니까 이 뿐만 아니라 클래스에 private한 무언가가 있는데, 다른 클래스에서 접근하고 싶다? 그러면, public한 메소드를 만들어서 private한 무언가에 접근할 수 있게만 형이 만들어놓으면, 다른 클래스에서 public한 메소드를 사용해서 private한 변수에 접근하는 식으로 해야지.
//	public void setinputDay(int inputDay) {this.inputDay=inputDay;}
//	public int getinputDay() {return inputDay;}
//	
//	public void show() {
//		if(work == null) System.out.println("없습니다.");
//		else System.out.println(inputDay+"일에 할 일은 "+work+" 입니다.");
//
//	}
//}
//class MonthSchedule extends Day{ //클래스 Day를 상속받음
//	Scanner scan = new Scanner(System.in);
//	
//	private int[] day=new int[30]; //1~30 의 날자가 필요하기 때문에 배열 생성 -> 여기서는 배열 생성이라기 보다는 칸이 30개 짜리 배열을 사용하겠다. 근데 참조값은 day로. 선언만 해놓는거야. 엄밀히 생성하기 전이지!
//	private String[] menu = {"입력","보기","끝내기"}; //메뉴 배열생성
//	int outputDay;
//	
//	public MonthSchedule() {}
//	// 같은 클래스 안에서 사용할 변수들이기 때문에 클래스 필드 멤버 선언 안해도 됨 
//	public MonthSchedule(int inputDay,String work,String[] menu,int[] day,int outputDay) {
//		super(inputDay,work);
//		this.menu=menu;
//		this.day=day;
//		this.outputDay=outputDay;
//	}
//	
//	void start() {
//		System.out.print("이번달 스케쥴 관리 프로그램 시작\n");
//		setSchedule();
//	}
//	void setSchedule() {
//		System.out.print("할일(");
//		//생성된 3개의 메뉴배열 의 길이를 반복해서 메뉴창 만들기
//		for(int i=0; i<menu.length; i++) { 
//			// 메뉴의 길이가 넘어가면서 i에 저장되고 i는 0부터 시작 하기 때문에 i+1 하면 1,2,3나옴
//-> i는 0에서 시작되는데,  i<menu.length 가 참일 때까지 반복할거야. 그런데 한번실행하고나면, i++ 되게 할거야. 즉, i는 1씩 증가할거야.  
//			System.out.printf("%s:%d",menu[i],i+1); //       menu.length-1 = 2(끝내기)
//			System.out.print((i==menu.length-1)? "":",");//i =(0,    1,   2)
//		}										//menu.length=(0,    1,   2)
//		System.out.print(")>>");						//  (같지않음 같지않음 같음)  거짓이면"," 참이면 공백
//		//day=30개의 배열, 리턴받은 Day 클래스의 inputday 함수로 스캔 입력받음 배열에 저장
//		day[getinputDay()] = scan.nextInt();
//		setWork();
//	}
//	void setWork() {
//		
//		if(day[getinputDay()]==1) {// 저장된 입력값이 1과 같으면 다음실행
//			System.out.print("입력 날짜(1~30)");
//			setinputDay(scan.nextInt());
//			System.out.print("할일(빈칸없이 입력) >>"); // 날짜 day 할일 work
//			setwork(scan.next());
//			setSchedule();
//		}else if(day[getinputDay()]==2) {// 저장된 입력값이 2과 같으면 다음실행
//			System.out.print("조회 날짜(1~30)");
//			setinputDay(scan.nextInt());
//			show(); // Day 클래스의 show() 메소드 가서 조건문 실행후 
//			setSchedule();// 다시 돔
//		}else if(day[getinputDay()]==3){end();} //조건 동일시 end()함수 프로그램종료
//		
//	}
//	
//	void end() {
//		
//		System.out.println("프로그램은 종료 합니다.");
//	}
//	void run() { // 그냥 만듬
//		start();
//	}
//}	
//public class ex04_7 {
//	public static void main(String[] args) {
//		//Day를 상속받은 MonthSchedule 클래스의 MonthSchedule()생성자 호출 후 인스턴스변수 ms 생성 
//// -> MonthSchedule 라는 클래스만들건데, 참조값은 ms로 할거야. 
////  new MonthSchedule();  -> MonthSchedule라는 객체 생성할거다. MonthSchedule(); 매개변수없이 기본 생성자함수를 통해서. ms는 참조값으로 MonthSchedule클래스를 가리키고 있는거지.
//		MonthSchedule ms = new MonthSchedule(); 
//		ms.run();//실행 
//	}	
//}		
		
		
		
		
	
		
		
		
		
		

			
		
		
	

