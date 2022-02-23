package chapter01;

public class test {
public static void main(String[] args) {
	
		String a = "10,000";

		
		System.out.println(a);
		
		a = a.replaceAll("[^\\d]*", "");
		
		System.out.println(a);
		
	}
		
		
		
	
}
