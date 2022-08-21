package chapter12;

import java.io.IOException;

public class Input01 {
	public static void main(String[] args) {
		try {
			System.out.println("영문자 입력 : ");
			int a;
			a = System.in.read();
			
			System.out.println(a + ", " + (char)a);
			
			System.in.read();
			System.in.read();
			
			System.out.println("숫자 입력 : ");
			
			int b = System.in.read() - 48;
			System.out.println(b);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
