package chapter09;

public class WrapperTest02 {
	public static void main(String[] args) {
		boolean b = true;
		
		// 명시적
		Boolean wrapper_a = new Boolean(b);
		
		// 암시적
		Boolean wrapper_a2 = b;
		
		System.out.println(wrapper_a2);
		
		Integer wrapper_b = new Integer(100);
		
		Integer wrapper_b2 = 10;
		
		System.out.println(wrapper_b2);
	}
}
