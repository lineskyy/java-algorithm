package ex06;
/*중심을 나타내는 정수x,y와 반지름 radius 필드를 가지는 Circle 클래스를 작성 하고자한다.
생성자는 3대의 인자(x,y,radius)를 받아 해당 필드를 초기화 하고,
equals() 메소드는 두개의 Circle 객체의 중심이 같으면 같은 것으로 판별하도록 한다.*/

public class Circle {
	private int x, y , radius;
	public Circle(int x,int y ,int radius) {
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	
	@Override
	public String toString() {
		return "Circle (" + x + ", " + y + ")"+"반지름"+ radius;
	}

	public boolean equals(Circle c) {
		if(x==c.x && y==c.y) {
			return true;
		}else
			return false;
	}
	public static void main(String[] args) {
		Circle a = new Circle(2,3,5);
		Circle b = new Circle(2,3,30);
		System.out.println("원 a : " +a);
		System.out.println("원 b : " +b);
		if(a.equals(b))
			System.out.println("같은원");
		else
			System.out.println("서로 다른원");

	}

}
