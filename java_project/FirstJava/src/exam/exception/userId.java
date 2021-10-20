package exam.exception;

import java.util.Scanner;

public class userId {
	public static void main(String[] args) {

		System.out.println("아이디를 입력하세요.");
		try {
			String id = getId();
		} catch (BadIdInputException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		Scanner sc = new Scanner(System.in);

		System.out.println("태어난 년도를 입력하세요.");

		try {
			int birth = sc.nextInt();
			System.out.println("태어난 년도는 " + birth + "입니다.");
		} catch (Exception e) {
			System.out.println("숫자를 입력해주세요.");
		}
	}

	public static String getId() throws BadIdInputException {
		Scanner sc = new Scanner(System.in);

		String id = sc.nextLine();

		if (!(id.matches("^[0-9]+$") || id.matches("[a-z A-Z]*$"))) {
			BadIdInputException e = new BadIdInputException();
			throw e;
		}
		return id;
	}
}
