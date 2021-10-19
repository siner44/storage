package exam.calculator;

public class CalculatorClass implements Calculator {
	
	long n1;
	long n2;
	
	CalculatorClass(){
		n1 = 44;
		n2 = 57;
	}
	
	@Override
	public long add(long n1, long n2) {
		return n1 + n2;
	}

	@Override
	public long substract(long n1, long n2) {
		return n1 - n2;
	}

	@Override
	public long multiply(long n1, long n2) {
		return n1 * n2;
	}

	@Override
	public double divide(double n1, double n2) {
		return n1 / n2;
	}
	
	void show() {
		System.out.println("더하기: " + add(n1, n2));
		System.out.println("빼기: " + substract(n1, n2));
		System.out.println("곱하기: " + multiply(n1, n2));
		System.out.println("나누기: " + divide(n1, n2));
	}
	
}
