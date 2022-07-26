package chapter09;

public class WrapperTest03 {
	public static void main(String[] args) {
		
		// 명시적
		Integer i1 = new Integer(12);
		Integer i2 = new Integer(34);
		
		int num = i1 + i2;
		System.out.println("num : " + num);
		
		// 암시적
		Integer i3 = 56;
		Integer i4 = 78;
		
		int num2 = i3 + i4;
		System.out.println("num2 : " + num2);
		
	}
}
