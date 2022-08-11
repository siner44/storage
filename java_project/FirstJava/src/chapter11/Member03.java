package chapter11;

class Outer3{
	int v = 100;
	class Inner3{
		int v = 20;
		public void method() {
			int v = 30;
			System.out.println("지역변수 v : " + v);
			System.out.println("Inner3의 멤버 변수 v : " + this.v);
			System.out.println("Outer3의 멤버 변수 v : " + Outer3.this.v);
		}
	}
}

public class Member03 {
	public static void main(String[] args) {
		Outer3 o3 = new Outer3();
		Outer3.Inner3 oi3 = o3.new Inner3();
		
		oi3.method();
	}
}
