package innerclass;

public class Local02 {
	int a = 100;
	
	public void innertest() {
		class Inner{
			public void getdata() {
				System.out.println("변경 전 a 값 : " + a);
				System.out.println();
				a = 1000;
				System.out.println("변경 후 a 값 : " + a);
			}
		}
		
		Inner i = new Inner();
		i.getdata();
	}
	
	public static void main(String[] args) {
		Local02 l = new Local02();
		l.innertest();
	}
	
}
