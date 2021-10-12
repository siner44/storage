package chapter02;

public class personMain {

	public static void main(String[] args) {

		// person 클래스의 인스턴스 생성
		Person p = new Person();

		// p.memberName = "신";
		p.setMemberName("신");
		p.setPhoneNumber("010-0000-0000");
		p.setJuminNumber(9901010999999L);

		System.out.println("이름: " + p.getMemberName());
		System.out.println("전화번호: " + p.getPhoneNumber());
		System.out.println("주민번호: " + p.getJuminNumber());

		System.out.println("--------------------------------");
		p.printData();

	}

}
