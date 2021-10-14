package chapter05;

public class Member {
	String name;
	String phoneNumber;
	String major;
	int grade;
	String mail;
	String birth;
	String address;

	Member(String name, String phoneNumber, String major, int grade, String mail) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.mail = mail;
		
	}
	
	Member(String name, String phoneNumber, String major, int grade, String mail, String birth, String address) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.mail = mail;
		this.birth = birth;
		this.address = address;
	}
	
	void printMember() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phoneNumber);
		System.out.println("전공: " + major);
		System.out.println("학년: " + grade + "학년");
		System.out.println("이메일: " + mail);
		System.out.println("생일: " + birth);
		System.out.println("주소: " + address);
	}

	public static void main(String[] args) {

		Member member = new Member("신승민", "010-0000-0000", "국어", 4, "asd123@gmail.com");
		Member member2 = new Member("홍길동", "010-0000-0000", "수학", 2, "fgh456@gmail.com", "01.01", "서울시 강남구");

		member.printMember();
		System.out.println("---------------------------------");
		member2.printMember();
	}

}
