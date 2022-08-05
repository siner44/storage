package chapter11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class HashSetTest04 {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		Random r = new Random();
		
		while(hs.size() < 6) {
			hs.add(r.nextInt(45)+1);
		}
		
		System.out.println(hs);
		System.out.println();
		
		ArrayList<Integer> list = new ArrayList<Integer>(hs);
		Collections.sort(list);
		for(int num : list) {
			System.out.println(num + "\t");
		}
		
		
	}
}
