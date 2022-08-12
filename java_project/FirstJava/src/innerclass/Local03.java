package innerclass;

public class Local03 {
	int a = 10; 
	
	public void innertest() {
		int b = 100;
		
		class Inner {
			public void getdata() {
				System.out.println("a : " + a);
				System.out.println("b : " + b);
			}
		}
		
		Inner i = new Inner();
		i.getdata();
	}
	
	public static void main(String[] args) {
		Local03 l = new Local03();
		l.innertest();
	}
	
}
