package chapter11;

import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		
		Vector<Double> v = new Vector<>();
		
		v.add(10.1);
		v.add(50.4);
		v.add(10.0);
		
		for(Double d : v) {
			System.out.println(d);
		}
		
		System.out.println("------------------------");
		
		double s = 10.0;
		int index = v.indexOf(s);
		if(index != -1) {
			System.out.println(s + "위치 : " + index);
		} else {
			System.out.println(s + "가 존재하지 않습니다.");
		}
		
		System.out.println("------------------------");
		
		double del = 10.1;
		if(v.contains(del)) {
			v.remove(del);
			System.out.println(del + "삭제");
		}
		
		System.out.println(v);
	}
}
