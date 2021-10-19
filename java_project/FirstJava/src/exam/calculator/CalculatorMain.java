package exam.calculator;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator c = new CalculatorClass();

		long n1 = 44;
		long n2 = 56;

		System.out.println("더하기: " + n1 + "+" + n2 + "=" + c.add(n1, n2));
		System.out.println("빼기: " + n1 + "-" + n2 + "=" + c.substract(n1, n2));
		System.out.println("곱하기: " + n1 + "*" + n2 + "=" + c.multiply(n1, n2));
		System.out.println("나누기: " + n1 + "/" + n2 + "=" + c.divide(n1, n2));

	}
}
