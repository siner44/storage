package project;

public class SmartPhoneMain {
	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone();

		while (true) {
			showMain();
			
			int choice = Integer.parseInt(smartPhone.sc.nextLine());
			
			if(choice == 1) {
				System.out.println("연락처 등록");
				smartPhone.addContact();
			} else if(choice == 2) {
				System.out.println("연락처 목록");
				smartPhone.show();
			} else if(choice == 3) {
				System.out.println("연락처 검색");
				smartPhone.showIndex();
			} else if(choice == 4) {
				System.out.println("연락처 수정");
				smartPhone.edit();
			} else if(choice == 5) {
				System.out.println("연락처 삭제");
				smartPhone.remove();
			} else if(choice == 6) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

	static void showMain() {
		System.out.println("연락처 정보 프로그램");
		System.out.print("1. 연락처 저장  ");
		System.out.print("2. 연락처 목록  ");
		System.out.print("3. 연락처 검색  ");
		System.out.print("4. 연락처 수정  ");
		System.out.print("5. 연락처 삭제  ");
		System.out.print("6. 프로그램 종료\n");
		System.out.println("메뉴 번호 입력");
		System.out.print("> ");
	}
}
