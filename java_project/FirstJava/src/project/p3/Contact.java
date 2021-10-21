package project.p3;

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

	Contact(String name, String phoneNumber, String mail, String address, String birthDay, String group) {
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
		return name + "\t" + phoneNumber + "\t" + mail + "\t" + address + "\t" + birthDay + "\t" + group;
	}
}
