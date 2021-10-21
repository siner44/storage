package chapter11;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest2 {
	public static void main(String[] args) {
		
		TreeSet<Person> set = new TreeSet<Person>();
		set.add(new Person("Sin", 28));
		set.add(new Person("Lee", 20));
		set.add(new Person("Kim", 40));
		set.add(new Person("Song", 20));
		Iterator<Person> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
