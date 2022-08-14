package innerclass;

class Inner2{
	int y = 20;
	public void dp() {
		System.out.println("Inner의 dp 메소드");
	}
}

public class Anony01 {
	public void fun() {
		class InnerTest extends Inner2{
			int x = 30;
			public void make() {
				System.out.println("make 메소드");
			}
			public void dp() {
				System.out.println("InnerTest의 dp메소드");
			}
		}
		InnerTest i = new InnerTest();
		System.out.println(i.y);
		System.out.println(i.x);
		i.make();
		i.dp();
		System.out.println();
		Inner2 i2 = i;
		System.out.println(i2.y);
		i2.dp();
	}
	public static void main(String[] args) {
		Anony01 a = new Anony01();
		a.fun();
	}
}
