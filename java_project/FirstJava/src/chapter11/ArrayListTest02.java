package chapter11;

import java.util.ArrayList;

class A{
		public String toString() {
			return "A";
		}
}
class B{}

public class ArrayListTest02 {
	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList();
		
		arr.add(new A());
		arr.add(new B());
		
		arr.add(10);
		arr.add("파랑");
		
		System.out.println(arr);
		
	}
}
