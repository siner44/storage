package chapter11;

class Outer2{
	private int x = 10;
	
	class Inner2{
		private int y = 20;
		public void make() {
			System.out.println("x : " + x);
			System.out.println("y : " + y);
		}
	}
}

public class Member02 {
	public static void main(String[] args) {
		Outer2 o2 = new Outer2();
		Outer2.Inner2 i2 = o2.new Inner2();
		
		i2.make();
	}
}
