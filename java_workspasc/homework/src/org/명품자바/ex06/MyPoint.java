package ex06;
// 명품자바 6장 1번 
// main()이 실행되면 아래 예시와 같이 출력되도록 MyPoint 클래스를 작성하라.
class MyPoint {
	private int first,second;

	public MyPoint(int first,int second) {
		this.first =first;
		this.second=second;
		
	}
	@Override
	public String toString() {
		return "MyPoint (" + first + "," + second + ")";
	}
	
	public boolean mypoint(MyPoint m) {
		
		if(first==m.first && second==m.second)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		MyPoint mp = new MyPoint(3,50);
		MyPoint mq = new MyPoint(3,50);
		System.out.println(mp);
		if(mp.mypoint(mq)) {
			System.out.println("같은점");
		}else {
			System.out.println("다른점");
		}
	}


}

