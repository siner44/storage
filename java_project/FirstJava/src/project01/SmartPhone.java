package project01;

import java.util.Arrays;
import java.util.Scanner;

public class SmartPhone {

	Contact[] arr;

	public SmartPhone() {
		arr = new Contact[10];

	}

	void add(Contact contact) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = contact;
				i = arr.length;
			}
		}
	}

	Contact[] edit(int index) {
		if (arr[index - 1] != null) {
			arr[index - 1] = new Contact();
		}
		return arr;
	}

	Contact[] remove(int index) {
		arr[index - 1] = new Contact();

		return arr;
	}

	void show() {
		for(int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone();
		Contact contact = new Contact();
		Scanner scanner = new Scanner(System.in);

		//for (int i = 0; i < smartPhone.arr.length; i++) {
			
	//		System.out.println(i+1);
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
			
			smartPhone.add(contact);
		//}

		smartPhone.show();

	}

}
