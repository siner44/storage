package project;

import java.util.Scanner;

public class ContactTest {
	// main() 메소드 정의
	public static void main(String[] args) {
		// 연락처 데이터를 저장하는 인스턴스 생성
		Contact contact = new Contact("김철수", "010-0000-0000", "kim00@gmail.com", "서울시 강남구", "1999.11.11", "비트캠프");

		// 변수 값을 반환하는 각각의 메소드를 호출해서 각 데이터를 출력문으로 출력
		System.out.println("이름: " + contact.getName());
		System.out.println("전화번호: " + contact.getPhoneNumber());
		System.out.println("이메일: " + contact.getMail());
		System.out.println("주소: " + contact.getAddress());
		System.out.println("생일: " + contact.getBirthDay());
		System.out.println("그룹: " + contact.getGroup());

		// 생성된 인스턴스의 정보 출력 메소드를 호출
		System.out.println("-------------------------------------");
		contact.printContact();

		Scanner scanner = new Scanner(System.in);

		// 인스턴스의 각 변수에 값을 바꾸는 메소드를 이용해서 데이터를 수정
		System.out.println("-------------------------------------");
		System.out.println("이름을 입력하세요");
		System.out.print("> ");
		String name = scanner.nextLine();

		System.out.println("전화번호를 입력하세요");
		System.out.print("> ");
		String phoneNumber = scanner.nextLine();

		System.out.println("이메일을 입력하세요");
		System.out.print("> ");
		String mail = scanner.nextLine();

		System.out.println("주소를 입력하세요");
		System.out.print("> ");
		String address = scanner.nextLine();

		System.out.println("생일을 입력하세요");
		System.out.print("> ");
		String birthDay = scanner.nextLine();

		System.out.println("그룹을 입력하세요");
		System.out.println("> ");
		String group = scanner.nextLine();

		contact.setName(name);
		contact.setPhoneNumber(phoneNumber);
		contact.setMail(mail);
		contact.setAddress(address);
		contact.setBirthDay(birthDay);
		contact.setGroup(group);

		// 인스턴스의 출력 메소드를 다시 실행
		System.out.println("-------------------------------------");
		contact.printContact();
		System.out.println("-------------------------------------");
	}
}
