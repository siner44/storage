package chapter05;

public class Member {
	 String name;
	 String phoneNumber;
	 String major;
	 int grade;
	 String mail;
	 String birth;
	 String address;

	void printMember() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phoneNumber);
		System.out.println("전공: " + major);
		System.out.println("학년: " + grade);
		System.out.println("이메일: " + mail);
		System.out.println("생일: " + birth);
		System.out.println("주소: " + address);
	}

	Member() {
		
	}
	
	Member(String birth, String address) {
		this.birth = birth;
		this.address = address;
	}

	public static void main(String[] args) {
		
		String birth = "2000.01.01";
		String address = "서울시 강남구";
		
		Member member = new Member();
		Member member2 = new Member(birth, address);
		
		member.printMember();
		System.out.println("---------------------------------");
		member2.printMember();
	}

}
