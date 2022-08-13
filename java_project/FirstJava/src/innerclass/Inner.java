package innerclass;

public class Inner {
	
	public static class StaticInner{
		int num = 10;
		static int num2 = 20;
		public void fun() {
			System.out.println("메소드 fun");
		}
		public static void make() {
			System.out.println("메소드 make");
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Inner.StaticInner.num2);
		Inner.StaticInner.make();
		
		Inner.StaticInner s = new StaticInner();
		System.out.println(s.num);
		s.fun();
		
	}
	
}
