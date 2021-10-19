package chapter07;

// 추상 클래스를 상속해서 새로운 클래스를 정의
public class CafeFriend extends Friend{
	
	String cafeName;

	public CafeFriend(String name, String phoneNumber, String address, String cafeName) {
		super(name, phoneNumber, address);
		this.cafeName = cafeName;
	}

	// 반드시 추상 메소드를 완성시켜야 인스턴스 생성이 가능
	@Override
	public void showBasicInfo() {
		System.out.println("이름: " + name + "번호: " + phoneNumber + "모임 이름: " + cafeName);
	}
	
	
	
}
