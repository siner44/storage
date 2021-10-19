package exam.calculator;

abstract class CalculateAbstract implements Calculator {

	@Override
	public abstract long add(long n1, long n2);

	@Override
	public abstract long substract(long n1, long n2);

	@Override
	public abstract long multiply(long n1, long n2); 
	
	@Override
	public abstract double divide(double n1, double n2);
}
