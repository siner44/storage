package chapter11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HashMapTest {
	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		// 데이터 저장 : put(key, value)
		map.put(new Integer(1), "SIN");
		map.put(3, "KIM");
		map.put(4, "LEE");

		// 데이터 참조 : get(key)
		System.out.println(map.get(1));
		System.out.println(map.get(new Integer(3)));
		System.out.println(map.get(4));
		
		// 데이터의 삭제: remove(key)
		map.remove(3);
		System.out.println("key 3을 삭제");
		System.out.println(map.get(3));
		
		map.put(5, "Yoo");
		
		// 데이터 일괄 처리
//		Set<Integer> set = map.keySet();
//		Iterator<Integer> itr = set.iterator();
		Iterator<Integer> itr = map.keySet().iterator();
		while(itr.hasNext()) {
			System.out.println(map.get(itr.next()));
		}
		
		System.out.println("-----------------------------------");
		
		for(Map.Entry<Integer, String> e : map.entrySet()) {
			System.out.println("("+e.getKey()+", "+e.getValue()+")");
			
		}
		
		
	}
}
