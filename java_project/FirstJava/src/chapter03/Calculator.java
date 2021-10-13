package chapter03;

import java.util.Scanner;

public class Calculator {
	// Calculator 클래스를 정의해봅시다.

	// final 변수 앞에 -> 상수 또는 클래스 앞에 사용 -> 상속의 대상이 아니다.
	// java에서 상수 : 변수에 최초 초기화된 값을 바꾸지 못한다.
	final float PI = 3.1415f;
	final String USER_NAME;
	
	// 생성자 : 초기화 메소드, 메소드 구조와 유사하지만 반환기능x
	// 클래스 이름(){}
	
	Calculator(String name){
		USER_NAME = name;
	}

	// 정수 두 개를 매개변수의 인자로 전달받아 더하기 연산 후 출력하는 메소드를 정의

	public void plus(int a, int b) {
		long result = (long) a + b;
		System.out.println(a + "+" + b + "=" + result);
	}

	// 정수 두 개를 매개변수의 인자로 전달받아 빼기연산 후 출력하는 메소드를 정의

	public void minus(int a, int b) {
		long result = (long) a - b;
		System.out.println(a + "-" + b + "=" + result);
	}

	// 정수 두 개를 매개변수의 인자로 전달받아 곱하기연산 후 출력하는 메소드를 정의

	public void multiply(long a, long b) {
		long result = (long) a * b;
		System.out.println(a + "x" + b + "=" + result);
	}

	// 정수 두 개를 매개변수의 인자로 전달받아 나누기연산 후 출력하는 메소드를 정의

	public void divide(int a, int b) {
		long result = (long) a / b;
		System.out.println(a + "/" + b + "=" + result);
	}

	// 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 둘레를 구해 반환하는 메소드를 정의

	float circum(float r) {
		return 2 * PI * r;

	}

	// 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 넓이를 구해 반환하는 메소드를 정의

	float circleArea(float r) {
		return PI * r * r;
	}

	// main() 메소드를 정의하고 각각의 메소드를 호출해서 결과를 콘솔에 출력해봅시다.
	// 콘솔에서 사용자에게 데이터를 받아 메소드를 호출할 때 사용자에게 받은 데이터를 메소드의 매개변수의 인자로 전달하는 코드를 main() 메소드에 추가

	public static void main(String[] args) {
		Calculator cal = new Calculator("name");
		Scanner scanner = new Scanner(System.in);
		
		// 상수출력
		System.out.println("PI: " + cal.PI);
		System.out.println("User Name = " + cal.USER_NAME);
		
		
		
		System.out.println("첫 번째 정수를 입력하세요.");
		System.out.print("> ");
		int a = Integer.parseInt(scanner.nextLine());

		System.out.println("두 번째 정수를 입력하세요.");
		System.out.print("> ");
		int b = Integer.parseInt(scanner.nextLine());

		cal.plus(a, b);
		cal.minus(a, b);
		cal.multiply(a, b);
		cal.divide(a, b);

		System.out.println("---------------------------------");
		System.out.println("원의 반지름을 입력하세요.");
		System.out.print("> ");
		float r = Float.parseFloat(scanner.nextLine());
		
		System.out.println("전달받은 반지름: " + r);
		System.out.println("원의 둘레: " + cal.circum(r));
		System.out.println("원의 넓이: " + cal.circleArea(r));

	}

}
