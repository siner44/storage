package chapter11;

import java.util.LinkedList;

public class QueueTest {
	public static void main(String[] args) {
		String array[] = {"서울", "부산", "대전", "광주", "경주"};
		LinkedList<String> list = new LinkedList<String>();
		
		for(int i = 0; i < array.length; i++) {
			list.offer(array[i]);
		}
		System.out.println(list);
		
		System.out.println();
		
		while(list.peek() != null) {
			System.out.print(list.poll() + " ");
		}
		System.out.println();
		System.out.println(list);
		
		
	}
}
