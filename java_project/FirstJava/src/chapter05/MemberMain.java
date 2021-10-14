package chapter05;

public class MemberMain {
	public static void main(String[] args) {
		// 회원의 정보를 저장하는 프로그램
		// 데이터를 저장할 수 있는 구조(클래스)
		// Member 클래스로 인스턴스를 생성하면 데이터를 저장하는 것과 같음.
		
		Member member1 = new Member("신승민", "010-1111-2222", "국문학", 2, "sin22@gmail.com", "2000.02.02", "경기도");
		
		// 객체의 정보 데이터 출력
		member1.printMember();
		
		System.out.println("------------------------------------------");
		
		Member member2 = new Member("홍길동", "010-1234-1234", "수학", 3, "asd@gmail.com");
		
		member2.printMember();
		
		
		
	}

}
