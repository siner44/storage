package chapter11;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest03 {
	public static void main(String[] args) {
		
		String[] array = {"박지성", "손흥민", "차두리", "차범근", "이영표"};
		HashSet<String> hs = new HashSet<String>();
		
		for(String s : array) {
			hs.add(s);
		}
		
		System.out.println(hs);
		System.out.println();
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println();
		
		for(String s2 : hs) {
			System.out.println(s2);
		}
	}
}
