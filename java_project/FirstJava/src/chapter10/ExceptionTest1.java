package chapter10;

import java.util.Scanner;

public class ExceptionTest1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("피제수 입력");
		int num1 = sc.nextInt();
		System.out.println("제수 입력");
		int num2 = sc.nextInt();
		
		if(num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
		} else {
			System.out.println(num1/num2);
		}
		
		
		
	}
}
