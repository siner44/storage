package chapter11;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest02 {
	public static void main(String[] args) {
		String[] spt = {"축구", "야구", "농구", "탁구", "당구"};
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		for(int i = 0; i < spt.length; i++) {
			map.put(i, spt[i]);
		}
		
		System.out.println(map);
		System.out.println();
		
		Iterator<Integer> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			Integer key = keys.next();
			System.out.println(key + ", " + map.get(key));
		}
		
	}
}
