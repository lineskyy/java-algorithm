package ex06;

/*[6장 5번]



Calendar 객체를 생성하면 현재 시간을 알 수 있다. 
프로그램을 실행한 현재 시간이 4시에서 낮 12시 이전이면 "Good Morning"을, 
오후 6시 이전이면 "Good Afternoon"을, 밤 10시 이전이면 "Good Evening"을, 
그 이후는 "Good Night"을 출력하는 프로그램을 작성하라.

출력
현재 시간은 10시 22분입니다.
Good Morning*/
public class Calender {
	private int hour,minute;
	public Calender(int hour,int minute) {this.hour=hour;this.minute=minute;}
	@Override
	public String toString() {
		return "현재시간은 " + hour + "시 " + minute + "분입니다.";
	}
	public String clock(Calender c) {
		String answer ="";
		if(c.hour<12 && c.hour>4) {
			answer= "Good Morning";
		}else if (c.hour<18 && c.hour>12) {
			answer= "good Afternoon";
		}else if(c.hour<22) {
			answer= "good Evening";
		}else answer= "goot night";
		return answer;
	}
	public static void main(String[] args) {
		Calender cl = new Calender(22,22); 
		System.out.println(cl);
		System.out.println(cl.clock(cl));
	}
}
//test
//현재시간은 22시 22분입니다.
//goot night