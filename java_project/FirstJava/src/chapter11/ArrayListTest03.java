package chapter11;

import java.util.ArrayList;

public class ArrayListTest03 {
	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList();
		arr.add("손흥민");
		arr.add("박지성");
		arr.add("차범근");
		arr.add("기성용");
		
		for(int i = 0; i<arr.size(); i++) {
			String name = (String)arr.get(i);
		}
		
	}
}
