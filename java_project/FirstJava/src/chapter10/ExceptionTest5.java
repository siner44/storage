package chapter10;

public class ExceptionTest5 {
	public static void main(String[] args) {

		try {
			System.out.println(10/0);
			return;
		}catch(Exception e) {
			System.out.println("예외 발생 = 예외 처리");
		}finally {
			System.out.println("예외 상황과 상관없이 실행");
		}
		
		try{
			System.out.println("try");
		} finally {
			System.out.println("finally");
		}
		

	}
}
