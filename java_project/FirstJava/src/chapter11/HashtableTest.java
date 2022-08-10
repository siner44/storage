package chapter11;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableTest {
	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("name", "손흥민");
		ht.put("age", "31");		
		ht.put("tel", "010-1111-1111");
		ht.put("job", "축구선수");
		ht.put("address", "서울");
		
		System.out.println(ht);
		System.out.println();
		
		String name = ht.get("name");
		System.out.println(name);
		System.out.println();
		
		Enumeration<String> e = ht.keys();
		
		while(e.hasMoreElements()) {
			String key = e.nextElement();
			System.out.println(key + ", " + ht.get(key));
		}
		
	}

}
