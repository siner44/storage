package chapter05;

public class Member {
	String name;
	String phoneNumber;
	String major;
	int grade;
	String mail;
	String birth;
	String address;

	public Member(String name, String phoneNumber, String major, int grade, String mail, String birth, String address) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.mail = mail;
		this.birth = birth;
		this.address = address;
	}

	public Member(String name, String phoneNumber, String major, int grade, String mail) {
		this(name, phoneNumber, major, grade, mail, null, null);
		// this.name = name;
		// this.phoneNumber = phoneNumber;
		// this.major = major;
		// this.grade = grade;
		// this.mail = mail;
	}
	
	public Member() {
	}
	
	void printMember() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phoneNumber);
		System.out.println("전공: " + major);
		System.out.println("학년: " + grade + "학년");
		System.out.println("이메일: " + mail);
		System.out.println("생일: " + birth);
		System.out.println("주소: " + address);

		if (birth == null) {
			System.out.println("생일: 생일정보 없음");
		} else {
			System.out.println("생일: " + birth);
		}

		if (address == null) {
			System.out.println("주소: 주소정보 없음");
		} else {
			System.out.println("주소: " + address);
		}

	}
}