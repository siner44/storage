package innerclass;

public class Local01 {
	public void innertest() {
		class Inner{
			public void getdata() {
				System.out.println("getdata 메소드");
			}
		}
		
		Inner i = new Inner();
		
		i.getdata();
	}
	public static void main(String[] args) {
		Local01 l = new Local01();
		l.innertest();
	}
}
