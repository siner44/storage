package stream;

public class PrintfEx {
	public static void main(String[] args) {

		int number = 500;
		float Float = 3.14f;
		
		System.out.printf("%d 입금\n",500); //%d는 정수
		System.out.printf("%d 입금\n",number); //변수 사용
		
		System.out.printf("%s","문자열 입력 가능.\n"); //%s 문자열	
		System.out.printf("%f 파이라고 표현.\n",Float); //%f 실수
	}
}
