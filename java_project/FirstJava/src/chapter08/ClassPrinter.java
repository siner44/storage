package chapter08;

public class ClassPrinter {

	public static void print(Object obj) {

		// 전달받은 객체의 toString() 출력
		String str = obj.toString();

		// 해당 객체가 UpperCasePrintable을 구현하고 있는지 체크
		// 구현하고 있다면 대문자로 출력
		if (obj instanceof UpperCasePrintable) {
			str = str.toUpperCase();
		}

		System.out.println(str);

	}

}
