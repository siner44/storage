package project.p6;

import java.util.Scanner;
import java.util.regex.Pattern;

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
		check(name);

		int index = searchIndex(name);

		if (index > -1) {
			System.out.println("연락처 데이터 입력");
			System.out.println("이름을 입력하세요");
			System.out.print("> ");
			name = sc.nextLine();
			check(name);

			System.out.println("전화번호를 입력하세요");
			System.out.print("> ");
			String phoneNumber = sc.nextLine();
			check(phoneNumber);
			checkNum(phoneNumber);

			System.out.println("이메일을 입력하세요");
			System.out.print("> ");
			String mail = sc.nextLine();
			check(mail);

			System.out.println("주소를 입력하세요");
			System.out.print("> ");
			String address = sc.nextLine();
			check(address);

			System.out.println("생일을 입력하세요");
			System.out.print("> ");
			String birthDay = sc.nextLine();
			check(birthDay);

			System.out.println("그룹을 입력하세요");
			System.out.print("> ");
			String group = sc.nextLine();
			check(group);

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

			System.out.println("이름\t번호\t이메일\t주소\t생일\t그룹");
			System.out.println(contact[index]);

		} else {
			System.out.println("검색한 사람의 데이터가 존재하지 않음");
		}

	}

	// 정보 저장 후 배열에 저장
	public void addContact() {

		System.out.println("연락처 데이터 입력");
		System.out.println("-----------------------------");

		System.out.println("이름을 입력하세요");
		System.out.print("> ");
		String name = getName();

		System.out.println("전화번호를 입력하세요");
		System.out.print("> ");
		String phoneNumber = checkPhoneNumber();

		System.out.println("이메일을 입력하세요");
		System.out.print("> ");
		String mail = sc.nextLine();
		check(mail);
		
		System.out.println("주소를 입력하세요");
		System.out.print("> ");
		String address = sc.nextLine();
		check(address);

		System.out.println("생일을 입력하세요");
		System.out.print("> ");
		String birthDay = sc.nextLine();
		check(birthDay);

		System.out.println("그룹을 입력하세요");
		System.out.print("> ");
		String group = sc.nextLine();
		check(group);

		add(new Contact(name, phoneNumber, mail, address, birthDay, group));

		System.out.println("입력 완료");
	}

	private String getName() {
		String result = null;

		while (true) {
			result = sc.nextLine().trim();

			if (result.length() > 0) {
				boolean check = false;

				for (int i = 0; i < result.length(); i++) {
					char c = result.charAt(i);
					boolean c1 = c >= 'a' && c <= 'z';
					boolean c2 = c >= 'A' && c <= 'Z';
					boolean c3 = c >= '가' && c <= '힣';

					if (c1 || c2 || c3) {
						BadNameInputException bne = new BadNameInputException("영문자 또는 한글만 입력 가능합니다. 다시 입력해주세요");
						try {
							throw bne;
						} catch (BadNameInputException e) {
							System.out.println(e.getMessage());
							check = true;
							break;
						}
					}
				}
				if(!check) {
					break;
				}
			} else {
				BadNameInputException bne = new BadNameInputException("공백 입력은 허용하지 않습니다.");
				try {
					throw bne;
				} catch (BadNameInputException e) {
					System.out.println(e.getMessage());
					System.out.println("이름을 다시 입력해주세요.");
				}
			}

		}

		return result;
	}

	String check(String s) {

		while (s.isEmpty()) {
			System.out.println("내용이 입력되지 않았습니다. 다시 입력해주세요.");
			System.out.print("> ");
			s = sc.nextLine();
		}

		return s;
	}

	String checkNum(String s) {
		for (int i = 0; i < numOfPeople; i++) {
			while (contact[i].getPhoneNumber().equals(s)) {
				System.out.println("중복된 번호입니다.");
				System.out.println("전화번호를 입력하세요.");
				System.out.print("> ");
				s = sc.nextLine();
			}
		}
		return s;
	}
	private String checkPhoneNumber() {

		String number = null;

		while (true) {
			
			number = sc.nextLine().trim();
			// 전화번호 존재 체크
			boolean chk = false;
			if (number.length() > 0) {

				try {
					
					// 전화번호 형식 체크
					String pattern = "^[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}$";
					// 정규식으로 문자열 패턴 체크
					boolean regex = Pattern.matches(pattern, number);
					
					// 패턴과 맞지 않을 때 예외 처리!
					if(!regex) {
						throw new PhoneNumberPatternException();
					}
					
					for (int i = 0; i < numOfPeople; i++) {
						if (contact[i].getPhoneNumber().equals(number)) {
							// 예외 처리
							throw new DuplicatePhoneNumberException();
						}
					}
					
				} catch (DuplicatePhoneNumberException | PhoneNumberPatternException e) {
					chk = true;
					System.out.println(e.getMessage()+" 다시 입력하세요.");
					//break;
				} 

				// 같은 번호가 존재하면 while문을 벗어나지 않는다
				if (!chk) {
					break;
				}
			} else {
				System.out.println("공백문자를 허용하지 않습니다. 다시입력하세요.");
			}
		}
		return number;
	}
}