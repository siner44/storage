package exam.person;

import java.util.Calendar;

public class Person {

	String name;
	String idNum;

	Person() {
	}

	public Person(String name, String idNum) {
		this.name = name;
		this.idNum = idNum;
	}

	int age() {
		String num = "";
		if (idNum.charAt(7) == '1' || idNum.charAt(7) == '2') {
			num = "19";
		} else if (idNum.charAt(7) == '3' || idNum.charAt(7) == '4') {
			num = "20";
		}

		num += idNum.charAt(0);
		num += idNum.charAt(1);
		int birthYear = Integer.parseInt(num);

		return Calendar.getInstance().get(Calendar.YEAR) - birthYear - 1;

	}

	void print() {
		System.out.println("안녕하세요. 저는 " + name + "입니다." + "나이는 " + age() + "살 입니다.");
	}

}
