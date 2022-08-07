package chapter11;

import java.util.HashMap;

public class HashMapTest01 {
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("사과", 10);
		map.put("바나나", 20);
		map.put("포도", 30);
		map.put("수박", 40);
		map.put("참외", 50);
		map.put("딸기", 60);
		map.put("멜론", null);
		
		System.out.println(map);
		System.out.println();
		
		int num = map.get("사과");
		System.out.println("사과 수량 : " + num);
		
		
	}
	
	
}
