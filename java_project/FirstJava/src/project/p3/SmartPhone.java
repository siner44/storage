package project.p3;

import java.util.Scanner;

public class SmartPhone {

	public static Scanner sc = new Scanner(System.in);
	private Contact[] contact;
	private int numOfPeople;

	public SmartPhone() {
		contact = new Contact[10];
		numOfPeople = 0;
	}

	// 데이터 추가
	void add(Contact c) {
		contact[numOfPeople++] = c;
	}

	// 이름으로 배열의 index를 찾아 반환
	private int searchIndex(String name) {
		int index = -1;
		for (int i = 0; i < numOfPeople; i++) {
			if (contact[i].getName().equals(name)) {
				index = i;
				break;
			}
		}
		return index;
	}

	// 데이터 수정
	public void edit() {

		System.out.println("수정할 사람의 이름 입력");
		System.out.print("> ");
		String name = sc.nextLine();

		int index = searchIndex(name);

		if (index > -1) {
			if (contact[index].getGroup().equals("회사")) {
				System.out.println("연락처 데이터 입력");
				System.out.println("이름을 입력하세요");
				System.out.print("> ");
				name = sc.nextLine();

				System.out.println("전화번호를 입력하세요");
				System.out.print("> ");
				String phoneNumber = sc.nextLine();

				System.out.println("이메일을 입력하세요");
				System.out.print("> ");
				String mail = sc.nextLine();

				System.out.println("주소를 입력하세요");
				System.out.print("> ");
				String address = sc.nextLine();

				System.out.println("생일을 입력하세요");
				System.out.print("> ");
				String birthDay = sc.nextLine();

				System.out.println("그룹을 입력하세요");
				System.out.print("> ");
				String group = sc.nextLine();

				System.out.println("회사 이름을 입력하세요");
				System.out.print("> ");
				String companyName = sc.nextLine();

				System.out.println("부서 이름을 입력하세요");
				System.out.print("> ");
				String department = sc.nextLine();

				System.out.println("직급을 입력하세요");
				System.out.print("> ");
				String position = sc.nextLine();

				contact[index] = new CustomerContact(name, phoneNumber, mail, address, birthDay, group, companyName,
						department, position);
				System.out.println("수정 완료!");
			} else if (contact[index].getGroup().equals("거래처")) {
				System.out.println("연락처 데이터 입력");
				System.out.println("이름을 입력하세요");
				System.out.print("> ");
				name = sc.nextLine();

				System.out.println("전화번호를 입력하세요");
				System.out.print("> ");
				String phoneNumber = sc.nextLine();

				System.out.println("이메일을 입력하세요");
				System.out.print("> ");
				String mail = sc.nextLine();

				System.out.println("주소를 입력하세요");
				System.out.print("> ");
				String address = sc.nextLine();

				System.out.println("생일을 입력하세요");
				System.out.print("> ");
				String birthDay = sc.nextLine();

				System.out.println("그룹을 입력하세요");
				System.out.print("> ");
				String group = sc.nextLine();

				System.out.println("거래처 회사 이름을 입력하세요");
				System.out.print("> ");
				String companyName = sc.nextLine();

				System.out.println("거래 품목을 입력하세요");
				System.out.print("> ");
				String item = sc.nextLine();

				System.out.println("직급을 입력하세요");
				System.out.print("> ");
				String position = sc.nextLine();

				contact[index] = new CustomerContact(name, phoneNumber, mail, address, birthDay, group, companyName,
						item, position);
				System.out.println("수정 완료!");
			}
			System.out.println("연락처 데이터 입력");
			System.out.println("이름을 입력하세요");
			System.out.print("> ");
			name = sc.nextLine();

			System.out.println("전화번호를 입력하세요");
			System.out.print("> ");
			String phoneNumber = sc.nextLine();

			System.out.println("이메일을 입력하세요");
			System.out.print("> ");
			String mail = sc.nextLine();

			System.out.println("주소를 입력하세요");
			System.out.print("> ");
			String address = sc.nextLine();

			System.out.println("생일을 입력하세요");
			System.out.print("> ");
			String birthDay = sc.nextLine();

			System.out.println("그룹을 입력하세요");
			System.out.print("> ");
			String group = sc.nextLine();

			contact[index] = new Contact(name, phoneNumber, mail, address, birthDay, group);

			System.out.println("수정 완료!");
		} else {
			System.out.println("검색한 이름의 데이터가 존재하지 않음");
		}
	}

	// 데이터 삭제
	public void remove() {

		System.out.println("삭제할 사람의 이름 입력");
		System.out.print("> ");
		String name = sc.nextLine();

		int index = searchIndex(name);

		if (index > -1) {
			for (int i = index; i < numOfPeople - 1; i++) {
				contact[i] = contact[i + 1];
			}
			numOfPeople--;
			System.out.println("삭제 완료!");
		} else {
			System.out.println("검색한 이름의 데이터가 존재하지 않음");
		}
	}

	// 출력
	public void show() {
		System.out.println("이름\t번호\t이메일\t주소\t생일\t그룹");
		System.out.println("------------------------------------------------------------------");
		for (int i = 0; i < numOfPeople; i++) {
			System.out.println(contact[i]);
		}
		System.out.println();
	}

	// 개별 출력
	public void showIndex() {

		System.out.println("검색할 사람의 이름 입력");
		System.out.print("> ");
		String name = sc.nextLine();

		int index = searchIndex(name);

		if (index > -1) {
			if (contact[index].getGroup().equals("회사")) {
				System.out.println("이름\t번호\t이메일\t주소\t생일\t그룹\t회사 이름\t부서 이름\t직급");
				System.out.println(contact[index]);
			} else if (contact[index].getGroup().equals("거래처")) {
				System.out.println("이름\t번호\t이메일\t주소\t생일\t그룹\t회사 이름\t거래 품목\t직급");
				System.out.println(contact[index]);
			} else {
			System.out.println("이름\t번호\t이메일\t주소\t생일\t그룹");
			System.out.println(contact[index]);
			}
		} else {
			System.out.println("검색한 사람의 데이터가 존재하지 않음");
		}

	}

	// 정보 저장 후 배열에 저장
	public void addContact() {
		System.out.println("연락처 데이터 입력");
		System.out.println("-----------------------------");
		System.out.println("1. 친구 등록  2. 회사 동료 등록  3. 거래처 등록");
		int num = Integer.parseInt(sc.nextLine());

		if (num == 1) {
			System.out.println("이름을 입력하세요");
			System.out.print("> ");
			String name = sc.nextLine();

			System.out.println("전화번호를 입력하세요");
			System.out.print("> ");
			String phoneNumber = sc.nextLine();

			System.out.println("이메일을 입력하세요");
			System.out.print("> ");
			String mail = sc.nextLine();

			System.out.println("주소를 입력하세요");
			System.out.print("> ");
			String address = sc.nextLine();

			System.out.println("생일을 입력하세요");
			System.out.print("> ");
			String birthDay = sc.nextLine();

			System.out.println("그룹을 입력하세요");
			System.out.print("> ");
			String group = sc.nextLine();

			add(new Contact(name, phoneNumber, mail, address, birthDay, group));

			System.out.println("입력 완료");
		} else if (num == 2) {
			company();
		} else if (num == 3) {
			customer();
		}
	}

	public void company() {
		System.out.println("이름을 입력하세요");
		System.out.print("> ");
		String name = sc.nextLine();

		System.out.println("전화번호를 입력하세요");
		System.out.print("> ");
		String phoneNumber = sc.nextLine();

		System.out.println("이메일을 입력하세요");
		System.out.print("> ");
		String mail = sc.nextLine();

		System.out.println("주소를 입력하세요");
		System.out.print("> ");
		String address = sc.nextLine();

		System.out.println("생일을 입력하세요");
		System.out.print("> ");
		String birthDay = sc.nextLine();

		System.out.println("그룹을 입력하세요");
		System.out.print("> ");
		String group = sc.nextLine();

		System.out.println("회사 이름을 입력하세요");
		System.out.print("> ");
		String companyName = sc.nextLine();

		System.out.println("부서 이름을 입력하세요");
		System.out.print("> ");
		String department = sc.nextLine();

		System.out.println("직급을 입력하세요");
		System.out.print("> ");
		String position = sc.nextLine();

		add(new CompanyContact(name, phoneNumber, mail, address, birthDay, group, companyName, department, position));

		System.out.println("입력 완료");
	}

	public void customer() {
		System.out.println("이름을 입력하세요");
		System.out.print("> ");
		String name = sc.nextLine();

		System.out.println("전화번호를 입력하세요");
		System.out.print("> ");
		String phoneNumber = sc.nextLine();

		System.out.println("이메일을 입력하세요");
		System.out.print("> ");
		String mail = sc.nextLine();

		System.out.println("주소를 입력하세요");
		System.out.print("> ");
		String address = sc.nextLine();

		System.out.println("생일을 입력하세요");
		System.out.print("> ");
		String birthDay = sc.nextLine();

		System.out.println("그룹을 입력하세요");
		System.out.print("> ");
		String group = sc.nextLine();

		System.out.println("거래처 회사 이름을 입력하세요");
		System.out.print("> ");
		String companyName = sc.nextLine();

		System.out.println("거래 품목을 입력하세요");
		System.out.print("> ");
		String item = sc.nextLine();

		System.out.println("직급을 입력하세요");
		System.out.print("> ");
		String position = sc.nextLine();

		add(new CustomerContact(name, phoneNumber, mail, address, birthDay, group, companyName, item, position));

		System.out.println("입력 완료");
	}

}
