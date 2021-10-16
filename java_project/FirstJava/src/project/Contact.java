package project;

import java.util.Scanner;

public class Contact {
	// 변수 캡슐화
	private String name;
	private String phoneNumber;
	private String mail;
	private String address;
	private String birthDay;
	private String group;

	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	// 생성자 정의
	Contact() {

	}
	
	Contact(String name, String phoneNumber, String mail, String address, String birthDay,String group){
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.mail = mail;
		this.address = address;
		this.birthDay = birthDay;
		this.group = group;
	}

	// 데이터 출력
	void printContact() {
		System.out.println("이름: " + getName());
		System.out.println("전화번호: " + getPhoneNumber());
		System.out.println("이메일: " + getMail());
		System.out.println("주소: " + getAddress());
		System.out.println("생일: " + getBirthDay());
		System.out.println("그룹: " + getGroup());
	}
	
	public String toString() {
		return name+"\t"+phoneNumber+"\t"+mail+"\t"+address+"\t"+birthDay+"\t"+group ;

	}

	// main() 메소드 정의
	public static void main(String[] args) {
		// 연락처 데이터를 저장하는 인스턴스 생성
		Contact contact = new Contact();

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
