package innerclass;

class Inner3 {
	int y = 20;

	public void dp() {
		System.out.println("부모 클래스의 dp 메소드");
	}
}

public class Anony02 {
	public void fun() {
		Inner3 i = new Inner3() {
			public void dp() {
				System.out.println("자식 클래스의 dp 메소드");
			}
			public void make() {
				System.out.println("make 메소드");
			}
		};
		i.dp();
	}
	
	public static void main(String[] args) {
		Anony02 a = new Anony02();
		a.fun();
	}
}
