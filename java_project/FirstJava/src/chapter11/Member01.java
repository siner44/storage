package chapter11;

class Outer {
	int x = 200;

	class Inner {
		int y = 400;
	}
}

public class Member01 {
	public static void main(String[] args) {
		Outer o = new Outer();
		System.out.println(o);
		System.out.println("x : " + o.x);
		System.out.println();
		
		Outer.Inner oi = o.new Inner();
		System.out.println(oi);
		System.out.println("y : " + oi.y);
		
	}
}
